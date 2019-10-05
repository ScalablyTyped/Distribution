package typings.gapiDotClientDotManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * The URL of the image. For crawled images, this is the provided URL. For
    * uploaded images, this is a serving URL from Google if the image has been
    * processed successfully.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * The status of the image.
    * @OutputOnly
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The type of the image, i.e., crawled or uploaded.
    * @OutputOnly
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(imageUrl: String = null, status: String = null, `type`: String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (status != null) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Image]
  }
}

