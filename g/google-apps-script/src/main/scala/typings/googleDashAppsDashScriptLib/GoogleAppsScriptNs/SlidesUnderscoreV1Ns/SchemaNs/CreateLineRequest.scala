package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLineRequest extends js.Object {
  var category: js.UndefOr[java.lang.String] = js.undefined
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var lineCategory: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateLineRequest {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    elementProperties: PageElementProperties = null,
    lineCategory: java.lang.String = null,
    objectId: java.lang.String = null
  ): CreateLineRequest = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateLineRequest]
  }
}

