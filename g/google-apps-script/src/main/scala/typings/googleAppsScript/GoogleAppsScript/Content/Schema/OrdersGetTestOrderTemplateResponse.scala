package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersGetTestOrderTemplateResponse]
  }
}

