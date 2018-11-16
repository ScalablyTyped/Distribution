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

