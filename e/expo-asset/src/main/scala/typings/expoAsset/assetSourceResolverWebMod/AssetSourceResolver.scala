package typings.expoAsset.assetSourceResolverWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetSourceResolver extends js.Object {
  var asset: PackagerAsset
  var jsbundleUrl: js.UndefOr[String | Null] = js.undefined
  var serverUrl: js.UndefOr[String | Null] = js.undefined
  def assetServerURL(): ResolvedAssetSource
  def defaultAsset(): ResolvedAssetSource
  def drawableFolderInBundle(): ResolvedAssetSource
  def fromSource(source: String): ResolvedAssetSource
  def isLoadedFromFileSystem(): Boolean
  def isLoadedFromServer(): Boolean
  def resourceIdentifierWithoutScale(): ResolvedAssetSource
  def scaledAssetPath(): ResolvedAssetSource
  def scaledAssetURLNearBundle(): ResolvedAssetSource
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
    scaledAssetURLNearBundle: () => ResolvedAssetSource,
    jsbundleUrl: js.UndefOr[Null | String] = js.undefined,
    serverUrl: js.UndefOr[Null | String] = js.undefined
  ): AssetSourceResolver = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], assetServerURL = js.Any.fromFunction0(assetServerURL), defaultAsset = js.Any.fromFunction0(defaultAsset), drawableFolderInBundle = js.Any.fromFunction0(drawableFolderInBundle), fromSource = js.Any.fromFunction1(fromSource), isLoadedFromFileSystem = js.Any.fromFunction0(isLoadedFromFileSystem), isLoadedFromServer = js.Any.fromFunction0(isLoadedFromServer), resourceIdentifierWithoutScale = js.Any.fromFunction0(resourceIdentifierWithoutScale), scaledAssetPath = js.Any.fromFunction0(scaledAssetPath), scaledAssetURLNearBundle = js.Any.fromFunction0(scaledAssetURLNearBundle))
    if (!js.isUndefined(jsbundleUrl)) __obj.updateDynamic("jsbundleUrl")(jsbundleUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(serverUrl)) __obj.updateDynamic("serverUrl")(serverUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSourceResolver]
  }
}

