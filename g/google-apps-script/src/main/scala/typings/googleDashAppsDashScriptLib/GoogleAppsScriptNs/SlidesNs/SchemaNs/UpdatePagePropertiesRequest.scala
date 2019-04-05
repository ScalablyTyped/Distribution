package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePagePropertiesRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var pageProperties: js.UndefOr[PageProperties] = js.undefined
}

object UpdatePagePropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    pageProperties: PageProperties = null
  ): UpdatePagePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties)
    __obj.asInstanceOf[UpdatePagePropertiesRequest]
  }
}

