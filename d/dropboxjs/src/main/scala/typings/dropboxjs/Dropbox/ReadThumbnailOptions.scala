package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadThumbnailOptions extends ThumbnailUrlOptions {
  var arrayBuffer: js.UndefOr[Boolean] = js.undefined
  var blob: js.UndefOr[Boolean] = js.undefined
  var buffer: js.UndefOr[Boolean] = js.undefined
}

object ReadThumbnailOptions {
  @scala.inline
  def apply(
    arrayBuffer: js.UndefOr[Boolean] = js.undefined,
    blob: js.UndefOr[Boolean] = js.undefined,
    buffer: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    png: js.UndefOr[Boolean] = js.undefined,
    size: String = null
  ): ReadThumbnailOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrayBuffer)) __obj.updateDynamic("arrayBuffer")(arrayBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(blob)) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(png)) __obj.updateDynamic("png")(png.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadThumbnailOptions]
  }
}

