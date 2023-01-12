package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBlockedURLsRequest extends StObject {
  
  /**
    * URL patterns to block. Wildcards ('*') are allowed.
    */
  var urls: js.Array[String]
}
object SetBlockedURLsRequest {
  
  inline def apply(urls: js.Array[String]): SetBlockedURLsRequest = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlockedURLsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBlockedURLsRequest] (val x: Self) extends AnyVal {
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
