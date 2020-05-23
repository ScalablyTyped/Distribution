package typings.expoAsset.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetDescriptor extends js.Object {
  var hash: js.UndefOr[String | Null] = js.undefined
  var height: js.UndefOr[Double | Null] = js.undefined
  var name: String
  var `type`: String
  var uri: String
  var width: js.UndefOr[Double | Null] = js.undefined
}

object AssetDescriptor {
  @scala.inline
  def apply(
    name: String,
    `type`: String,
    uri: String,
    hash: js.UndefOr[Null | String] = js.undefined,
    height: js.UndefOr[Null | Double] = js.undefined,
    width: js.UndefOr[Null | Double] = js.undefined
  ): AssetDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDescriptor]
  }
}

