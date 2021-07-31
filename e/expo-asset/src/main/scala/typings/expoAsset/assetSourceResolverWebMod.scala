package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetSourceResolverWebMod {
  
  @JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with AssetSourceResolver {
    def this(serverUrl: String, jsbundleUrl: String, asset: PackagerAsset) = this()
    def this(serverUrl: String, jsbundleUrl: Null, asset: PackagerAsset) = this()
    def this(serverUrl: String, jsbundleUrl: Unit, asset: PackagerAsset) = this()
    def this(serverUrl: Null, jsbundleUrl: String, asset: PackagerAsset) = this()
    def this(serverUrl: Null, jsbundleUrl: Null, asset: PackagerAsset) = this()
    def this(serverUrl: Null, jsbundleUrl: Unit, asset: PackagerAsset) = this()
    def this(serverUrl: Unit, jsbundleUrl: String, asset: PackagerAsset) = this()
    def this(serverUrl: Unit, jsbundleUrl: Null, asset: PackagerAsset) = this()
    def this(serverUrl: Unit, jsbundleUrl: Unit, asset: PackagerAsset) = this()
    
    /* CompleteClass */
    var asset: PackagerAsset = js.native
    
    /* CompleteClass */
    override def assetServerURL(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def defaultAsset(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def drawableFolderInBundle(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def fromSource(source: String): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def isLoadedFromFileSystem(): Boolean = js.native
    
    /* CompleteClass */
    override def isLoadedFromServer(): Boolean = js.native
    
    /* CompleteClass */
    override def resourceIdentifierWithoutScale(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def scaledAssetPath(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def scaledAssetURLNearBundle(): ResolvedAssetSource = js.native
  }
  /* static members */
  object default {
    
    @JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def pickScale(scales: js.Array[Double], deviceScale: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pickScale")(scales.asInstanceOf[js.Any], deviceScale.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  trait AssetSourceResolver extends StObject {
    
    var asset: PackagerAsset
    
    def assetServerURL(): ResolvedAssetSource
    
    def defaultAsset(): ResolvedAssetSource
    
    def drawableFolderInBundle(): ResolvedAssetSource
    
    def fromSource(source: String): ResolvedAssetSource
    
    def isLoadedFromFileSystem(): Boolean
    
    def isLoadedFromServer(): Boolean
    
    var jsbundleUrl: js.UndefOr[String | Null] = js.undefined
    
    def resourceIdentifierWithoutScale(): ResolvedAssetSource
    
    def scaledAssetPath(): ResolvedAssetSource
    
    def scaledAssetURLNearBundle(): ResolvedAssetSource
    
    var serverUrl: js.UndefOr[String | Null] = js.undefined
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
  
  trait PackagerAsset extends StObject {
    
    var __packager_asset: Boolean
    
    var fileSystemLocation: String
    
    var hash: String
    
    var height: js.UndefOr[Double] = js.undefined
    
    var httpServerLocation: String
    
    var name: String
    
    var scales: js.Array[Double]
    
    var `type`: String
    
    var width: js.UndefOr[Double] = js.undefined
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
  
  trait ResolvedAssetSource extends StObject {
    
    var __packager_asset: Boolean
    
    var height: js.UndefOr[Double] = js.undefined
    
    var scale: Double
    
    var uri: String
    
    var width: js.UndefOr[Double] = js.undefined
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
