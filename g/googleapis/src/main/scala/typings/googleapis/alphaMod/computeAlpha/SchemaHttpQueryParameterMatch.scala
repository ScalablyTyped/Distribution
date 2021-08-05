package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HttpRouteRuleMatch criteria for a request&#39;s query parameter.
  */
trait SchemaHttpQueryParameterMatch extends StObject {
  
  /**
    * The queryParameterMatch matches if the value of the parameter exactly
    * matches the contents of exactMatch. Only one of presentMatch, exactMatch
    * and regexMatch must be set.
    */
  var exactMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the query parameter to match. The query parameter must exist
    * in the request, in the absence of which the request match fails.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that the queryParameterMatch matches if the request contains
    * the query parameter, irrespective of whether the parameter has a value or
    * not. Only one of presentMatch, exactMatch and regexMatch must be set.
    */
  var presentMatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The queryParameterMatch matches if the value of the parameter matches the
    * regular expression specified by regexMatch. For the regular expression
    * grammar, please see en.cppreference.com/w/cpp/regex/ecmascript  Only one
    * of presentMatch, exactMatch and regexMatch must be set.
    */
  var regexMatch: js.UndefOr[String] = js.undefined
}
object SchemaHttpQueryParameterMatch {
  
  inline def apply(): SchemaHttpQueryParameterMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpQueryParameterMatch]
  }
  
  extension [Self <: SchemaHttpQueryParameterMatch](x: Self) {
    
    inline def setExactMatch(value: String): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPresentMatch(value: Boolean): Self = StObject.set(x, "presentMatch", value.asInstanceOf[js.Any])
    
    inline def setPresentMatchUndefined: Self = StObject.set(x, "presentMatch", js.undefined)
    
    inline def setRegexMatch(value: String): Self = StObject.set(x, "regexMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchUndefined: Self = StObject.set(x, "regexMatch", js.undefined)
  }
}
