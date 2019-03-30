package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateGroup extends js.Object {
  var applicableShippingLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var carrierRates: js.UndefOr[js.Array[CarrierRate]] = js.undefined
  var mainTable: js.UndefOr[Table] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var singleValue: js.UndefOr[Value] = js.undefined
  var subtables: js.UndefOr[js.Array[Table]] = js.undefined
}

object RateGroup {
  @scala.inline
  def apply(
    applicableShippingLabels: js.Array[java.lang.String] = null,
    carrierRates: js.Array[CarrierRate] = null,
    mainTable: Table = null,
    name: java.lang.String = null,
    singleValue: Value = null,
    subtables: js.Array[Table] = null
  ): RateGroup = {
    val __obj = js.Dynamic.literal()
    if (applicableShippingLabels != null) __obj.updateDynamic("applicableShippingLabels")(applicableShippingLabels)
    if (carrierRates != null) __obj.updateDynamic("carrierRates")(carrierRates)
    if (mainTable != null) __obj.updateDynamic("mainTable")(mainTable)
    if (name != null) __obj.updateDynamic("name")(name)
    if (singleValue != null) __obj.updateDynamic("singleValue")(singleValue)
    if (subtables != null) __obj.updateDynamic("subtables")(subtables)
    __obj.asInstanceOf[RateGroup]
  }
}

