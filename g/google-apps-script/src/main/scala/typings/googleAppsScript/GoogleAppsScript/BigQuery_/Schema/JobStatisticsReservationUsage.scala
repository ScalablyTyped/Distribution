package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatisticsReservationUsage extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var slotMs: js.UndefOr[String] = js.undefined
}
object JobStatisticsReservationUsage {
  
  inline def apply(): JobStatisticsReservationUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatisticsReservationUsage]
  }
  
  extension [Self <: JobStatisticsReservationUsage](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSlotMs(value: String): Self = StObject.set(x, "slotMs", value.asInstanceOf[js.Any])
    
    inline def setSlotMsUndefined: Self = StObject.set(x, "slotMs", js.undefined)
  }
}
