package typings.expoAsset

import typings.expoAsset.assetMod.AssetDescriptor
import typings.expoAsset.assetMod.AssetMetadata
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-asset", "Asset")
  @js.native
  class Asset protected ()
    extends typings.expoAsset.assetMod.Asset {
    def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
  }
  /* static members */
  object Asset {
    
    @JSImport("expo-asset", "Asset")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-asset", "Asset.byHash")
    @js.native
    def byHash: js.Object = js.native
    @scala.inline
    def byHash_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byHash")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-asset", "Asset.byUri")
    @js.native
    def byUri: js.Object = js.native
    @scala.inline
    def byUri_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byUri")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-asset", "Asset.fromMetadata")
    @js.native
    def fromMetadata(meta: AssetMetadata): typings.expoAsset.assetMod.Asset = js.native
    
    @JSImport("expo-asset", "Asset.fromModule")
    @js.native
    def fromModule(virtualAssetModule: String): typings.expoAsset.assetMod.Asset = js.native
    @JSImport("expo-asset", "Asset.fromModule")
    @js.native
    def fromModule(virtualAssetModule: Double): typings.expoAsset.assetMod.Asset = js.native
    
    @JSImport("expo-asset", "Asset.fromURI")
    @js.native
    def fromURI(uri: String): typings.expoAsset.assetMod.Asset = js.native
    
    @JSImport("expo-asset", "Asset.loadAsync")
    @js.native
    def loadAsync(moduleId: String): js.Promise[js.Array[typings.expoAsset.assetMod.Asset]] = js.native
    @JSImport("expo-asset", "Asset.loadAsync")
    @js.native
    def loadAsync(moduleId: js.Array[Double | String]): js.Promise[js.Array[typings.expoAsset.assetMod.Asset]] = js.native
    @JSImport("expo-asset", "Asset.loadAsync")
    @js.native
    def loadAsync(moduleId: Double): js.Promise[js.Array[typings.expoAsset.assetMod.Asset]] = js.native
  }
  
  @JSImport("expo-asset", "useAssets")
  @js.native
  def useAssets(moduleIds: js.Array[Double]): js.Tuple2[js.UndefOr[js.Array[typings.expoAsset.assetMod.Asset]], js.UndefOr[Error]] = js.native
  @JSImport("expo-asset", "useAssets")
  @js.native
  def useAssets(moduleIds: Double): js.Tuple2[js.UndefOr[js.Array[typings.expoAsset.assetMod.Asset]], js.UndefOr[Error]] = js.native
}
