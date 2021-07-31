package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleResults extends StObject {
  
  var locale: js.UndefOr[String] = js.undefined
  
  var ruleResults: js.UndefOr[StringDictionary[Groups]] = js.undefined
}
object RuleResults {
  
  @scala.inline
  def apply(): RuleResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleResults]
  }
  
  @scala.inline
  implicit class RuleResultsMutableBuilder[Self <: RuleResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setRuleResults(value: StringDictionary[Groups]): Self = StObject.set(x, "ruleResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleResultsUndefined: Self = StObject.set(x, "ruleResults", js.undefined)
  }
}
