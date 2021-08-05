package typings.formatjsEcma402Abstract

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOperandsMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/PluralRules/GetOperands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetOperands(s: String): OperandsRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOperands")(s.asInstanceOf[js.Any]).asInstanceOf[OperandsRecord]
  
  trait OperandsRecord extends StObject {
    
    /**
      * Number of visible fractional digits in [[Number]], with trailing zeroes.
      */
    var FractionDigits: Double
    
    /**
      * Number of visible fractional digits in [[Number]], without trailing zeroes.
      */
    var FractionDigitsWithoutTrailing: Double
    
    /**
      * Number of digits of `number`
      */
    var IntegerDigits: Double
    
    /**
      * Absolute value of the source number (integer and decimals)
      */
    var Number: Double
    
    /**
      * Number of visible fraction digits in [[Number]], with trailing zeroes.
      */
    var NumberOfFractionDigits: Double
    
    /**
      * Number of visible fraction digits in [[Number]], without trailing zeroes.
      */
    var NumberOfFractionDigitsWithoutTrailing: Double
  }
  object OperandsRecord {
    
    inline def apply(
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
    
    extension [Self <: OperandsRecord](x: Self) {
      
      inline def setFractionDigits(value: Double): Self = StObject.set(x, "FractionDigits", value.asInstanceOf[js.Any])
      
      inline def setFractionDigitsWithoutTrailing(value: Double): Self = StObject.set(x, "FractionDigitsWithoutTrailing", value.asInstanceOf[js.Any])
      
      inline def setIntegerDigits(value: Double): Self = StObject.set(x, "IntegerDigits", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      inline def setNumberOfFractionDigits(value: Double): Self = StObject.set(x, "NumberOfFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setNumberOfFractionDigitsWithoutTrailing(value: Double): Self = StObject.set(x, "NumberOfFractionDigitsWithoutTrailing", value.asInstanceOf[js.Any])
    }
  }
}
