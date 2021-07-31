package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationResponse extends StObject {
  
  /** The accuracy of the estimated location, in meters. This represents the radius of a circle around the given location. */
  var accuracy: Double
  
  /** The user's estimated latitude and longitude, in degrees. Contains one `lat` and one `lng` subfield. */
  var location: LatLngLiteral
}
object GeolocationResponse {
  
  @scala.inline
  def apply(accuracy: Double, location: LatLngLiteral): GeolocationResponse = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationResponse]
  }
  
  @scala.inline
  implicit class GeolocationResponseMutableBuilder[Self <: GeolocationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
