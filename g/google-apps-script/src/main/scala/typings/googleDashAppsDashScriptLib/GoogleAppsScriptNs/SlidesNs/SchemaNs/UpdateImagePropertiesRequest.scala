package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateImagePropertiesRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var imageProperties: js.UndefOr[ImageProperties] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateImagePropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    imageProperties: ImageProperties = null,
    objectId: java.lang.String = null
  ): UpdateImagePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[UpdateImagePropertiesRequest]
  }
}

