package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  /**
    * The thumbnail's content type, i.e. "image/png".
    *
    * Always set.
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The thumbnail file itself.
    *
    * That is, the bytes here are precisely the bytes that make up the thumbnail file; they can be served as an image as-is (with the appropriate content
    * type.)
    *
    * Always set.
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the thumbnail, in pixels.
    *
    * Always set.
    */
  var heightPx: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the thumbnail, in pixels.
    *
    * Always set.
    */
  var widthPx: js.UndefOr[scala.Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    data: java.lang.String = null,
    heightPx: scala.Int | scala.Double = null,
    widthPx: scala.Int | scala.Double = null
  ): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (heightPx != null) __obj.updateDynamic("heightPx")(heightPx.asInstanceOf[js.Any])
    if (widthPx != null) __obj.updateDynamic("widthPx")(widthPx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

