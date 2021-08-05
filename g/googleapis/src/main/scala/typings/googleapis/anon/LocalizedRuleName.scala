package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedRuleName extends StObject {
  
  var localizedRuleName: js.UndefOr[String] = js.undefined
  
  var ruleImpact: js.UndefOr[Double] = js.undefined
  
  var urlBlocks: js.UndefOr[js.Array[Header]] = js.undefined
}
object LocalizedRuleName {
  
  inline def apply(): LocalizedRuleName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedRuleName]
  }
  
  extension [Self <: LocalizedRuleName](x: Self) {
    
    inline def setLocalizedRuleName(value: String): Self = StObject.set(x, "localizedRuleName", value.asInstanceOf[js.Any])
    
    inline def setLocalizedRuleNameUndefined: Self = StObject.set(x, "localizedRuleName", js.undefined)
    
    inline def setRuleImpact(value: Double): Self = StObject.set(x, "ruleImpact", value.asInstanceOf[js.Any])
    
    inline def setRuleImpactUndefined: Self = StObject.set(x, "ruleImpact", js.undefined)
    
    inline def setUrlBlocks(value: js.Array[Header]): Self = StObject.set(x, "urlBlocks", value.asInstanceOf[js.Any])
    
    inline def setUrlBlocksUndefined: Self = StObject.set(x, "urlBlocks", js.undefined)
    
    inline def setUrlBlocksVarargs(value: Header*): Self = StObject.set(x, "urlBlocks", js.Array(value :_*))
  }
}
