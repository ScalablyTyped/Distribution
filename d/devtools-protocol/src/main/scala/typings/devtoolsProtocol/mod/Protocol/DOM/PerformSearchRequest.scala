package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformSearchRequest extends StObject {
  
  /**
    * True to search in user agent shadow DOM.
    */
  var includeUserAgentShadowDOM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Plain text or query selector or XPath search query.
    */
  var query: String
}
object PerformSearchRequest {
  
  inline def apply(query: String): PerformSearchRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformSearchRequest]
  }
  
  extension [Self <: PerformSearchRequest](x: Self) {
    
    inline def setIncludeUserAgentShadowDOM(value: Boolean): Self = StObject.set(x, "includeUserAgentShadowDOM", value.asInstanceOf[js.Any])
    
    inline def setIncludeUserAgentShadowDOMUndefined: Self = StObject.set(x, "includeUserAgentShadowDOM", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
