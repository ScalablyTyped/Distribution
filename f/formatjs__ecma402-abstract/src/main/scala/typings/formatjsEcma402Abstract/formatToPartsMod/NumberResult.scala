package typings.formatjsEcma402Abstract.formatToPartsMod

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`-1`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`0`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberResult extends js.Object {
  
  var exponent: Double = js.native
  
  var formattedString: String = js.native
  
  var magnitude: Double = js.native
  
  var roundedNumber: Double = js.native
  
  var sign: `-1` | `0` | `1` = js.native
}
object NumberResult {
  
  @scala.inline
  def apply(
    exponent: Double,
    formattedString: String,
    magnitude: Double,
    roundedNumber: Double,
    sign: `-1` | `0` | `1`
  ): NumberResult = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], formattedString = formattedString.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any], roundedNumber = roundedNumber.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberResult]
  }
  
  @scala.inline
  implicit class NumberResultOps[Self <: NumberResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExponent(value: Double): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedString(value: String): Self = this.set("formattedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnitude(value: Double): Self = this.set("magnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedNumber(value: Double): Self = this.set("roundedNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign(value: `-1` | `0` | `1`): Self = this.set("sign", value.asInstanceOf[js.Any])
  }
}
