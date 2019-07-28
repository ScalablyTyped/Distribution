package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePageElementsZOrderRequest extends js.Object {
  var operation: js.UndefOr[String] = js.undefined
  var pageElementObjectIds: js.UndefOr[js.Array[String]] = js.undefined
}

object UpdatePageElementsZOrderRequest {
  @scala.inline
  def apply(operation: String = null, pageElementObjectIds: js.Array[String] = null): UpdatePageElementsZOrderRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (pageElementObjectIds != null) __obj.updateDynamic("pageElementObjectIds")(pageElementObjectIds)
    __obj.asInstanceOf[UpdatePageElementsZOrderRequest]
  }
}

