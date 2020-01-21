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
    height: Int | Double = null,
    width: Int | Double = null
  ): PackagerAsset = {
    val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], fileSystemLocation = fileSystemLocation.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagerAsset]
  }
}

