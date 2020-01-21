package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  /**
    * The thumbnail's content type, i.e. "image/png".
    *
    * Always set.
    */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * The thumbnail file itself.
    *
    * That is, the bytes here are precisely the bytes that make up the thumbnail file; they can be served as an image as-is (with the appropriate content
    * type.)
    *
    * Always set.
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * The height of the thumbnail, in pixels.
    *
    * Always set.
    */
  var heightPx: js.UndefOr[Double] = js.undefined
  /**
    * The width of the thumbnail, in pixels.
    *
    * Always set.
    */
  var widthPx: js.UndefOr[Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(
    contentType: String = null,
    data: String = null,
    heightPx: Int | Double = null,
    widthPx: Int | Double = null
  ): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (heightPx != null) __obj.updateDynamic("heightPx")(heightPx.asInstanceOf[js.Any])
    if (widthPx != null) __obj.updateDynamic("widthPx")(widthPx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

