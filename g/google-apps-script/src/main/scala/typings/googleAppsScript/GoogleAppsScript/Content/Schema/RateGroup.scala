package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateGroup extends js.Object {
  var applicableShippingLabels: js.UndefOr[js.Array[String]] = js.undefined
  var carrierRates: js.UndefOr[js.Array[CarrierRate]] = js.undefined
  var mainTable: js.UndefOr[Table] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var singleValue: js.UndefOr[Value] = js.undefined
  var subtables: js.UndefOr[js.Array[Table]] = js.undefined
}

object RateGroup {
  @scala.inline
  def apply(
    applicableShippingLabels: js.Array[String] = null,
    carrierRates: js.Array[CarrierRate] = null,
    mainTable: Table = null,
    name: String = null,
    singleValue: Value = null,
    subtables: js.Array[Table] = null
  ): RateGroup = {
    val __obj = js.Dynamic.literal()
    if (applicableShippingLabels != null) __obj.updateDynamic("applicableShippingLabels")(applicableShippingLabels.asInstanceOf[js.Any])
    if (carrierRates != null) __obj.updateDynamic("carrierRates")(carrierRates.asInstanceOf[js.Any])
    if (mainTable != null) __obj.updateDynamic("mainTable")(mainTable.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (singleValue != null) __obj.updateDynamic("singleValue")(singleValue.asInstanceOf[js.Any])
    if (subtables != null) __obj.updateDynamic("subtables")(subtables.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateGroup]
  }
}

