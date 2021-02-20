package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizedRuleName extends StObject {
  
  var localizedRuleName: js.UndefOr[String] = js.native
  
  var ruleImpact: js.UndefOr[Double] = js.native
  
  var urlBlocks: js.UndefOr[js.Array[Header]] = js.native
}
object LocalizedRuleName {
  
  @scala.inline
  def apply(): LocalizedRuleName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedRuleName]
  }
  
  @scala.inline
  implicit class LocalizedRuleNameMutableBuilder[Self <: LocalizedRuleName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalizedRuleName(value: String): Self = StObject.set(x, "localizedRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedRuleNameUndefined: Self = StObject.set(x, "localizedRuleName", js.undefined)
    
    @scala.inline
    def setRuleImpact(value: Double): Self = StObject.set(x, "ruleImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleImpactUndefined: Self = StObject.set(x, "ruleImpact", js.undefined)
    
    @scala.inline
    def setUrlBlocks(value: js.Array[Header]): Self = StObject.set(x, "urlBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlBlocksUndefined: Self = StObject.set(x, "urlBlocks", js.undefined)
    
    @scala.inline
    def setUrlBlocksVarargs(value: Header*): Self = StObject.set(x, "urlBlocks", js.Array(value :_*))
  }
}
