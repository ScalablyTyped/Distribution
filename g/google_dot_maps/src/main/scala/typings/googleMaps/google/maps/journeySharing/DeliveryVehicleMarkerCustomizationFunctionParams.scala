package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import typings.googleMaps.google.maps.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryVehicleMarkerCustomizationFunctionParams
  extends StObject
     with MarkerCustomizationFunctionParams {
  
  /**
    * The delivery vehicle represented by this marker.
    */
  var vehicle: DeliveryVehicle
}
object DeliveryVehicleMarkerCustomizationFunctionParams {
  
  inline def apply(defaultOptions: MarkerOptions, isNew: Boolean, marker: Marker_, vehicle: DeliveryVehicle): DeliveryVehicleMarkerCustomizationFunctionParams = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryVehicleMarkerCustomizationFunctionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryVehicleMarkerCustomizationFunctionParams] (val x: Self) extends AnyVal {
    
    inline def setVehicle(value: DeliveryVehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
  }
}
