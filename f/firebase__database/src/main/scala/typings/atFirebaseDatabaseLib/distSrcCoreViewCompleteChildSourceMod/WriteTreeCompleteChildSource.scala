package typings
package atFirebaseDatabaseLib.distSrcCoreViewCompleteChildSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "WriteTreeCompleteChildSource")
@js.native
class WriteTreeCompleteChildSource protected () extends CompleteChildSource {
  /**
    * @param {!WriteTreeRef} writes_
    * @param {!ViewCache} viewCache_
    * @param {?Node} optCompleteServerCache_
    */
  def this(`writes_`: atFirebaseDatabaseLib.distSrcCoreWriteTreeMod.WriteTreeRef, `viewCache_`: atFirebaseDatabaseLib.distSrcCoreViewViewCacheMod.ViewCache) = this()
  def this(`writes_`: atFirebaseDatabaseLib.distSrcCoreWriteTreeMod.WriteTreeRef, `viewCache_`: atFirebaseDatabaseLib.distSrcCoreViewViewCacheMod.ViewCache, `optCompleteServerCache_`: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node) = this()
  var `optCompleteServerCache_`: js.Any = js.native
  var `viewCache_`: js.Any = js.native
  var `writes_`: js.Any = js.native
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
    * @param {!string} childKey
    * @return {?Node}
    */
  /* CompleteClass */
  override def getCompleteChild(childKey: java.lang.String): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
}

