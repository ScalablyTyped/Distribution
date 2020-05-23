package typings.expoAsset.assetSourceResolverWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedAssetSource extends js.Object {
  var __packager_asset: Boolean
  var height: js.UndefOr[Double] = js.undefined
  var scale: Double
  var uri: String
  var width: js.UndefOr[Double] = js.undefined
}

object ResolvedAssetSource {
  @scala.inline
  def apply(
    __packager_asset: Boolean,
    scale: Double,
    uri: String,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ResolvedAssetSource = {
    val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedAssetSource]
  }
}

