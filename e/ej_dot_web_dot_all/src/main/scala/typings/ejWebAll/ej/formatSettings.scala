package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait formatSettings extends StObject {
  
  var currency: currencySettings
  
  var decimals: Double
  
  var groupSizes: js.Array[Double]
  
  var pattern: js.Array[String]
  
  var percent: percentSettings
}
object formatSettings {
  
  inline def apply(
    currency: currencySettings,
    decimals: Double,
    groupSizes: js.Array[Double],
    pattern: js.Array[String],
    percent: percentSettings
  ): formatSettings = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSizes = groupSizes.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[formatSettings]
  }
  
  extension [Self <: formatSettings](x: Self) {
    
    inline def setCurrency(value: currencySettings): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setGroupSizes(value: js.Array[Double]): Self = StObject.set(x, "groupSizes", value.asInstanceOf[js.Any])
    
    inline def setGroupSizesVarargs(value: Double*): Self = StObject.set(x, "groupSizes", js.Array(value :_*))
    
    inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value :_*))
    
    inline def setPercent(value: percentSettings): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
