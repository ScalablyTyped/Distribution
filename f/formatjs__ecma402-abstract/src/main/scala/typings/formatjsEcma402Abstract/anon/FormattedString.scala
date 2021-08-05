package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedString extends StObject {
  
  var formattedString: String
  
  var roundedNumber: Double
}
object FormattedString {
  
  inline def apply(formattedString: String, roundedNumber: Double): FormattedString = {
    val __obj = js.Dynamic.literal(formattedString = formattedString.asInstanceOf[js.Any], roundedNumber = roundedNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedString]
  }
  
  extension [Self <: FormattedString](x: Self) {
    
    inline def setFormattedString(value: String): Self = StObject.set(x, "formattedString", value.asInstanceOf[js.Any])
    
    inline def setRoundedNumber(value: Double): Self = StObject.set(x, "roundedNumber", value.asInstanceOf[js.Any])
  }
}
