package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
  var pretax: js.UndefOr[Price] = js.undefined
  var tax: js.UndefOr[Price] = js.undefined
}

object Amount {
  @scala.inline
  def apply(pretax: Price = null, tax: Price = null): Amount = {
    val __obj = js.Dynamic.literal()
    if (pretax != null) __obj.updateDynamic("pretax")(pretax)
    if (tax != null) __obj.updateDynamic("tax")(tax)
    __obj.asInstanceOf[Amount]
  }
}

