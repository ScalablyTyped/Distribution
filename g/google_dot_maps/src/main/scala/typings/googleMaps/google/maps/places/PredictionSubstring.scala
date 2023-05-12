package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictionSubstring extends StObject {
  
  /**
    * The length of the substring.
    */
  var length: Double
  
  /**
    * The offset to the substring&#39;s start within the description string.
    */
  var offset: Double
}
object PredictionSubstring {
  
  inline def apply(length: Double, offset: Double): PredictionSubstring = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictionSubstring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictionSubstring] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
