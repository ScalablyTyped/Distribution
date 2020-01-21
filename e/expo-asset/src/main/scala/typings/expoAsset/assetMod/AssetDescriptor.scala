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
    hash: String = null,
    height: Int | Double = null,
    width: Int | Double = null
  ): AssetDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDescriptor]
  }
}

