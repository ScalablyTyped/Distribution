package typings.gapiDotClientDotPlusdomains.gapi.client.plusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Videostream extends js.Object {
  /** The height, in pixels, of the video resource. */
  var height: js.UndefOr[Double] = js.undefined
  /** MIME type of the video stream. */
  var `type`: js.UndefOr[String] = js.undefined
  /** URL of the video stream. */
  var url: js.UndefOr[String] = js.undefined
  /** The width, in pixels, of the video resource. */
  var width: js.UndefOr[Double] = js.undefined
}

object Videostream {
  @scala.inline
  def apply(height: Int | Double = null, `type`: String = null, url: String = null, width: Int | Double = null): Videostream = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Videostream]
  }
}

