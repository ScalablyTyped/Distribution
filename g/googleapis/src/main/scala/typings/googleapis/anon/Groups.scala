package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  var localizedRuleName: js.UndefOr[String] = js.undefined
  
  var ruleImpact: js.UndefOr[Double] = js.undefined
  
  var summary: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.undefined
  
  var urlBlocks: js.UndefOr[js.Array[Urls]] = js.undefined
}
object Groups {
  
  @scala.inline
  def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setLocalizedRuleName(value: String): Self = StObject.set(x, "localizedRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedRuleNameUndefined: Self = StObject.set(x, "localizedRuleName", js.undefined)
    
    @scala.inline
    def setRuleImpact(value: Double): Self = StObject.set(x, "ruleImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleImpactUndefined: Self = StObject.set(x, "ruleImpact", js.undefined)
    
    @scala.inline
    def setSummary(value: SchemaPagespeedApiFormatStringV2): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setUrlBlocks(value: js.Array[Urls]): Self = StObject.set(x, "urlBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlBlocksUndefined: Self = StObject.set(x, "urlBlocks", js.undefined)
    
    @scala.inline
    def setUrlBlocksVarargs(value: Urls*): Self = StObject.set(x, "urlBlocks", js.Array(value :_*))
  }
}
