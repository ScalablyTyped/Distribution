package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeThumbnailItemResource extends js.Object {
  /**
    * The images height.
    */
  var height: Double
  /**
    * The images URL.
    */
  var url: String
  /**
    * The images width.
    */
  var width: Double
}

object GoogleApiYouTubeThumbnailItemResource {
  @scala.inline
  def apply(height: Double, url: String, width: Double): GoogleApiYouTubeThumbnailItemResource = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeThumbnailItemResource]
  }
}

