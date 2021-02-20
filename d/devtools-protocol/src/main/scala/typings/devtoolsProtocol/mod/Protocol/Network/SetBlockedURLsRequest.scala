package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBlockedURLsRequest extends StObject {
  
  /**
    * URL patterns to block. Wildcards ('*') are allowed.
    */
  var urls: js.Array[String] = js.native
}
object SetBlockedURLsRequest {
  
  @scala.inline
  def apply(urls: js.Array[String]): SetBlockedURLsRequest = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlockedURLsRequest]
  }
  
  @scala.inline
  implicit class SetBlockedURLsRequestMutableBuilder[Self <: SetBlockedURLsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
