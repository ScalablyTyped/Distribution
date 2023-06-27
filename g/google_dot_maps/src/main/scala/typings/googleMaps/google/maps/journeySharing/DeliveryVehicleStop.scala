package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryVehicleStop extends StObject {
  
  /**
    * The location of the stop.
    */
  var plannedLocation: LatLngLiteral | Null
  
  /**
    * The state of the stop.
    */
  var state: DeliveryVehicleStopState | Null
  
  /**
    * The list of Tasks to be performed at this stop. <ul> <li><code>id</code>:
    * the ID of the task. <li><code>extraDurationMillis</code>: the extra time
    * it takes to perform the task, in milliseconds. </ul>
    */
  var tasks: js.Array[TaskInfo]
}
object DeliveryVehicleStop {
  
  inline def apply(tasks: js.Array[TaskInfo]): DeliveryVehicleStop = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any], plannedLocation = null, state = null)
    __obj.asInstanceOf[DeliveryVehicleStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryVehicleStop] (val x: Self) extends AnyVal {
    
    inline def setPlannedLocation(value: LatLngLiteral): Self = StObject.set(x, "plannedLocation", value.asInstanceOf[js.Any])
    
    inline def setPlannedLocationNull: Self = StObject.set(x, "plannedLocation", null)
    
    inline def setState(value: DeliveryVehicleStopState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setTasks(value: js.Array[TaskInfo]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: TaskInfo*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
