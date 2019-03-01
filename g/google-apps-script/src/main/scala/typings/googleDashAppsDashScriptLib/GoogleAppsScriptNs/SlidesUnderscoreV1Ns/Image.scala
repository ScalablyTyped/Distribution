package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  // An URL to an image with a default lifetime of 30 minutes.
  // This URL is tagged with the account of the requester. Anyone with the URL
  // effectively accesses the image as the original requester. Access to the
  // image may be lost if the presentation's sharing settings change.
  var content_url: java.lang.String
  // The properties of the image.
  var image_properties: ImageProperties
  // The source URL is the URL used to insert the image. The source URL can be
  // empty.
  var source_url: java.lang.String
}

object Image {
  @scala.inline
  def apply(content_url: java.lang.String, image_properties: ImageProperties, source_url: java.lang.String): Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content_url")(content_url)
    __obj.updateDynamic("image_properties")(image_properties)
    __obj.updateDynamic("source_url")(source_url)
    __obj.asInstanceOf[Image]
  }
}

