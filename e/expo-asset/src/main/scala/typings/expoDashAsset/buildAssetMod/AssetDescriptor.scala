package typings.expoDashAsset.buildAssetMod

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
    val __obj = js.Dynamic.literal(name = name, uri = uri)
    __obj.updateDynamic("type")(`type`)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDescriptor]
  }
}

