package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVideoRequest extends js.Object {
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object CreateVideoRequest {
  @scala.inline
  def apply(
    elementProperties: PageElementProperties = null,
    id: java.lang.String = null,
    objectId: java.lang.String = null,
    source: java.lang.String = null
  ): CreateVideoRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (id != null) __obj.updateDynamic("id")(id)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CreateVideoRequest]
  }
}

