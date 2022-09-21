package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceStatusUpcomingMaintenance extends StObject {
  
  /**
    * Indicates if the maintenance can be customer triggered. See go/sf-ctm-design for more details
    */
  var canReschedule: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaResourceStatusUpcomingMaintenance {
  
  inline def apply(): SchemaResourceStatusUpcomingMaintenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceStatusUpcomingMaintenance]
  }
  
  extension [Self <: SchemaResourceStatusUpcomingMaintenance](x: Self) {
    
    inline def setCanReschedule(value: Boolean): Self = StObject.set(x, "canReschedule", value.asInstanceOf[js.Any])
    
    inline def setCanRescheduleNull: Self = StObject.set(x, "canReschedule", null)
    
    inline def setCanRescheduleUndefined: Self = StObject.set(x, "canReschedule", js.undefined)
  }
}
