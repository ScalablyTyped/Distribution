package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersGetTestOrderTemplateResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[TestOrder] = js.undefined
}

object OrdersGetTestOrderTemplateResponse {
  @scala.inline
  def apply(kind: String = null, template: TestOrder = null): OrdersGetTestOrderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[OrdersGetTestOrderTemplateResponse]
  }
}

