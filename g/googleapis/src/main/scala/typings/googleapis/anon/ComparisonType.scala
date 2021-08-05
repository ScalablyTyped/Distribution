package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComparisonType extends StObject {
  
  var comparisonType: js.UndefOr[String] = js.undefined
  
  var comparisonValue: js.UndefOr[String] = js.undefined
  
  var expression: js.UndefOr[String] = js.undefined
  
  var matchType: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ComparisonType {
  
  inline def apply(): ComparisonType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparisonType]
  }
  
  extension [Self <: ComparisonType](x: Self) {
    
    inline def setComparisonType(value: String): Self = StObject.set(x, "comparisonType", value.asInstanceOf[js.Any])
    
    inline def setComparisonTypeUndefined: Self = StObject.set(x, "comparisonType", js.undefined)
    
    inline def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    inline def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    inline def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
