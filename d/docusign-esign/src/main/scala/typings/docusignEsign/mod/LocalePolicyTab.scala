package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalePolicyTab extends js.Object {
  
  var addressFormat: js.UndefOr[String] = js.native
  
  var calendarType: js.UndefOr[String] = js.native
  
  var cultureName: js.UndefOr[String] = js.native
  
  var currencyNegativeFormat: js.UndefOr[String] = js.native
  
  var currencyPositiveFormat: js.UndefOr[String] = js.native
  
  var customDateFormat: js.UndefOr[String] = js.native
  
  var customTimeFormat: js.UndefOr[String] = js.native
  
  var dateFormat: js.UndefOr[String] = js.native
  
  var initialFormat: js.UndefOr[String] = js.native
  
  var nameFormat: js.UndefOr[String] = js.native
  
  var timeFormat: js.UndefOr[String] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
}
object LocalePolicyTab {
  
  @scala.inline
  def apply(): LocalePolicyTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalePolicyTab]
  }
  
  @scala.inline
  implicit class LocalePolicyTabOps[Self <: LocalePolicyTab] (val x: Self) extends AnyVal {
    
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
    def setAddressFormat(value: String): Self = this.set("addressFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressFormat: Self = this.set("addressFormat", js.undefined)
    
    @scala.inline
    def setCalendarType(value: String): Self = this.set("calendarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarType: Self = this.set("calendarType", js.undefined)
    
    @scala.inline
    def setCultureName(value: String): Self = this.set("cultureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCultureName: Self = this.set("cultureName", js.undefined)
    
    @scala.inline
    def setCurrencyNegativeFormat(value: String): Self = this.set("currencyNegativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyNegativeFormat: Self = this.set("currencyNegativeFormat", js.undefined)
    
    @scala.inline
    def setCurrencyPositiveFormat(value: String): Self = this.set("currencyPositiveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyPositiveFormat: Self = this.set("currencyPositiveFormat", js.undefined)
    
    @scala.inline
    def setCustomDateFormat(value: String): Self = this.set("customDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDateFormat: Self = this.set("customDateFormat", js.undefined)
    
    @scala.inline
    def setCustomTimeFormat(value: String): Self = this.set("customTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTimeFormat: Self = this.set("customTimeFormat", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setInitialFormat(value: String): Self = this.set("initialFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFormat: Self = this.set("initialFormat", js.undefined)
    
    @scala.inline
    def setNameFormat(value: String): Self = this.set("nameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameFormat: Self = this.set("nameFormat", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
