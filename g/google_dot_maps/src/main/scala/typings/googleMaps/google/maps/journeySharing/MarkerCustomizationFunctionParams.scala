package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import typings.googleMaps.google.maps.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerCustomizationFunctionParams extends StObject {
  
  /**
    * The default options used to create this marker.
    */
  var defaultOptions: MarkerOptions
  
  /**
    * If true, the marker was newly created, and the marker customization
    * function is being called for the first time, before the marker has been
    * added to the map view. False otherwise.
    */
  var isNew: Boolean
  
  /**
    * The marker. Any customizations should be made to this object directly.
    */
  var marker: Marker_
}
object MarkerCustomizationFunctionParams {
  
  inline def apply(defaultOptions: MarkerOptions, isNew: Boolean, marker: Marker_): MarkerCustomizationFunctionParams = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerCustomizationFunctionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerCustomizationFunctionParams] (val x: Self) extends AnyVal {
    
    inline def setDefaultOptions(value: MarkerOptions): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: Marker_): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
  }
}
