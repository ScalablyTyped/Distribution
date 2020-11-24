package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformSearchRequest extends js.Object {
  
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
  implicit class PerformSearchRequestOps[Self <: PerformSearchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUserAgentShadowDOM(value: Boolean): Self = this.set("includeUserAgentShadowDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUserAgentShadowDOM: Self = this.set("includeUserAgentShadowDOM", js.undefined)
  }
}
