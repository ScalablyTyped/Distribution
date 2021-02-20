package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformSearchRequest extends StObject {
  
  /**
    * True to search in user agent shadow DOM.
    */
  var includeUserAgentShadowDOM: js.UndefOr[Boolean] = js.native
  
  /**
    * Plain text or query selector or XPath search query.
    */
  var query: String = js.native
}
object PerformSearchRequest {
  
  @scala.inline
  def apply(query: String): PerformSearchRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformSearchRequest]
  }
  
  @scala.inline
  implicit class PerformSearchRequestMutableBuilder[Self <: PerformSearchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeUserAgentShadowDOM(value: Boolean): Self = StObject.set(x, "includeUserAgentShadowDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUserAgentShadowDOMUndefined: Self = StObject.set(x, "includeUserAgentShadowDOM", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
