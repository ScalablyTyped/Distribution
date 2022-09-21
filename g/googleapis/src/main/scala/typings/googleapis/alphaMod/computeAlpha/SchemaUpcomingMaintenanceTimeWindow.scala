package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpcomingMaintenanceTimeWindow extends StObject {
  
  var earliest: js.UndefOr[String | Null] = js.undefined
  
  var latest: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpcomingMaintenanceTimeWindow {
  
  inline def apply(): SchemaUpcomingMaintenanceTimeWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpcomingMaintenanceTimeWindow]
  }
  
  extension [Self <: SchemaUpcomingMaintenanceTimeWindow](x: Self) {
    
    inline def setEarliest(value: String): Self = StObject.set(x, "earliest", value.asInstanceOf[js.Any])
    
    inline def setEarliestNull: Self = StObject.set(x, "earliest", null)
    
    inline def setEarliestUndefined: Self = StObject.set(x, "earliest", js.undefined)
    
    inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    inline def setLatestNull: Self = StObject.set(x, "latest", null)
    
    inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
  }
}
