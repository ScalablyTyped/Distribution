package typings.formatjsEcma402Abstract

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluralRulesGetOperandsMod {
  
  @JSImport("@formatjs/ecma402-abstract/PluralRules/GetOperands", "GetOperands")
  @js.native
  def GetOperands(s: String): OperandsRecord = js.native
  
  @js.native
  trait OperandsRecord extends StObject {
    
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
    implicit class OperandsRecordMutableBuilder[Self <: OperandsRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFractionDigits(value: Double): Self = StObject.set(x, "FractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFractionDigitsWithoutTrailing(value: Double): Self = StObject.set(x, "FractionDigitsWithoutTrailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegerDigits(value: Double): Self = StObject.set(x, "IntegerDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfFractionDigits(value: Double): Self = StObject.set(x, "NumberOfFractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfFractionDigitsWithoutTrailing(value: Double): Self = StObject.set(x, "NumberOfFractionDigitsWithoutTrailing", value.asInstanceOf[js.Any])
    }
  }
}
