package typings.firefoxWebextBrowser.browser.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnabledRulesetsUpdateRulesetOptions extends StObject {
  
  var disableRulesetIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var enableRulesetIds: js.UndefOr[js.Array[String]] = js.undefined
}
object UpdateEnabledRulesetsUpdateRulesetOptions {
  
  inline def apply(): UpdateEnabledRulesetsUpdateRulesetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEnabledRulesetsUpdateRulesetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEnabledRulesetsUpdateRulesetOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableRulesetIds(value: js.Array[String]): Self = StObject.set(x, "disableRulesetIds", value.asInstanceOf[js.Any])
    
    inline def setDisableRulesetIdsUndefined: Self = StObject.set(x, "disableRulesetIds", js.undefined)
    
    inline def setDisableRulesetIdsVarargs(value: String*): Self = StObject.set(x, "disableRulesetIds", js.Array(value*))
    
    inline def setEnableRulesetIds(value: js.Array[String]): Self = StObject.set(x, "enableRulesetIds", value.asInstanceOf[js.Any])
    
    inline def setEnableRulesetIdsUndefined: Self = StObject.set(x, "enableRulesetIds", js.undefined)
    
    inline def setEnableRulesetIdsVarargs(value: String*): Self = StObject.set(x, "enableRulesetIds", js.Array(value*))
  }
}
