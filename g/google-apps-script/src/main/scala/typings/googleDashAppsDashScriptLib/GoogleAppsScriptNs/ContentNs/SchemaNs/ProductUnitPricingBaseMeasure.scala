package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductUnitPricingBaseMeasure extends js.Object {
  var unit: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ProductUnitPricingBaseMeasure {
  @scala.inline
  def apply(unit: java.lang.String = null, value: java.lang.String = null): ProductUnitPricingBaseMeasure = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ProductUnitPricingBaseMeasure]
  }
}

