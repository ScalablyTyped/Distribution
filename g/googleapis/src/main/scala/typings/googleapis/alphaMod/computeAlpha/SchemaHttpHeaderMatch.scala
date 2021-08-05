package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * matchRule criteria for request header matches.
  */
trait SchemaHttpHeaderMatch extends StObject {
  
  /**
    * The value should exactly match contents of exactMatch. Only one of
    * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var exactMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the HTTP header to match. For matching against the HTTP
    * request&#39;s authority, use a headerMatch with the header name
    * &quot;:authority&quot;. For matching a request&#39;s method, use the
    * headerName &quot;:method&quot;.
    */
  var headerName: js.UndefOr[String] = js.undefined
  
  /**
    * If set to false, the headerMatch is considered a match if the match
    * criteria above are met. If set to true, the headerMatch is considered a
    * match if the match criteria above are NOT met. The default setting is
    * false.
    */
  var invertMatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the header must start with the contents of prefixMatch. Only
    * one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var prefixMatch: js.UndefOr[String] = js.undefined
  
  /**
    * A header with the contents of headerName must exist. The match takes
    * place whether or not the request&#39;s header has a value or not. Only
    * one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var presentMatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The header value must be an integer and its value must be in the range
    * specified in rangeMatch. If the header does not contain an integer,
    * number or is empty, the match fails. For example for a range [-5, 0]   -
    * -3 will match.  - 0 will not match.  - 0.25 will not match.  -
    * -3someString will not match.   Only one of exactMatch, prefixMatch,
    * suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var rangeMatch: js.UndefOr[SchemaInt64RangeMatch] = js.undefined
  
  /**
    * The value of the header must match the regualar expression specified in
    * regexMatch. For regular expression grammar, please see:
    * en.cppreference.com/w/cpp/regex/ecmascript  For matching against a port
    * specified in the HTTP request, use a headerMatch with headerName set to
    * PORT and a regular expression that satisfies the RFC2616 Host
    * header&#39;s port specifier. Only one of exactMatch, prefixMatch,
    * suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var regexMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the header must end with the contents of suffixMatch. Only
    * one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var suffixMatch: js.UndefOr[String] = js.undefined
}
object SchemaHttpHeaderMatch {
  
  inline def apply(): SchemaHttpHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderMatch]
  }
  
  extension [Self <: SchemaHttpHeaderMatch](x: Self) {
    
    inline def setExactMatch(value: String): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
    
    inline def setInvertMatch(value: Boolean): Self = StObject.set(x, "invertMatch", value.asInstanceOf[js.Any])
    
    inline def setInvertMatchUndefined: Self = StObject.set(x, "invertMatch", js.undefined)
    
    inline def setPrefixMatch(value: String): Self = StObject.set(x, "prefixMatch", value.asInstanceOf[js.Any])
    
    inline def setPrefixMatchUndefined: Self = StObject.set(x, "prefixMatch", js.undefined)
    
    inline def setPresentMatch(value: Boolean): Self = StObject.set(x, "presentMatch", value.asInstanceOf[js.Any])
    
    inline def setPresentMatchUndefined: Self = StObject.set(x, "presentMatch", js.undefined)
    
    inline def setRangeMatch(value: SchemaInt64RangeMatch): Self = StObject.set(x, "rangeMatch", value.asInstanceOf[js.Any])
    
    inline def setRangeMatchUndefined: Self = StObject.set(x, "rangeMatch", js.undefined)
    
    inline def setRegexMatch(value: String): Self = StObject.set(x, "regexMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchUndefined: Self = StObject.set(x, "regexMatch", js.undefined)
    
    inline def setSuffixMatch(value: String): Self = StObject.set(x, "suffixMatch", value.asInstanceOf[js.Any])
    
    inline def setSuffixMatchUndefined: Self = StObject.set(x, "suffixMatch", js.undefined)
  }
}
