package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageRequest extends js.Object {
  /**
    * The element properties for the image.
    *
    * When the aspect ratio of the provided size does not match the image aspect
    * ratio, the image is scaled and centered with respect to the size in order
    * to maintain aspect ratio. The provided transform is applied after this
    * operation.
    */
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  /**
    * A user-supplied object ID.
    *
    * If you specify an ID, it must be unique among all pages and page elements
    * in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters
    * may include those as well as a hyphen or colon (matches regex
    * `[a-zA-Z0-9_-:]`).
    * The length of the ID must not be less than 5 or greater than 50.
    *
    * If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.undefined
  /**
    * The image URL.
    *
    * The image is fetched once at insertion time and a copy is stored for
    * display inside the presentation. Images must be less than 50MB in size,
    * cannot exceed 25 megapixels, and must be in either in PNG, JPEG, or GIF
    * format.
    *
    * The provided URL can be at maximum 2K bytes large.
    */
  var url: js.UndefOr[String] = js.undefined
}

object CreateImageRequest {
  @scala.inline
  def apply(elementProperties: PageElementProperties = null, objectId: String = null, url: String = null): CreateImageRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CreateImageRequest]
  }
}

