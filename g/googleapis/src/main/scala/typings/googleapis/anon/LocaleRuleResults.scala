package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleRuleResults extends StObject {
  
  var locale: js.UndefOr[String] = js.undefined
  
  var ruleResults: js.UndefOr[StringDictionary[Beta]] = js.undefined
}
object LocaleRuleResults {
  
  @scala.inline
  def apply(): LocaleRuleResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleRuleResults]
  }
  
  @scala.inline
  implicit class LocaleRuleResultsMutableBuilder[Self <: LocaleRuleResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setRuleResults(value: StringDictionary[Beta]): Self = StObject.set(x, "ruleResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleResultsUndefined: Self = StObject.set(x, "ruleResults", js.undefined)
  }
}
