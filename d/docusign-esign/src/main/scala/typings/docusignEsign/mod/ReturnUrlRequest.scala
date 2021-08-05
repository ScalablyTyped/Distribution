package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnUrlRequest extends StObject {
  
  /**
    * (Optional) The URL to which the user should be redirected after the sending session is complete.
    *
    * Maximum Length: 500 characters. If the `returnUrl` exceeds this limit, the user is redirected to a truncated URL.
    */
  var returnUrl: js.UndefOr[String] = js.undefined
}
object ReturnUrlRequest {
  
  inline def apply(): ReturnUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnUrlRequest]
  }
  
  extension [Self <: ReturnUrlRequest](x: Self) {
    
    inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    
    inline def setReturnUrlUndefined: Self = StObject.set(x, "returnUrl", js.undefined)
  }
}
