package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolidaysHoliday extends js.Object {
  var countryCode: js.UndefOr[String] = js.native
  var date: js.UndefOr[String] = js.native
  var deliveryGuaranteeDate: js.UndefOr[String] = js.native
  var deliveryGuaranteeHour: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object HolidaysHoliday {
  @scala.inline
  def apply(): HolidaysHoliday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HolidaysHoliday]
  }
  @scala.inline
  implicit class HolidaysHolidayOps[Self <: HolidaysHoliday] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDeliveryGuaranteeDate(value: String): Self = this.set("deliveryGuaranteeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryGuaranteeDate: Self = this.set("deliveryGuaranteeDate", js.undefined)
    @scala.inline
    def setDeliveryGuaranteeHour(value: String): Self = this.set("deliveryGuaranteeHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryGuaranteeHour: Self = this.set("deliveryGuaranteeHour", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

