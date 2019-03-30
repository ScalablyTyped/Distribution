package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePageElementsZOrderRequest extends js.Object {
  var operation: js.UndefOr[java.lang.String] = js.undefined
  var pageElementObjectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object UpdatePageElementsZOrderRequest {
  @scala.inline
  def apply(operation: java.lang.String = null, pageElementObjectIds: js.Array[java.lang.String] = null): UpdatePageElementsZOrderRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (pageElementObjectIds != null) __obj.updateDynamic("pageElementObjectIds")(pageElementObjectIds)
    __obj.asInstanceOf[UpdatePageElementsZOrderRequest]
  }
}

