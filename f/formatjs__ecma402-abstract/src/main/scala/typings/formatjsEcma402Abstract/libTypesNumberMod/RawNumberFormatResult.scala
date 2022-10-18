package typings.formatjsEcma402Abstract.libTypesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawNumberFormatResult extends StObject {
  
  var formattedString: String
  
  var integerDigitsCount: Double
  
  var roundedNumber: Double
}
object RawNumberFormatResult {
  
  inline def apply(formattedString: String, integerDigitsCount: Double, roundedNumber: Double): RawNumberFormatResult = {
    val __obj = js.Dynamic.literal(formattedString = formattedString.asInstanceOf[js.Any], integerDigitsCount = integerDigitsCount.asInstanceOf[js.Any], roundedNumber = roundedNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawNumberFormatResult]
  }
  
  extension [Self <: RawNumberFormatResult](x: Self) {
    
    inline def setFormattedString(value: String): Self = StObject.set(x, "formattedString", value.asInstanceOf[js.Any])
    
    inline def setIntegerDigitsCount(value: Double): Self = StObject.set(x, "integerDigitsCount", value.asInstanceOf[js.Any])
    
    inline def setRoundedNumber(value: Double): Self = StObject.set(x, "roundedNumber", value.asInstanceOf[js.Any])
  }
}
