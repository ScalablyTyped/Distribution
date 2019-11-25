package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  /** (Optional) Height of the thumbnail image. */
  var height: js.UndefOr[Double] = js.undefined
  /** The thumbnail image's URL. */
  var url: js.UndefOr[String] = js.undefined
  /** (Optional) Width of the thumbnail image. */
  var width: js.UndefOr[Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(height: Int | Double = null, url: String = null, width: Int | Double = null): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

