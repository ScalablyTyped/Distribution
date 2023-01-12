package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines information about an aspect of the place that users have reviewed.
  * @deprecated This interface is no longer used.
  */
trait PlaceAspectRating extends StObject {
  
  /**
    * The rating of this aspect. For individual reviews this is an integer from
    * 0 to 3. For aggregated ratings of a place this is an integer from 0
    * to 30.
    */
  var rating: Double
  
  /**
    * The aspect type. For example, <code>"food"</code>, <code>"decor"</code>,
    * <code>"service"</code>, or <code>"overall"</code>.
    */
  var `type`: String
}
object PlaceAspectRating {
  
  inline def apply(rating: Double, `type`: String): PlaceAspectRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAspectRating]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceAspectRating] (val x: Self) extends AnyVal {
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
