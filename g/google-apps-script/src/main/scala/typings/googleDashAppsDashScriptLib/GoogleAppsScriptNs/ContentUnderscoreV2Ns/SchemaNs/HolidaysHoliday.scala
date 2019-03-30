package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolidaysHoliday extends js.Object {
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[java.lang.String] = js.undefined
  var deliveryGuaranteeDate: js.UndefOr[java.lang.String] = js.undefined
  var deliveryGuaranteeHour: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object HolidaysHoliday {
  @scala.inline
  def apply(
    countryCode: java.lang.String = null,
    date: java.lang.String = null,
    deliveryGuaranteeDate: java.lang.String = null,
    deliveryGuaranteeHour: java.lang.String = null,
    id: java.lang.String = null,
    `type`: java.lang.String = null
  ): HolidaysHoliday = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (date != null) __obj.updateDynamic("date")(date)
    if (deliveryGuaranteeDate != null) __obj.updateDynamic("deliveryGuaranteeDate")(deliveryGuaranteeDate)
    if (deliveryGuaranteeHour != null) __obj.updateDynamic("deliveryGuaranteeHour")(deliveryGuaranteeHour)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HolidaysHoliday]
  }
}

