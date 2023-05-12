package typings.firefoxWebextBrowser.browser.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The action to take if this rule is matched. */
trait RuleAction extends StObject {
  
  /** Describes how the redirect should be performed. Only valid when type is 'redirect'. */
  var redirect: js.UndefOr[RuleActionRedirect] = js.undefined
  
  /** The request headers to modify for the request. Only valid when type is 'modifyHeaders'. */
  var requestHeaders: js.UndefOr[js.Array[RuleActionRequestHeaders]] = js.undefined
  
  /** The response headers to modify for the request. Only valid when type is 'modifyHeaders'. */
  var responseHeaders: js.UndefOr[js.Array[RuleActionResponseHeaders]] = js.undefined
  
  var `type`: RuleActionType
}
object RuleAction {
  
  inline def apply(`type`: RuleActionType): RuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleAction] (val x: Self) extends AnyVal {
    
    inline def setRedirect(value: RuleActionRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setRequestHeaders(value: js.Array[RuleActionRequestHeaders]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: RuleActionRequestHeaders*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
    
    inline def setResponseHeaders(value: js.Array[RuleActionResponseHeaders]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: RuleActionResponseHeaders*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
    
    inline def setType(value: RuleActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
