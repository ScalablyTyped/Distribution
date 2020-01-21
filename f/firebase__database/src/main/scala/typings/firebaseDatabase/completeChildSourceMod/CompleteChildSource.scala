package typings.firebaseDatabase.completeChildSourceMod

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteChildSource extends js.Object {
  /**
    * @param {!Index} index
    * @param {!NamedNode} child
    * @param {boolean} reverse
    * @return {?NamedNode}
    */
  def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null
  /**
    * @param {!string} childKey
    * @return {?Node}
    */
  def getCompleteChild(childKey: String): Node | Null
}

object CompleteChildSource {
  @scala.inline
  def apply(
    getChildAfterChild: (Index, NamedNode, Boolean) => NamedNode | Null,
    getCompleteChild: String => Node | Null
  ): CompleteChildSource = {
    val __obj = js.Dynamic.literal(getChildAfterChild = js.Any.fromFunction3(getChildAfterChild), getCompleteChild = js.Any.fromFunction1(getCompleteChild))
  
    __obj.asInstanceOf[CompleteChildSource]
  }
}

