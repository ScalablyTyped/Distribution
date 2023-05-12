package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import typings.googleMaps.google.maps.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannedStopMarkerCustomizationFunctionParams
  extends StObject
     with DeliveryVehicleMarkerCustomizationFunctionParams {
  
  /**
    * The 0-based index of this stop in the list of remaining stops.
    */
  var stopIndex: Double
}
object PlannedStopMarkerCustomizationFunctionParams {
  
  inline def apply(
    defaultOptions: MarkerOptions,
    isNew: Boolean,
    marker: Marker_,
    stopIndex: Double,
    vehicle: DeliveryVehicle
  ): PlannedStopMarkerCustomizationFunctionParams = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlannedStopMarkerCustomizationFunctionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannedStopMarkerCustomizationFunctionParams] (val x: Self) extends AnyVal {
    
    inline def setStopIndex(value: Double): Self = StObject.set(x, "stopIndex", value.asInstanceOf[js.Any])
  }
}
