package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLineRequest extends js.Object {
  /** The element properties for the line. */
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  /** The category of line to be created. */
  var lineCategory: js.UndefOr[String] = js.undefined
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
}

object CreateLineRequest {
  @scala.inline
  def apply(
    elementProperties: PageElementProperties = null,
    lineCategory: String = null,
    objectId: String = null
  ): CreateLineRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateLineRequest]
  }
}

