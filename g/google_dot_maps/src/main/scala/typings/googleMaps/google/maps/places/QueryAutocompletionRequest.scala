package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An QueryAutocompletion request to be sent to the
  * <code>QueryAutocompleteService</code>.
  */
trait QueryAutocompletionRequest extends StObject {
  
  /**
    * Bounds for prediction biasing. Predictions will be biased towards, but
    * not restricted to, the given <code>bounds</code>. Both
    * <code>location</code> and <code>radius</code> will be ignored if
    * <code>bounds</code> is set.
    */
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  /**
    * The user entered input string.
    */
  var input: String
  
  /**
    * Location for prediction biasing. Predictions will be biased towards the
    * given <code>location</code> and <code>radius</code>. Alternatively,
    * <code>bounds</code> can be used.
    */
  var location: js.UndefOr[LatLng] = js.undefined
  
  /**
    * The character position in the input term at which the service uses text
    * for predictions (the position of the cursor in the input field).
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The radius of the area used for prediction biasing. The
    * <code>radius</code> is specified in meters, and must always be
    * accompanied by a <code>location</code> property. Alternatively,
    * <code>bounds</code> can be used.
    */
  var radius: js.UndefOr[Double] = js.undefined
}
object QueryAutocompletionRequest {
  
  inline def apply(input: String): QueryAutocompletionRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompletionRequest]
  }
  
  extension [Self <: QueryAutocompletionRequest](x: Self) {
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
