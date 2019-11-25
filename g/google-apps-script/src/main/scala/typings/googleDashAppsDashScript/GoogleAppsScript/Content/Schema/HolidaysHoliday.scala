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
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (deliveryGuaranteeDate != null) __obj.updateDynamic("deliveryGuaranteeDate")(deliveryGuaranteeDate.asInstanceOf[js.Any])
    if (deliveryGuaranteeHour != null) __obj.updateDynamic("deliveryGuaranteeHour")(deliveryGuaranteeHour.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolidaysHoliday]
  }
}

