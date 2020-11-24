package typings.eggMultipart.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentDate extends js.Object {
  
  var currentDate: js.UndefOr[String | Double | Date] = js.native
  
  var endDate: js.UndefOr[String | Double | Date] = js.native
  
  var iterator: js.UndefOr[Boolean] = js.native
  
  var tz: js.UndefOr[String] = js.native
  
  var utc: js.UndefOr[Boolean] = js.native
}
object CurrentDate {
  
  @scala.inline
  def apply(): CurrentDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentDate]
  }
  
  @scala.inline
  implicit class CurrentDateOps[Self <: CurrentDate] (val x: Self) extends AnyVal {
    
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
    def setCurrentDate(value: String | Double | Date): Self = this.set("currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDate: Self = this.set("currentDate", js.undefined)
    
    @scala.inline
    def setEndDate(value: String | Double | Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setIterator(value: Boolean): Self = this.set("iterator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterator: Self = this.set("iterator", js.undefined)
    
    @scala.inline
    def setTz(value: String): Self = this.set("tz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTz: Self = this.set("tz", js.undefined)
    
    @scala.inline
    def setUtc(value: Boolean): Self = this.set("utc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtc: Self = this.set("utc", js.undefined)
  }
}
