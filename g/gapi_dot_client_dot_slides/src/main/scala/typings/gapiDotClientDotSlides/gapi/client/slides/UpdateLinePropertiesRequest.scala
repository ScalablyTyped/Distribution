package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLinePropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `lineProperties` is
    * implied and should not be specified. A single `"&#42;"` can be used as
    * short-hand for listing every field.
    *
    * For example to update the line solid fill color, set `fields` to
    * `"lineFill.solidFill.color"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  /** The line properties to update. */
  var lineProperties: js.UndefOr[LineProperties] = js.undefined
  /** The object ID of the line the update is applied to. */
  var objectId: js.UndefOr[String] = js.undefined
}

object UpdateLinePropertiesRequest {
  @scala.inline
  def apply(fields: String = null, lineProperties: LineProperties = null, objectId: String = null): UpdateLinePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[UpdateLinePropertiesRequest]
  }
}

