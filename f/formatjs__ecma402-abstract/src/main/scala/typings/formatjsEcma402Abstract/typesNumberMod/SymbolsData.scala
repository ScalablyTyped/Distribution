package typings.formatjsEcma402Abstract.typesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolsData extends StObject {
  
  var decimal: String
  
  var exponential: String
  
  var group: String
  
  var infinity: String
  
  var list: String
  
  var minusSign: String
  
  var nan: String
  
  var perMille: String
  
  var percentSign: String
  
  var plusSign: String
  
  var superscriptingExponent: String
  
  var timeSeparator: String
}
object SymbolsData {
  
  inline def apply(
    decimal: String,
    exponential: String,
    group: String,
    infinity: String,
    list: String,
    minusSign: String,
    nan: String,
    perMille: String,
    percentSign: String,
    plusSign: String,
    superscriptingExponent: String,
    timeSeparator: String
  ): SymbolsData = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], exponential = exponential.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], infinity = infinity.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], minusSign = minusSign.asInstanceOf[js.Any], nan = nan.asInstanceOf[js.Any], perMille = perMille.asInstanceOf[js.Any], percentSign = percentSign.asInstanceOf[js.Any], plusSign = plusSign.asInstanceOf[js.Any], superscriptingExponent = superscriptingExponent.asInstanceOf[js.Any], timeSeparator = timeSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolsData]
  }
  
  extension [Self <: SymbolsData](x: Self) {
    
    inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setExponential(value: String): Self = StObject.set(x, "exponential", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setInfinity(value: String): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setMinusSign(value: String): Self = StObject.set(x, "minusSign", value.asInstanceOf[js.Any])
    
    inline def setNan(value: String): Self = StObject.set(x, "nan", value.asInstanceOf[js.Any])
    
    inline def setPerMille(value: String): Self = StObject.set(x, "perMille", value.asInstanceOf[js.Any])
    
    inline def setPercentSign(value: String): Self = StObject.set(x, "percentSign", value.asInstanceOf[js.Any])
    
    inline def setPlusSign(value: String): Self = StObject.set(x, "plusSign", value.asInstanceOf[js.Any])
    
    inline def setSuperscriptingExponent(value: String): Self = StObject.set(x, "superscriptingExponent", value.asInstanceOf[js.Any])
    
    inline def setTimeSeparator(value: String): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
  }
}
