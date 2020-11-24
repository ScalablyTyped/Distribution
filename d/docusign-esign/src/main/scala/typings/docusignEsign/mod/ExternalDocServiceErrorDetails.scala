package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalDocServiceErrorDetails extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var authenticationUrl: js.UndefOr[String] = js.native
  
  /**
    * A code associated with the error condition.
    */
  var errorCode: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
}
object ExternalDocServiceErrorDetails {
  
  @scala.inline
  def apply(): ExternalDocServiceErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDocServiceErrorDetails]
  }
  
  @scala.inline
  implicit class ExternalDocServiceErrorDetailsOps[Self <: ExternalDocServiceErrorDetails] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationUrl(value: String): Self = this.set("authenticationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationUrl: Self = this.set("authenticationUrl", js.undefined)
    
    @scala.inline
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
