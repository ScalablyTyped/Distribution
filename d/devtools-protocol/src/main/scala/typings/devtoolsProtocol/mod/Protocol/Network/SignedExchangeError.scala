package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedExchangeError extends js.Object {
  
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
  implicit class SignedExchangeErrorOps[Self <: SignedExchangeError] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorField(value: SignedExchangeErrorField): Self = this.set("errorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorField: Self = this.set("errorField", js.undefined)
    
    @scala.inline
    def setSignatureIndex(value: integer): Self = this.set("signatureIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureIndex: Self = this.set("signatureIndex", js.undefined)
  }
}
