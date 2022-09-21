package typings.flexsearch.mod

import typings.flexsearch.flexsearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageOptions extends StObject {
  
  var filter: `false` | String | FilterArray | FilterFunction
  
  var matcher: `false` | String | Matcher | UnknownFunction
  
  var stemmer: `false` | String | Stemmer | UnknownFunction
}
object LanguageOptions {
  
  inline def apply(
    filter: `false` | String | FilterArray | FilterFunction,
    matcher: `false` | String | Matcher | UnknownFunction,
    stemmer: `false` | String | Stemmer | UnknownFunction
  ): LanguageOptions = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], stemmer = stemmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageOptions]
  }
  
  extension [Self <: LanguageOptions](x: Self) {
    
    inline def setFilter(value: `false` | String | FilterArray | FilterFunction): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFunction1(value: /* x */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setMatcher(value: `false` | String | Matcher | UnknownFunction): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    inline def setStemmer(value: `false` | String | Stemmer | UnknownFunction): Self = StObject.set(x, "stemmer", value.asInstanceOf[js.Any])
  }
}
