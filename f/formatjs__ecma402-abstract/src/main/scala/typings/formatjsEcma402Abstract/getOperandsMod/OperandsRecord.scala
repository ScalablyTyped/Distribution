package typings.formatjsEcma402Abstract.getOperandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperandsRecord extends js.Object {
  
  /**
    * Number of visible fractional digits in [[Number]], with trailing zeroes.
    */
  var FractionDigits: Double = js.native
  
  /**
    * Number of visible fractional digits in [[Number]], without trailing zeroes.
    */
  var FractionDigitsWithoutTrailing: Double = js.native
  
  /**
    * Number of digits of `number`
    */
  var IntegerDigits: Double = js.native
  
  /**
    * Absolute value of the source number (integer and decimals)
    */
  var Number: Double = js.native
  
  /**
    * Number of visible fraction digits in [[Number]], with trailing zeroes.
    */
  var NumberOfFractionDigits: Double = js.native
  
  /**
    * Number of visible fraction digits in [[Number]], without trailing zeroes.
    */
  var NumberOfFractionDigitsWithoutTrailing: Double = js.native
}
object OperandsRecord {
  
  @scala.inline
  def apply(
    FractionDigits: Double,
    FractionDigitsWithoutTrailing: Double,
    IntegerDigits: Double,
    Number: Double,
    NumberOfFractionDigits: Double,
    NumberOfFractionDigitsWithoutTrailing: Double
  ): OperandsRecord = {
    val __obj = js.Dynamic.literal(FractionDigits = FractionDigits.asInstanceOf[js.Any], FractionDigitsWithoutTrailing = FractionDigitsWithoutTrailing.asInstanceOf[js.Any], IntegerDigits = IntegerDigits.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], NumberOfFractionDigits = NumberOfFractionDigits.asInstanceOf[js.Any], NumberOfFractionDigitsWithoutTrailing = NumberOfFractionDigitsWithoutTrailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperandsRecord]
  }
  
  @scala.inline
  implicit class OperandsRecordOps[Self <: OperandsRecord] (val x: Self) extends AnyVal {
    
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
    def setFractionDigits(value: Double): Self = this.set("FractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionDigitsWithoutTrailing(value: Double): Self = this.set("FractionDigitsWithoutTrailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerDigits(value: Double): Self = this.set("IntegerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("Number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfFractionDigits(value: Double): Self = this.set("NumberOfFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfFractionDigitsWithoutTrailing(value: Double): Self = this.set("NumberOfFractionDigitsWithoutTrailing", value.asInstanceOf[js.Any])
  }
}
