package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Filtering options for tasks in the Delivery Vehicle Location Provider.
  */
trait FleetEngineTaskFilterOptions extends StObject {
  
  /**
    * Exclusive lower bound for the completion time of the task. Used to filter
    * for tasks that were completed after the specified time.
    */
  var completionTimeFrom: js.Date | Null
  
  /**
    * Exclusive upper bound for the completion time of the task. Used to filter
    * for tasks that were completed before the specified time.
    */
  var completionTimeTo: js.Date | Null
  
  /**
    * The state of the task. Valid values are OPEN or CLOSED.
    */
  var state: String | Null
}
object FleetEngineTaskFilterOptions {
  
  inline def apply(): FleetEngineTaskFilterOptions = {
    val __obj = js.Dynamic.literal(completionTimeFrom = null, completionTimeTo = null, state = null)
    __obj.asInstanceOf[FleetEngineTaskFilterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineTaskFilterOptions] (val x: Self) extends AnyVal {
    
    inline def setCompletionTimeFrom(value: js.Date): Self = StObject.set(x, "completionTimeFrom", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeFromNull: Self = StObject.set(x, "completionTimeFrom", null)
    
    inline def setCompletionTimeTo(value: js.Date): Self = StObject.set(x, "completionTimeTo", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeToNull: Self = StObject.set(x, "completionTimeTo", null)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
  }
}
