package typings.expoAsset

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetMod {
  
  @JSImport("expo-asset/build/Asset", "Asset")
  @js.native
  class Asset protected () extends StObject {
    def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
    
    var _downloadCallbacks: js.Array[DownloadPromiseCallbacks] = js.native
    
    def downloadAsync(): js.Promise[this.type] = js.native
    
    var downloaded: Boolean = js.native
    
    var downloading: Boolean = js.native
    
    var hash: String | Null = js.native
    
    var height: Double | Null = js.native
    
    var localUri: String | Null = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
    
    var uri: String = js.native
    
    var width: Double | Null = js.native
  }
  /* static members */
  object Asset {
    
    @JSImport("expo-asset/build/Asset", "Asset")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-asset/build/Asset", "Asset.byHash")
    @js.native
    def byHash: js.Object = js.native
    @scala.inline
    def byHash_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byHash")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-asset/build/Asset", "Asset.byUri")
    @js.native
    def byUri: js.Object = js.native
    @scala.inline
    def byUri_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byUri")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-asset/build/Asset", "Asset.fromMetadata")
    @js.native
    def fromMetadata(meta: AssetMetadata): Asset = js.native
    
    @JSImport("expo-asset/build/Asset", "Asset.fromModule")
    @js.native
    def fromModule(virtualAssetModule: String): Asset = js.native
    @JSImport("expo-asset/build/Asset", "Asset.fromModule")
    @js.native
    def fromModule(virtualAssetModule: Double): Asset = js.native
    
    @JSImport("expo-asset/build/Asset", "Asset.fromURI")
    @js.native
    def fromURI(uri: String): Asset = js.native
    
    @JSImport("expo-asset/build/Asset", "Asset.loadAsync")
    @js.native
    def loadAsync(moduleId: String): js.Promise[js.Array[Asset]] = js.native
    @JSImport("expo-asset/build/Asset", "Asset.loadAsync")
    @js.native
    def loadAsync(moduleId: js.Array[Double | String]): js.Promise[js.Array[Asset]] = js.native
    @JSImport("expo-asset/build/Asset", "Asset.loadAsync")
    @js.native
    def loadAsync(moduleId: Double): js.Promise[js.Array[Asset]] = js.native
  }
  
  @js.native
  trait AssetDescriptor extends StObject {
    
    var hash: js.UndefOr[String | Null] = js.native
    
    var height: js.UndefOr[Double | Null] = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
    
    var uri: String = js.native
    
    var width: js.UndefOr[Double | Null] = js.native
  }
  object AssetDescriptor {
    
    @scala.inline
    def apply(name: String, `type`: String, uri: String): AssetDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetDescriptor]
    }
    
    @scala.inline
    implicit class AssetDescriptorMutableBuilder[Self <: AssetDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashNull: Self = StObject.set(x, "hash", null)
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightNull: Self = StObject.set(x, "height", null)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthNull: Self = StObject.set(x, "width", null)
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type AssetMetadata = typings.expoAsset.assetSourcesMod.AssetMetadata
  
  @js.native
  trait DownloadPromiseCallbacks extends StObject {
    
    def reject(error: Error): Unit = js.native
    
    def resolve(): Unit = js.native
  }
  object DownloadPromiseCallbacks {
    
    @scala.inline
    def apply(reject: Error => Unit, resolve: () => Unit): DownloadPromiseCallbacks = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction0(resolve))
      __obj.asInstanceOf[DownloadPromiseCallbacks]
    }
    
    @scala.inline
    implicit class DownloadPromiseCallbacksMutableBuilder[Self <: DownloadPromiseCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReject(value: Error => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: () => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
    }
  }
}
