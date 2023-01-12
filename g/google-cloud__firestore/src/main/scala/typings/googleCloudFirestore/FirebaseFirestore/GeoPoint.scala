package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoPoint extends StObject {
  
  /**
    * Returns true if this `GeoPoint` is equal to the provided one.
    *
    * @param other The `GeoPoint` to compare against.
    * @return true if this `GeoPoint` is equal to the provided one.
    */
  def isEqual(other: GeoPoint): Boolean
  
  val latitude: Double
  
  val longitude: Double
}
object GeoPoint {
  
  inline def apply(isEqual: GeoPoint => Boolean, latitude: Double, longitude: Double): GeoPoint = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoPoint] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: GeoPoint => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
