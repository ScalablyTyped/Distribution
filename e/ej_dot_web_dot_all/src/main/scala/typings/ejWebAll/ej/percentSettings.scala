package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait percentSettings extends StObject {
  
  var decimals: Double
  
  var groupSizes: js.Array[Double]
  
  var pattern: js.Array[String]
  
  var symbol: String
}
object percentSettings {
  
  @scala.inline
  def apply(decimals: Double, groupSizes: js.Array[Double], pattern: js.Array[String], symbol: String): percentSettings = {
    val __obj = js.Dynamic.literal(decimals = decimals.asInstanceOf[js.Any], groupSizes = groupSizes.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[percentSettings]
  }
  
  @scala.inline
  implicit class percentSettingsMutableBuilder[Self <: percentSettings] (val x: Self) extends AnyVal {
    
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
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
