package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatistics2ReservationUsage extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var slotMs: js.UndefOr[String] = js.undefined
}
object JobStatistics2ReservationUsage {
  
  @scala.inline
  def apply(): JobStatistics2ReservationUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics2ReservationUsage]
  }
  
  @scala.inline
  implicit class JobStatistics2ReservationUsageMutableBuilder[Self <: JobStatistics2ReservationUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSlotMs(value: String): Self = StObject.set(x, "slotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotMsUndefined: Self = StObject.set(x, "slotMs", js.undefined)
  }
}
