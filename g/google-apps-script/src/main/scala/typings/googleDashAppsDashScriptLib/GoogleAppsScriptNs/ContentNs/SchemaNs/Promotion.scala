package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promotion extends js.Object {
  var promotionAmount: js.UndefOr[Amount] = js.undefined
  var promotionId: js.UndefOr[java.lang.String] = js.undefined
}

object Promotion {
  @scala.inline
  def apply(promotionAmount: Amount = null, promotionId: java.lang.String = null): Promotion = {
    val __obj = js.Dynamic.literal()
    if (promotionAmount != null) __obj.updateDynamic("promotionAmount")(promotionAmount)
    if (promotionId != null) __obj.updateDynamic("promotionId")(promotionId)
    __obj.asInstanceOf[Promotion]
  }
}

