package typings.expoAsset

import typings.expoAsset.assetMod.AssetDescriptor
import typings.expoAsset.assetMod.AssetMetadata
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-asset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    inline def byHash_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byHash")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-asset", "Asset.byUri")
    @js.native
    def byUri: js.Object = js.native
    inline def byUri_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byUri")(x.asInstanceOf[js.Any])
    
    inline def fromMetadata(meta: AssetMetadata): typings.expoAsset.assetMod.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMetadata")(meta.asInstanceOf[js.Any]).asInstanceOf[typings.expoAsset.assetMod.Asset]
    
    inline def fromModule(virtualAssetModule: String): typings.expoAsset.assetMod.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromModule")(virtualAssetModule.asInstanceOf[js.Any]).asInstanceOf[typings.expoAsset.assetMod.Asset]
    inline def fromModule(virtualAssetModule: Double): typings.expoAsset.assetMod.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromModule")(virtualAssetModule.asInstanceOf[js.Any]).asInstanceOf[typings.expoAsset.assetMod.Asset]
    
    inline def fromURI(uri: String): typings.expoAsset.assetMod.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURI")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.expoAsset.assetMod.Asset]
    
    inline def loadAsync(moduleId: String): js.Promise[js.Array[typings.expoAsset.assetMod.Asset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.expoAsset.assetMod.Asset]]]
    inline def loadAsync(moduleId: js.Array[Double | String]): js.Promise[js.Array[typings.expoAsset.assetMod.Asset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.expoAsset.assetMod.Asset]]]
    inline def loadAsync(moduleId: Double): js.Promise[js.Array[typings.expoAsset.assetMod.Asset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.expoAsset.assetMod.Asset]]]
  }
  
  inline def useAssets(moduleIds: js.Array[Double]): js.Tuple2[js.UndefOr[js.Array[typings.expoAsset.assetMod.Asset]], js.UndefOr[Error]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAssets")(moduleIds.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[js.Array[typings.expoAsset.assetMod.Asset]], js.UndefOr[Error]]]
  inline def useAssets(moduleIds: Double): js.Tuple2[js.UndefOr[js.Array[typings.expoAsset.assetMod.Asset]], js.UndefOr[Error]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAssets")(moduleIds.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[js.Array[typings.expoAsset.assetMod.Asset]], js.UndefOr[Error]]]
}
