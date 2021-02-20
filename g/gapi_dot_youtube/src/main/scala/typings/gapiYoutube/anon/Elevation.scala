package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elevation extends StObject {
  
  /**
    * Altitude above the WGS 84 reference ellipsoid, in meters.
    */
  var elevation: Double = js.native
  
  /**
    * Latitude in degrees.
    */
  var latitude: Double = js.native
  
  /**
    * Longitude in degrees.
    */
  var longitude: Double = js.native
}
object Elevation {
  
  @scala.inline
  def apply(elevation: Double, latitude: Double, longitude: Double): Elevation = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elevation]
  }
  
  @scala.inline
  implicit class ElevationMutableBuilder[Self <: Elevation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
