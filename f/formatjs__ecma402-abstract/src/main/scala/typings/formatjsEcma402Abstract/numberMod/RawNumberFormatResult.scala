package typings.formatjsEcma402Abstract.numberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawNumberFormatResult extends StObject {
  
  var formattedString: String = js.native
  
  var integerDigitsCount: Double = js.native
  
  var roundedNumber: Double = js.native
}
object RawNumberFormatResult {
  
  @scala.inline
  def apply(formattedString: String, integerDigitsCount: Double, roundedNumber: Double): RawNumberFormatResult = {
    val __obj = js.Dynamic.literal(formattedString = formattedString.asInstanceOf[js.Any], integerDigitsCount = integerDigitsCount.asInstanceOf[js.Any], roundedNumber = roundedNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawNumberFormatResult]
  }
  
  @scala.inline
  implicit class RawNumberFormatResultMutableBuilder[Self <: RawNumberFormatResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedString(value: String): Self = StObject.set(x, "formattedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerDigitsCount(value: Double): Self = StObject.set(x, "integerDigitsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedNumber(value: Double): Self = StObject.set(x, "roundedNumber", value.asInstanceOf[js.Any])
  }
}
