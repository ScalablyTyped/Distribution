package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeThumbnailItemResource extends js.Object {
  /**
    * The images height.
    */
  var height: scala.Double
  /**
    * The images URL.
    */
  var url: java.lang.String
  /**
    * The images width.
    */
  var width: scala.Double
}

object GoogleApiYouTubeThumbnailItemResource {
  @scala.inline
  def apply(height: scala.Double, url: java.lang.String, width: scala.Double): GoogleApiYouTubeThumbnailItemResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[GoogleApiYouTubeThumbnailItemResource]
  }
}

