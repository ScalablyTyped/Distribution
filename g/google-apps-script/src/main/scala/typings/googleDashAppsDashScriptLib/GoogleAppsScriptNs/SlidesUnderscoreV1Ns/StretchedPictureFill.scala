package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StretchedPictureFill extends js.Object {
  // Reading the content_url:
  //
  // An URL to a picture with a default lifetime of 30 minutes.
  // This URL is tagged with the account of the requester. Anyone with the URL
  // effectively accesses the picture as the original requester. Access to the
  // picture may be lost if the presentation's sharing settings change.
  //
  // Writing the content_url:
  //
  // The picture is fetched once at insertion time and a copy is stored for
  // display inside the presentation. Pictures must be less than 50MB in size,
  // cannot exceed 25 megapixels, and must be in one of PNG, JPEG, or GIF
  // format.
  //
  // The provided URL can be at most 2 kB in length.
  //
  var content_url: java.lang.String
  // The original size of the picture fill. This field is read-only.
  var size: Size
}

object StretchedPictureFill {
  @scala.inline
  def apply(content_url: java.lang.String, size: Size): StretchedPictureFill = {
    val __obj = js.Dynamic.literal(content_url = content_url, size = size)
  
    __obj.asInstanceOf[StretchedPictureFill]
  }
}

