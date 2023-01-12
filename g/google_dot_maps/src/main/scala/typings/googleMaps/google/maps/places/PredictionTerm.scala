package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a prediction term.
  */
trait PredictionTerm extends StObject {
  
  /**
    * The offset, in unicode characters, of the start of this term in the
    * description of the place.
    */
  var offset: Double
  
  /**
    * The value of this term, for example, &quot;Taco Bell&quot;.
    */
  var value: String
}
object PredictionTerm {
  
  inline def apply(offset: Double, value: String): PredictionTerm = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictionTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictionTerm] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
