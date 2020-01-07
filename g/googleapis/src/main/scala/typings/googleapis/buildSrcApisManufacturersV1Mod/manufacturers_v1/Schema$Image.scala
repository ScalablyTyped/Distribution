package typings.googleapis.buildSrcApisManufacturersV1Mod.manufacturers_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image.
  */
@js.native
trait Schema$Image extends js.Object {
  /**
    * The URL of the image. For crawled images, this is the provided URL. For
    * uploaded images, this is a serving URL from Google if the image has been
    * processed successfully.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The status of the image. @OutputOnly
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The type of the image, i.e., crawled or uploaded. @OutputOnly
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Image {
  @scala.inline
  def apply(imageUrl: String = null, status: String = null, `type`: String = null): Schema$Image = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Image]
  }
}

