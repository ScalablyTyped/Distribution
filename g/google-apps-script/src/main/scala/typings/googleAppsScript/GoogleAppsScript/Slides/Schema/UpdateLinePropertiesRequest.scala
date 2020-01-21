package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLinePropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var lineProperties: js.UndefOr[LineProperties] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
}

object UpdateLinePropertiesRequest {
  @scala.inline
  def apply(fields: String = null, lineProperties: LineProperties = null, objectId: String = null): UpdateLinePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLinePropertiesRequest]
  }
}

