package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (pretax != null) __obj.updateDynamic("pretax")(pretax.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
}

