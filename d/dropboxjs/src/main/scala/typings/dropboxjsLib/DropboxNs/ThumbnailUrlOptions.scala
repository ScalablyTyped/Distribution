package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailUrlOptions extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var png: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object ThumbnailUrlOptions {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    png: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null
  ): ThumbnailUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(png)) __obj.updateDynamic("png")(png)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ThumbnailUrlOptions]
  }
}

