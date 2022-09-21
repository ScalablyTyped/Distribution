package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A point of view object which specifies the camera&#39;s orientation at the
  * Street View panorama&#39;s position. The point of view is defined as
  * heading and pitch.
  */
trait StreetViewPov extends StObject {
  
  /**
    * The camera heading in degrees relative to <code>true</code> north. True
    * north is 0&deg;, east is 90&deg;, south is 180&deg;, west is 270&deg;.
    */
  var heading: Double
  
  /**
    * The camera pitch in degrees, relative to the street view vehicle. Ranges
    * from 90&deg; (directly upwards) to -90&deg; (directly downwards).
    */
  var pitch: Double
}
object StreetViewPov {
  
  inline def apply(heading: Double, pitch: Double): StreetViewPov = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewPov]
  }
  
  extension [Self <: StreetViewPov](x: Self) {
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
  }
}
