package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateImagePropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var imageProperties: js.UndefOr[ImageProperties] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
}

object UpdateImagePropertiesRequest {
  @scala.inline
  def apply(fields: String = null, imageProperties: ImageProperties = null, objectId: String = null): UpdateImagePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImagePropertiesRequest]
  }
}

