package typings.formatjsEcma402Abstract.typesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolsData extends StObject {
  
  var decimal: String = js.native
  
  var exponential: String = js.native
  
  var group: String = js.native
  
  var infinity: String = js.native
  
  var list: String = js.native
  
  var minusSign: String = js.native
  
  var nan: String = js.native
  
  var perMille: String = js.native
  
  var percentSign: String = js.native
  
  var plusSign: String = js.native
  
  var superscriptingExponent: String = js.native
  
  var timeSeparator: String = js.native
}
object SymbolsData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SymbolsDataMutableBuilder[Self <: SymbolsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponential(value: String): Self = StObject.set(x, "exponential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinity(value: String): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinusSign(value: String): Self = StObject.set(x, "minusSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNan(value: String): Self = StObject.set(x, "nan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerMille(value: String): Self = StObject.set(x, "perMille", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentSign(value: String): Self = StObject.set(x, "percentSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlusSign(value: String): Self = StObject.set(x, "plusSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscriptingExponent(value: String): Self = StObject.set(x, "superscriptingExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeparator(value: String): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
  }
}
