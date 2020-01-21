package typings.firebaseDatabase.completeChildSourceMod

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "NoCompleteChildSource_")
@js.native
class NoCompleteChildSource () extends CompleteChildSource {
  /**
    * @inheritDoc
    */
  def getChildAfterChild(): NamedNode | Null = js.native
  def getChildAfterChild(index: Index): NamedNode | Null = js.native
  def getChildAfterChild(index: Index, child: NamedNode): NamedNode | Null = js.native
  /**
    * @param {!Index} index
    * @param {!NamedNode} child
    * @param {boolean} reverse
    * @return {?NamedNode}
    */
  /* CompleteClass */
  override def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
  /**
    * @inheritDoc
    */
  def getCompleteChild(): Node | Null = js.native
  /**
    * @param {!string} childKey
    * @return {?Node}
    */
  /* CompleteClass */
  override def getCompleteChild(childKey: String): Node | Null = js.native
}

