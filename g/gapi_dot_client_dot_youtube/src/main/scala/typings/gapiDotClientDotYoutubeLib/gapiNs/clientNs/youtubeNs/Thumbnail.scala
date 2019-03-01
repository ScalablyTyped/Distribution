package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  /** (Optional) Height of the thumbnail image. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The thumbnail image's URL. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** (Optional) Width of the thumbnail image. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

