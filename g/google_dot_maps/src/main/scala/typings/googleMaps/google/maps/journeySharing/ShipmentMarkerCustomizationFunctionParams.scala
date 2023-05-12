package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import typings.googleMaps.google.maps.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShipmentMarkerCustomizationFunctionParams
  extends StObject
     with MarkerCustomizationFunctionParams {
  
  /**
    * Information for the task associated with this marker.
    */
  var taskTrackingInfo: TaskTrackingInfo
}
object ShipmentMarkerCustomizationFunctionParams {
  
  inline def apply(defaultOptions: MarkerOptions, isNew: Boolean, marker: Marker_, taskTrackingInfo: TaskTrackingInfo): ShipmentMarkerCustomizationFunctionParams = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], taskTrackingInfo = taskTrackingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShipmentMarkerCustomizationFunctionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShipmentMarkerCustomizationFunctionParams] (val x: Self) extends AnyVal {
    
    inline def setTaskTrackingInfo(value: TaskTrackingInfo): Self = StObject.set(x, "taskTrackingInfo", value.asInstanceOf[js.Any])
  }
}
