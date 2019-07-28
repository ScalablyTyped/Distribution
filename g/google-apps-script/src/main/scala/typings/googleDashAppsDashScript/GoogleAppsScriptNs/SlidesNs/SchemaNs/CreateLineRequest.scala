package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLineRequest extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var lineCategory: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
}

object CreateLineRequest {
  @scala.inline
  def apply(
    category: String = null,
    elementProperties: PageElementProperties = null,
    lineCategory: String = null,
    objectId: String = null
  ): CreateLineRequest = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateLineRequest]
  }
}

