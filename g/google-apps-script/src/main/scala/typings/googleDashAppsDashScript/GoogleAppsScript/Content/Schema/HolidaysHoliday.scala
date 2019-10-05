package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolidaysHoliday extends js.Object {
  var countryCode: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[String] = js.undefined
  var deliveryGuaranteeDate: js.UndefOr[String] = js.undefined
  var deliveryGuaranteeHour: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object HolidaysHoliday {
  @scala.inline
  def apply(
    countryCode: String = null,
    date: String = null,
    deliveryGuaranteeDate: String = null,
    deliveryGuaranteeHour: String = null,
    id: String = null,
    `type`: String = null
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

