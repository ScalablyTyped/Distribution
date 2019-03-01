package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadThumbnailOptions extends ThumbnailUrlOptions {
  var arrayBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var blob: js.UndefOr[scala.Boolean] = js.undefined
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
}

object ReadThumbnailOptions {
  @scala.inline
  def apply(
    arrayBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    blob: js.UndefOr[scala.Boolean] = js.undefined,
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    png: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null
  ): ReadThumbnailOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrayBuffer)) __obj.updateDynamic("arrayBuffer")(arrayBuffer)
    if (!js.isUndefined(blob)) __obj.updateDynamic("blob")(blob)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(png)) __obj.updateDynamic("png")(png)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ReadThumbnailOptions]
  }
}

