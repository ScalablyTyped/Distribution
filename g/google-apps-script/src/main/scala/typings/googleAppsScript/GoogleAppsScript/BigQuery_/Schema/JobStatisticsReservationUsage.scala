package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatisticsReservationUsage extends js.Object {
  
  var name: js.UndefOr[String] = js.native
  
  var slotMs: js.UndefOr[String] = js.native
}
object JobStatisticsReservationUsage {
  
  @scala.inline
  def apply(): JobStatisticsReservationUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatisticsReservationUsage]
  }
  
  @scala.inline
  implicit class JobStatisticsReservationUsageOps[Self <: JobStatisticsReservationUsage] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSlotMs(value: String): Self = this.set("slotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotMs: Self = this.set("slotMs", js.undefined)
  }
}
