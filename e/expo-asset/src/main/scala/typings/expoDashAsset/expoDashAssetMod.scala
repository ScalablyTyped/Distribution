package typings.expoDashAsset

import typings.expoDashAsset.buildAssetMod.AssetDescriptor
import typings.expoDashAsset.buildAssetMod.AssetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-asset", JSImport.Namespace)
@js.native
object expoDashAssetMod extends js.Object {
  @js.native
  class Asset protected ()
    extends typings.expoDashAsset.buildAssetMod.Asset {
    def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
  }
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromMetadata(meta: AssetMetadata): typings.expoDashAsset.buildAssetMod.Asset = js.native
    def fromModule(virtualAssetModule: String): typings.expoDashAsset.buildAssetMod.Asset = js.native
    def fromModule(virtualAssetModule: Double): typings.expoDashAsset.buildAssetMod.Asset = js.native
    def fromURI(uri: String): typings.expoDashAsset.buildAssetMod.Asset = js.native
    def loadAsync(moduleId: js.Array[Double]): js.Promise[js.Array[Unit]] = js.native
    def loadAsync(moduleId: Double): js.Promise[js.Array[Unit]] = js.native
  }
  
}

