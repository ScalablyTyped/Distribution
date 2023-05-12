package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.anon.ExtraDurationMillis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryVehicleStop extends StObject {
  
  /**
    * The list of Tasks to be performed at this stop. <ul> <li><code>id</code>:
    * the ID of the task. <li><code>extraDurationMillis</code>: the extra time
    * it takes to perform the task, in milliseconds. </ul>
    */
  var tasks: js.Array[ExtraDurationMillis]
}
object DeliveryVehicleStop {
  
  inline def apply(tasks: js.Array[ExtraDurationMillis]): DeliveryVehicleStop = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryVehicleStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryVehicleStop] (val x: Self) extends AnyVal {
    
    inline def setTasks(value: js.Array[ExtraDurationMillis]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: ExtraDurationMillis*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
