package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetSourceResolverWebMod {
  
  @JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
  @js.native
  class default protected () extends AssetSourceResolver {
    def this(serverUrl: js.UndefOr[scala.Nothing], jsbundleUrl: js.UndefOr[scala.Nothing], asset: PackagerAsset) = this()
    def this(serverUrl: js.UndefOr[scala.Nothing], jsbundleUrl: String, asset: PackagerAsset) = this()
    def this(serverUrl: js.UndefOr[scala.Nothing], jsbundleUrl: Null, asset: PackagerAsset) = this()
    def this(serverUrl: String, jsbundleUrl: js.UndefOr[scala.Nothing], asset: PackagerAsset) = this()
    def this(serverUrl: String, jsbundleUrl: String, asset: PackagerAsset) = this()
    def this(serverUrl: String, jsbundleUrl: Null, asset: PackagerAsset) = this()
    def this(serverUrl: Null, jsbundleUrl: js.UndefOr[scala.Nothing], asset: PackagerAsset) = this()
    def this(serverUrl: Null, jsbundleUrl: String, asset: PackagerAsset) = this()
    def this(serverUrl: Null, jsbundleUrl: Null, asset: PackagerAsset) = this()
  }
  /* static members */
  object default {
    
    @JSImport("expo-asset/build/AssetSourceResolver.web", "default.pickScale")
    @js.native
    def pickScale(scales: js.Array[Double], deviceScale: Double): Double = js.native
  }
  
  @js.native
  trait AssetSourceResolver extends StObject {
    
    var asset: PackagerAsset = js.native
    
    def assetServerURL(): ResolvedAssetSource = js.native
    
    def defaultAsset(): ResolvedAssetSource = js.native
    
    def drawableFolderInBundle(): ResolvedAssetSource = js.native
    
    def fromSource(source: String): ResolvedAssetSource = js.native
    
    def isLoadedFromFileSystem(): Boolean = js.native
    
    def isLoadedFromServer(): Boolean = js.native
    
    var jsbundleUrl: js.UndefOr[String | Null] = js.native
    
    def resourceIdentifierWithoutScale(): ResolvedAssetSource = js.native
    
    def scaledAssetPath(): ResolvedAssetSource = js.native
    
    def scaledAssetURLNearBundle(): ResolvedAssetSource = js.native
    
    var serverUrl: js.UndefOr[String | Null] = js.native
  }
  object AssetSourceResolver {
    
    @scala.inline
    def apply(
      asset: PackagerAsset,
      assetServerURL: () => ResolvedAssetSource,
      defaultAsset: () => ResolvedAssetSource,
      drawableFolderInBundle: () => ResolvedAssetSource,
      fromSource: String => ResolvedAssetSource,
      isLoadedFromFileSystem: () => Boolean,
      isLoadedFromServer: () => Boolean,
      resourceIdentifierWithoutScale: () => ResolvedAssetSource,
      scaledAssetPath: () => ResolvedAssetSource,
      scaledAssetURLNearBundle: () => ResolvedAssetSource
    ): AssetSourceResolver = {
      val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], assetServerURL = js.Any.fromFunction0(assetServerURL), defaultAsset = js.Any.fromFunction0(defaultAsset), drawableFolderInBundle = js.Any.fromFunction0(drawableFolderInBundle), fromSource = js.Any.fromFunction1(fromSource), isLoadedFromFileSystem = js.Any.fromFunction0(isLoadedFromFileSystem), isLoadedFromServer = js.Any.fromFunction0(isLoadedFromServer), resourceIdentifierWithoutScale = js.Any.fromFunction0(resourceIdentifierWithoutScale), scaledAssetPath = js.Any.fromFunction0(scaledAssetPath), scaledAssetURLNearBundle = js.Any.fromFunction0(scaledAssetURLNearBundle))
      __obj.asInstanceOf[AssetSourceResolver]
    }
    
    @scala.inline
    implicit class AssetSourceResolverMutableBuilder[Self <: AssetSourceResolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsset(value: PackagerAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetServerURL(value: () => ResolvedAssetSource): Self = StObject.set(x, "assetServerURL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultAsset(value: () => ResolvedAssetSource): Self = StObject.set(x, "defaultAsset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawableFolderInBundle(value: () => ResolvedAssetSource): Self = StObject.set(x, "drawableFolderInBundle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFromSource(value: String => ResolvedAssetSource): Self = StObject.set(x, "fromSource", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsLoadedFromFileSystem(value: () => Boolean): Self = StObject.set(x, "isLoadedFromFileSystem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLoadedFromServer(value: () => Boolean): Self = StObject.set(x, "isLoadedFromServer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setJsbundleUrl(value: String): Self = StObject.set(x, "jsbundleUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsbundleUrlNull: Self = StObject.set(x, "jsbundleUrl", null)
      
      @scala.inline
      def setJsbundleUrlUndefined: Self = StObject.set(x, "jsbundleUrl", js.undefined)
      
      @scala.inline
      def setResourceIdentifierWithoutScale(value: () => ResolvedAssetSource): Self = StObject.set(x, "resourceIdentifierWithoutScale", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScaledAssetPath(value: () => ResolvedAssetSource): Self = StObject.set(x, "scaledAssetPath", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScaledAssetURLNearBundle(value: () => ResolvedAssetSource): Self = StObject.set(x, "scaledAssetURLNearBundle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUrlNull: Self = StObject.set(x, "serverUrl", null)
      
      @scala.inline
      def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
    }
  }
  
  @js.native
  trait PackagerAsset extends StObject {
    
    var __packager_asset: Boolean = js.native
    
    var fileSystemLocation: String = js.native
    
    var hash: String = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var httpServerLocation: String = js.native
    
    var name: String = js.native
    
    var scales: js.Array[Double] = js.native
    
    var `type`: String = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object PackagerAsset {
    
    @scala.inline
    def apply(
      __packager_asset: Boolean,
      fileSystemLocation: String,
      hash: String,
      httpServerLocation: String,
      name: String,
      scales: js.Array[Double],
      `type`: String
    ): PackagerAsset = {
      val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], fileSystemLocation = fileSystemLocation.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackagerAsset]
    }
    
    @scala.inline
    implicit class PackagerAssetMutableBuilder[Self <: PackagerAsset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSystemLocation(value: String): Self = StObject.set(x, "fileSystemLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHttpServerLocation(value: String): Self = StObject.set(x, "httpServerLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScales(value: js.Array[Double]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesVarargs(value: Double*): Self = StObject.set(x, "scales", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def set__packager_asset(value: Boolean): Self = StObject.set(x, "__packager_asset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResolvedAssetSource extends StObject {
    
    var __packager_asset: Boolean = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var scale: Double = js.native
    
    var uri: String = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ResolvedAssetSource {
    
    @scala.inline
    def apply(__packager_asset: Boolean, scale: Double, uri: String): ResolvedAssetSource = {
      val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedAssetSource]
    }
    
    @scala.inline
    implicit class ResolvedAssetSourceMutableBuilder[Self <: ResolvedAssetSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def set__packager_asset(value: Boolean): Self = StObject.set(x, "__packager_asset", value.asInstanceOf[js.Any])
    }
  }
}
