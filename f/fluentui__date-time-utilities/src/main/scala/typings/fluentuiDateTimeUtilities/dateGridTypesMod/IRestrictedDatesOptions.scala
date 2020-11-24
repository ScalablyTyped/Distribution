package typings.fluentuiDateTimeUtilities.dateGridTypesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRestrictedDatesOptions extends js.Object {
  
  /**
    * If set the Calendar will not allow navigation to or selection of a date later than this value.
    */
  var maxDate: js.UndefOr[Date] = js.native
  
  /**
    * If set the Calendar will not allow navigation to or selection of a date earlier than this value.
    */
  var minDate: js.UndefOr[Date] = js.native
  
  /**
    * If set the Calendar will not allow selection of dates in this array.
    */
  var restrictedDates: js.UndefOr[js.Array[Date]] = js.native
}
object IRestrictedDatesOptions {
  
  @scala.inline
  def apply(): IRestrictedDatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestrictedDatesOptions]
  }
  
  @scala.inline
  implicit class IRestrictedDatesOptionsOps[Self <: IRestrictedDatesOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setRestrictedDatesVarargs(value: Date*): Self = this.set("restrictedDates", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedDates(value: js.Array[Date]): Self = this.set("restrictedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedDates: Self = this.set("restrictedDates", js.undefined)
  }
}
