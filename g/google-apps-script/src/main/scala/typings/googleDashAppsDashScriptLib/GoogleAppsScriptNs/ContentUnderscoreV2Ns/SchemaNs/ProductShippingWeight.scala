package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductShippingWeight extends js.Object {
  var unit: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[stdLib.Number] = js.undefined
}

object ProductShippingWeight {
  @scala.inline
  def apply(unit: java.lang.String = null, value: stdLib.Number = null): ProductShippingWeight = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ProductShippingWeight]
  }
}

