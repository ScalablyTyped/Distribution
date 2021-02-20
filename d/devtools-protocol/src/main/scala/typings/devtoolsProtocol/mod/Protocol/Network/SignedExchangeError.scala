package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedExchangeError extends StObject {
  
  /**
    * The field which caused the error.
    */
  var errorField: js.UndefOr[SignedExchangeErrorField] = js.native
  
  /**
    * Error message.
    */
  var message: String = js.native
  
  /**
    * The index of the signature which caused the error.
    */
  var signatureIndex: js.UndefOr[integer] = js.native
}
object SignedExchangeError {
  
  @scala.inline
  def apply(message: String): SignedExchangeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedExchangeError]
  }
  
  @scala.inline
  implicit class SignedExchangeErrorMutableBuilder[Self <: SignedExchangeError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorField(value: SignedExchangeErrorField): Self = StObject.set(x, "errorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorFieldUndefined: Self = StObject.set(x, "errorField", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureIndex(value: integer): Self = StObject.set(x, "signatureIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureIndexUndefined: Self = StObject.set(x, "signatureIndex", js.undefined)
  }
}
