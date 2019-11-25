package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * An URL to an image with a default lifetime of 30 minutes.
    * This URL is tagged with the account of the requester. Anyone with the URL
    * effectively accesses the image as the original requester. Access to the
    * image may be lost if the presentation's sharing settings change.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  /** The properties of the image. */
  var imageProperties: js.UndefOr[ImageProperties] = js.undefined
}

object Image {
  @scala.inline
  def apply(contentUrl: String = null, imageProperties: ImageProperties = null): Image = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

