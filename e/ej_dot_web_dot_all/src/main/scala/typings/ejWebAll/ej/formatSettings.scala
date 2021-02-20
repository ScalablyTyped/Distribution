package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait formatSettings extends StObject {
  
  var currency: currencySettings = js.native
  
  var decimals: Double = js.native
  
  var groupSizes: js.Array[Double] = js.native
  
  var pattern: js.Array[String] = js.native
  
  var percent: percentSettings = js.native
}
object formatSettings {
  
  @scala.inline
  def apply(
    currency: currencySettings,
    decimals: Double,
    groupSizes: js.Array[Double],
    pattern: js.Array[String],
    percent: percentSettings
  ): formatSettings = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSizes = groupSizes.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[formatSettings]
  }
  
  @scala.inline
  implicit class formatSettingsMutableBuilder[Self <: formatSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: currencySettings): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSizes(value: js.Array[Double]): Self = StObject.set(x, "groupSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSizesVarargs(value: Double*): Self = StObject.set(x, "groupSizes", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value :_*))
    
    @scala.inline
    def setPercent(value: percentSettings): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
