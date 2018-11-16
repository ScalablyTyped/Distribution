package typings
package atFirebaseDatabaseLib.distSrcCoreViewCompleteChildSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "NoCompleteChildSource_")
@js.native
class `NoCompleteChildSource_` () extends CompleteChildSource {
  /**
       * @inheritDoc
       */
  def getChildAfterChild(): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode | scala.Null = js.native
  /**
       * @inheritDoc
       */
  def getChildAfterChild(index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode | scala.Null = js.native
  /**
       * @inheritDoc
       */
  def getChildAfterChild(
    index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index,
    child: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode | scala.Null = js.native
  /**
       * @param {!Index} index
       * @param {!NamedNode} child
       * @param {boolean} reverse
       * @return {?NamedNode}
       */
  /* CompleteClass */
  override def getChildAfterChild(
    index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index,
    child: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode,
    reverse: scala.Boolean
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode | scala.Null = js.native
  /**
       * @inheritDoc
       */
  def getCompleteChild(): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
       * @param {!string} childKey
       * @return {?Node}
       */
  /* CompleteClass */
  override def getCompleteChild(childKey: java.lang.String): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
}

