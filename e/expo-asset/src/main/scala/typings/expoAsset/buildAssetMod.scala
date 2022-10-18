package typings.expoAsset

import typings.expoAsset.buildAssetSourcesMod.AssetMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAssetMod {
  
  @JSImport("expo-asset/build/Asset", "Asset")
  @js.native
  open class Asset protected () extends StObject {
    def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
    
    /**
      * @private
      */
    var _downloadCallbacks: js.Array[DownloadPromiseCallbacks] = js.native
    
    /**
      * Downloads the asset data to a local file in the device's cache directory. Once the returned
      * promise is fulfilled without error, the [`localUri`](#assetlocaluri) field of this asset points
      * to a local file containing the asset data. The asset is only downloaded if an up-to-date local
      * file for the asset isn't already present due to an earlier download. The downloaded `Asset`
      * will be returned when the promise is resolved.
      * @return Returns a Promise which fulfills with an `Asset` instance.
      */
    def downloadAsync(): js.Promise[this.type] = js.native
    
    var downloaded: Boolean = js.native
    
    var downloading: Boolean = js.native
    
    /**
      * The MD5 hash of the asset's data.
      */
    var hash: String | Null = js.native
    
    /**
      * If the asset is an image, the height of the image data divided by the scale factor. The scale factor is the number after `@` in the filename, or `1` if not present.
      */
    var height: Double | Null = js.native
    
    /**
      * If the asset has been downloaded (by calling [`downloadAsync()`](#downloadasync)), the
      * `file://` URI pointing to the local file on the device that contains the asset data.
      */
    var localUri: String | Null = js.native
    
    /**
      * The name of the asset file without the extension. Also without the part from `@` onward in the
      * filename (used to specify scale factor for images).
      */
    var name: String = js.native
    
    /**
      * The extension of the asset filename.
      */
    var `type`: String = js.native
    
    /**
      * A URI that points to the asset's data on the remote server. When running the published version
      * of your app, this refers to the location on Expo's asset server where Expo has stored your
      * asset. When running the app from Expo CLI during development, this URI points to Expo CLI's
      * server running on your computer and the asset is served directly from your computer.
      */
    var uri: String = js.native
    
    /**
      * If the asset is an image, the width of the image data divided by the scale factor. The scale
      * factor is the number after `@` in the filename, or `1` if not present.
      */
    var width: Double | Null = js.native
  }
  /* static members */
  object Asset {
    
    @JSImport("expo-asset/build/Asset", "Asset")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @private
      */
    @JSImport("expo-asset/build/Asset", "Asset.byHash")
    @js.native
    def byHash: js.Object = js.native
    inline def byHash_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byHash")(x.asInstanceOf[js.Any])
    
    /**
      * @private
      */
    @JSImport("expo-asset/build/Asset", "Asset.byUri")
    @js.native
    def byUri: js.Object = js.native
    inline def byUri_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byUri")(x.asInstanceOf[js.Any])
    
    inline def fromMetadata(meta: AssetMetadata): Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMetadata")(meta.asInstanceOf[js.Any]).asInstanceOf[Asset]
    
    inline def fromModule(virtualAssetModule: String): Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromModule")(virtualAssetModule.asInstanceOf[js.Any]).asInstanceOf[Asset]
    /**
      * Returns the [`Asset`](#asset) instance representing an asset given its module or URL.
      * @param virtualAssetModule The value of `require('path/to/file')` for the asset or external
      * network URL
      * @return The [`Asset`](#asset) instance for the asset.
      */
    inline def fromModule(virtualAssetModule: Double): Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromModule")(virtualAssetModule.asInstanceOf[js.Any]).asInstanceOf[Asset]
    
    inline def fromURI(uri: String): Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURI")(uri.asInstanceOf[js.Any]).asInstanceOf[Asset]
    
    inline def loadAsync(moduleId: String): js.Promise[js.Array[Asset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Asset]]]
    inline def loadAsync(moduleId: js.Array[Double | String]): js.Promise[js.Array[Asset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Asset]]]
    /**
      * A helper that wraps `Asset.fromModule(module).downloadAsync` for convenience.
      * @param moduleId An array of `require('path/to/file')` or external network URLs. Can also be
      * just one module or URL without an Array.
      * @return Returns a Promise that fulfills with an array of `Asset`s when the asset(s) has been
      * saved to disk.
      * @example
      * ```ts
      * const [{ localUri }] = await Asset.loadAsync(require('./assets/snack-icon.png'));
      * ```
      */
    inline def loadAsync(moduleId: Double): js.Promise[js.Array[Asset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Asset]]]
  }
  
  trait AssetDescriptor extends StObject {
    
    var hash: js.UndefOr[String | Null] = js.undefined
    
    var height: js.UndefOr[Double | Null] = js.undefined
    
    var name: String
    
    var `type`: String
    
    var uri: String
    
    var width: js.UndefOr[Double | Null] = js.undefined
  }
  object AssetDescriptor {
    
    inline def apply(name: String, `type`: String, uri: String): AssetDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetDescriptor]
    }
    
    extension [Self <: AssetDescriptor](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait DownloadPromiseCallbacks extends StObject {
    
    def reject(error: js.Error): Unit
    
    def resolve(): Unit
  }
  object DownloadPromiseCallbacks {
    
    inline def apply(reject: js.Error => Unit, resolve: () => Unit): DownloadPromiseCallbacks = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction0(resolve))
      __obj.asInstanceOf[DownloadPromiseCallbacks]
    }
    
    extension [Self <: DownloadPromiseCallbacks](x: Self) {
      
      inline def setReject(value: js.Error => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: () => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
    }
  }
}
