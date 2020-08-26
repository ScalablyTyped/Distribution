package typings.foundationSites.FoundationSites

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbidePatterns extends js.Object {
  var alpha: js.UndefOr[RegExp] = js.native
  var alpha_numeric: js.UndefOr[RegExp] = js.native
  var card: js.UndefOr[RegExp] = js.native
  var color: js.UndefOr[RegExp] = js.native
  var cvv: js.UndefOr[RegExp] = js.native
  var date: js.UndefOr[RegExp] = js.native
  var dateISO: js.UndefOr[RegExp] = js.native
  var datetime: js.UndefOr[RegExp] = js.native
  var day_month_year: js.UndefOr[RegExp] = js.native
  var domain: js.UndefOr[RegExp] = js.native
  var email: js.UndefOr[RegExp] = js.native
  var integer: js.UndefOr[RegExp] = js.native
  var month_day_year: js.UndefOr[RegExp] = js.native
  var number: js.UndefOr[RegExp] = js.native
  var time: js.UndefOr[RegExp] = js.native
  var url: js.UndefOr[RegExp] = js.native
}

object IAbidePatterns {
  @scala.inline
  def apply(): IAbidePatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbidePatterns]
  }
  @scala.inline
  implicit class IAbidePatternsOps[Self <: IAbidePatterns] (val x: Self) extends AnyVal {
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
    def setAlpha(value: RegExp): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAlpha_numeric(value: RegExp): Self = this.set("alpha_numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha_numeric: Self = this.set("alpha_numeric", js.undefined)
    @scala.inline
    def setCard(value: RegExp): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setColor(value: RegExp): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCvv(value: RegExp): Self = this.set("cvv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCvv: Self = this.set("cvv", js.undefined)
    @scala.inline
    def setDate(value: RegExp): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDateISO(value: RegExp): Self = this.set("dateISO", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateISO: Self = this.set("dateISO", js.undefined)
    @scala.inline
    def setDatetime(value: RegExp): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    @scala.inline
    def setDay_month_year(value: RegExp): Self = this.set("day_month_year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay_month_year: Self = this.set("day_month_year", js.undefined)
    @scala.inline
    def setDomain(value: RegExp): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEmail(value: RegExp): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setInteger(value: RegExp): Self = this.set("integer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteger: Self = this.set("integer", js.undefined)
    @scala.inline
    def setMonth_day_year(value: RegExp): Self = this.set("month_day_year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth_day_year: Self = this.set("month_day_year", js.undefined)
    @scala.inline
    def setNumber(value: RegExp): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setTime(value: RegExp): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setUrl(value: RegExp): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

