package typings
package atFirebaseDatabaseLib.distSrcCoreViewCompleteChildSourceMod

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
  def getChildAfterChild(
    index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index,
    child: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode,
    reverse: scala.Boolean
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode | scala.Null
  /**
    * @param {!string} childKey
    * @return {?Node}
    */
  def getCompleteChild(childKey: java.lang.String): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null
}

object CompleteChildSource {
  @scala.inline
  def apply(
    getChildAfterChild: (atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index, atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode, scala.Boolean) => atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode | scala.Null,
    getCompleteChild: java.lang.String => atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null
  ): CompleteChildSource = {
    val __obj = js.Dynamic.literal(getChildAfterChild = js.Any.fromFunction3(getChildAfterChild), getCompleteChild = js.Any.fromFunction1(getCompleteChild))
  
    __obj.asInstanceOf[CompleteChildSource]
  }
}

