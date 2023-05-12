package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import typings.googleMaps.google.maps.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskMarkerCustomizationFunctionParams
  extends StObject
     with DeliveryVehicleMarkerCustomizationFunctionParams {
  
  /**
    * The task location represented by this marker.
    */
  var task: Task
}
object TaskMarkerCustomizationFunctionParams {
  
  inline def apply(
    defaultOptions: MarkerOptions,
    isNew: Boolean,
    marker: Marker_,
    task: Task,
    vehicle: DeliveryVehicle
  ): TaskMarkerCustomizationFunctionParams = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskMarkerCustomizationFunctionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskMarkerCustomizationFunctionParams] (val x: Self) extends AnyVal {
    
    inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
