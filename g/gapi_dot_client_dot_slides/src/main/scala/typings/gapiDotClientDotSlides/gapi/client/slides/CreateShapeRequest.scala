package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateShapeRequest extends js.Object {
  /** The element properties for the shape. */
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
    * If empty, a unique identifier will be generated.
    */
  var objectId: js.UndefOr[String] = js.undefined
  /** The shape type. */
  var shapeType: js.UndefOr[String] = js.undefined
}

object CreateShapeRequest {
  @scala.inline
  def apply(elementProperties: PageElementProperties = null, objectId: String = null, shapeType: String = null): CreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (shapeType != null) __obj.updateDynamic("shapeType")(shapeType)
    __obj.asInstanceOf[CreateShapeRequest]
  }
}

