package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictionTerm extends StObject {
  
  /** start position of this term in the description, measured in Unicode characters. */
  var offset: Double
  
  /** containing the text of the term. */
  var value: String
}
object PredictionTerm {
  
  inline def apply(offset: Double, value: String): PredictionTerm = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictionTerm]
  }
  
  extension [Self <: PredictionTerm](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
