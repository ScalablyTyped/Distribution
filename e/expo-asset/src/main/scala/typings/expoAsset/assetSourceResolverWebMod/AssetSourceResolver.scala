package typings.expoAsset.assetSourceResolverWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetSourceResolver extends js.Object {
  
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
  implicit class AssetSourceResolverOps[Self <: AssetSourceResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsset(value: PackagerAsset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetServerURL(value: () => ResolvedAssetSource): Self = this.set("assetServerURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultAsset(value: () => ResolvedAssetSource): Self = this.set("defaultAsset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawableFolderInBundle(value: () => ResolvedAssetSource): Self = this.set("drawableFolderInBundle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFromSource(value: String => ResolvedAssetSource): Self = this.set("fromSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLoadedFromFileSystem(value: () => Boolean): Self = this.set("isLoadedFromFileSystem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoadedFromServer(value: () => Boolean): Self = this.set("isLoadedFromServer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResourceIdentifierWithoutScale(value: () => ResolvedAssetSource): Self = this.set("resourceIdentifierWithoutScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScaledAssetPath(value: () => ResolvedAssetSource): Self = this.set("scaledAssetPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScaledAssetURLNearBundle(value: () => ResolvedAssetSource): Self = this.set("scaledAssetURLNearBundle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJsbundleUrl(value: String): Self = this.set("jsbundleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsbundleUrl: Self = this.set("jsbundleUrl", js.undefined)
    
    @scala.inline
    def setJsbundleUrlNull: Self = this.set("jsbundleUrl", null)
    
    @scala.inline
    def setServerUrl(value: String): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerUrl: Self = this.set("serverUrl", js.undefined)
    
    @scala.inline
    def setServerUrlNull: Self = this.set("serverUrl", null)
  }
}
