package typings.expoAsset

import typings.expoAsset.assetMod.AssetDescriptor
import typings.expoAsset.assetMod.AssetMetadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def useAssets(moduleIds: js.Array[Double]): js.Tuple2[js.UndefOr[js.Array[typings.expoAsset.assetMod.Asset]], js.UndefOr[Error]] = js.native
  def useAssets(moduleIds: Double): js.Tuple2[js.UndefOr[js.Array[typings.expoAsset.assetMod.Asset]], js.UndefOr[Error]] = js.native
  
  @js.native
  class Asset protected ()
    extends typings.expoAsset.assetMod.Asset {
    def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
  }
  /* static members */
  @js.native
  object Asset extends js.Object {
    
    def fromMetadata(meta: AssetMetadata): typings.expoAsset.assetMod.Asset = js.native
    
    def fromModule(virtualAssetModule: String): typings.expoAsset.assetMod.Asset = js.native
    def fromModule(virtualAssetModule: Double): typings.expoAsset.assetMod.Asset = js.native
    
    def fromURI(uri: String): typings.expoAsset.assetMod.Asset = js.native
    
    def loadAsync(moduleId: String): js.Promise[js.Array[typings.expoAsset.assetMod.Asset]] = js.native
    def loadAsync(moduleId: js.Array[Double | String]): js.Promise[js.Array[typings.expoAsset.assetMod.Asset]] = js.native
    def loadAsync(moduleId: Double): js.Promise[js.Array[typings.expoAsset.assetMod.Asset]] = js.native
  }
}
