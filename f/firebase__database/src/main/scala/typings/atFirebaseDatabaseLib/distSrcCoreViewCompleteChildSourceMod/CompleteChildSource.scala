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
    getChildAfterChild: js.Function3[
      atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index, 
      atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode, 
      scala.Boolean, 
      atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode | scala.Null
    ],
    getCompleteChild: js.Function1[java.lang.String, atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null]
  ): CompleteChildSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getChildAfterChild")(getChildAfterChild)
    __obj.updateDynamic("getCompleteChild")(getCompleteChild)
    __obj.asInstanceOf[CompleteChildSource]
  }
}

