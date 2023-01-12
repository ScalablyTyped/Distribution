package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleViewRequest extends StObject {
  
  /**
    * The id of the envelope.
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) The URL to which the user should be redirected after the console view session has ended.
    *
    * Maximum Length: 500 characters. If the `returnUrl` exceeds this limit, the user is redirected to a truncated URL.
    */
  var returnUrl: js.UndefOr[String] = js.undefined
}
object ConsoleViewRequest {
  
  inline def apply(): ConsoleViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleViewRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsoleViewRequest] (val x: Self) extends AnyVal {
    
    inline def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    
    inline def setReturnUrlUndefined: Self = StObject.set(x, "returnUrl", js.undefined)
  }
}
