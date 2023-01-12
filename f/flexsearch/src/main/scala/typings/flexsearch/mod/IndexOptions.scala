package typings.flexsearch.mod

import typings.flexsearch.flexsearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexOptions[T, Store /* <: StoreOption */] extends StObject {
  
  var boost: js.UndefOr[
    js.Function3[/* words */ js.Array[String], /* term */ String, /* index */ Double, Double]
  ] = js.undefined
  
  var cache: js.UndefOr[Boolean | Double] = js.undefined
  
  // Language-specific Options and Encoding
  var charset: js.UndefOr[CharsetOptions | String] = js.undefined
  
  var context: js.UndefOr[Boolean | (IndexOptions[T, Store]) | ContextOptions] = js.undefined
  
  var encode: js.UndefOr[Encoders] = js.undefined
  
  var filter: js.UndefOr[`false` | String | FilterArray | FilterFunction] = js.undefined
  
  var language: js.UndefOr[LanguageOptions | String] = js.undefined
  
  var matcher: js.UndefOr[`false` | String | Matcher | UnknownFunction] = js.undefined
  
  var optimize: js.UndefOr[Boolean] = js.undefined
  
  var preset: js.UndefOr[Preset] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var stemmer: js.UndefOr[`false` | String | Stemmer | UnknownFunction] = js.undefined
  
  var tokenize: js.UndefOr[Tokenizer] = js.undefined
}
object IndexOptions {
  
  inline def apply[T, Store /* <: StoreOption */](): IndexOptions[T, Store] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexOptions[T, Store]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexOptions[?, ?], T, Store /* <: StoreOption */] (val x: Self & (IndexOptions[T, Store])) extends AnyVal {
    
    inline def setBoost(value: (/* words */ js.Array[String], /* term */ String, /* index */ Double) => Double): Self = StObject.set(x, "boost", js.Any.fromFunction3(value))
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setCache(value: Boolean | Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCharset(value: CharsetOptions | String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setContext(value: Boolean | (IndexOptions[T, Store]) | ContextOptions): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEncode(value: Encoders): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEncodeFunction1(value: /* x */ String => js.Array[String]): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setFilter(value: `false` | String | FilterArray | FilterFunction): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFunction1(value: /* x */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setLanguage(value: LanguageOptions | String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMatcher(value: `false` | String | Matcher | UnknownFunction): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    inline def setOptimize(value: Boolean): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    inline def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
    
    inline def setPreset(value: Preset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setStemmer(value: `false` | String | Stemmer | UnknownFunction): Self = StObject.set(x, "stemmer", value.asInstanceOf[js.Any])
    
    inline def setStemmerUndefined: Self = StObject.set(x, "stemmer", js.undefined)
    
    inline def setTokenize(value: Tokenizer): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
    
    inline def setTokenizeFunction1(value: /* x */ String => js.Array[String]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    
    inline def setTokenizeUndefined: Self = StObject.set(x, "tokenize", js.undefined)
  }
}
