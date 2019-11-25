package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePagePropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var pageProperties: js.UndefOr[PageProperties] = js.undefined
}

object UpdatePagePropertiesRequest {
  @scala.inline
  def apply(fields: String = null, objectId: String = null, pageProperties: PageProperties = null): UpdatePagePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePagePropertiesRequest]
  }
}

