package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailUrlOptions extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var png: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object ThumbnailUrlOptions {
  @scala.inline
  def apply(format: String = null, png: js.UndefOr[Boolean] = js.undefined, size: String = null): ThumbnailUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(png)) __obj.updateDynamic("png")(png.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbnailUrlOptions]
  }
}

