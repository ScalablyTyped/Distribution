package typings.expoAsset.assetSourceResolverWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackagerAsset extends js.Object {
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
    `type`: String,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PackagerAsset = {
    val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], fileSystemLocation = fileSystemLocation.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagerAsset]
  }
}

