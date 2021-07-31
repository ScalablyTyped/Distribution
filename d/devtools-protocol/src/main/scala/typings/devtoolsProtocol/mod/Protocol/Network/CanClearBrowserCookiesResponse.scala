package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanClearBrowserCookiesResponse extends StObject {
  
  /**
    * True if browser cookies can be cleared.
    */
  var result: Boolean
}
object CanClearBrowserCookiesResponse {
  
  @scala.inline
  def apply(result: Boolean): CanClearBrowserCookiesResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanClearBrowserCookiesResponse]
  }
  
  @scala.inline
  implicit class CanClearBrowserCookiesResponseMutableBuilder[Self <: CanClearBrowserCookiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
