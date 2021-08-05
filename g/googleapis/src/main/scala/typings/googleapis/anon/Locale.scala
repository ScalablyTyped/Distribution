package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: js.UndefOr[String] = js.undefined
  
  var ruleResults: js.UndefOr[StringDictionary[LocalizedRuleName]] = js.undefined
}
object Locale {
  
  inline def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRuleResults(value: StringDictionary[LocalizedRuleName]): Self = StObject.set(x, "ruleResults", value.asInstanceOf[js.Any])
    
    inline def setRuleResultsUndefined: Self = StObject.set(x, "ruleResults", js.undefined)
  }
}
