package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Price {
  @scala.inline
  def apply(currency: java.lang.String = null, value: java.lang.String = null): Price = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Price]
  }
}

