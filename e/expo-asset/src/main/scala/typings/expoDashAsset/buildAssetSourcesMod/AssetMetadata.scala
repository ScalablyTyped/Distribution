package typings.expoDashAsset.buildAssetSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetMetadata extends js.Object {
  var fileHashes: js.UndefOr[js.Array[String]] = js.undefined
  var fileUris: js.UndefOr[js.Array[String]] = js.undefined
  var hash: String
  var height: js.UndefOr[Double] = js.undefined
  var httpServerLocation: String
  var name: String
  var scales: js.Array[Double]
  var `type`: String
  var uri: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AssetMetadata {
  @scala.inline
  def apply(
    hash: String,
    httpServerLocation: String,
    name: String,
    scales: js.Array[Double],
    `type`: String,
    fileHashes: js.Array[String] = null,
    fileUris: js.Array[String] = null,
    height: Int | Double = null,
    uri: String = null,
    width: Int | Double = null
  ): AssetMetadata = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fileHashes != null) __obj.updateDynamic("fileHashes")(fileHashes.asInstanceOf[js.Any])
    if (fileUris != null) __obj.updateDynamic("fileUris")(fileUris.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetMetadata]
  }
}

