package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleViewRequest extends StObject {
  
  /**
    * The id of the envelope.
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * (Optional) The URL to which the user should be redirected after the console view session has ended.
    *
    * Maximum Length: 500 characters. If the `returnUrl` exceeds this limit, the user is redirected to a truncated URL.
    */
  var returnUrl: js.UndefOr[String] = js.native
}
object ConsoleViewRequest {
  
  @scala.inline
  def apply(): ConsoleViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleViewRequest]
  }
  
  @scala.inline
  implicit class ConsoleViewRequestMutableBuilder[Self <: ConsoleViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUrlUndefined: Self = StObject.set(x, "returnUrl", js.undefined)
  }
}
