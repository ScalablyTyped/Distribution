package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandResourceUrls extends js.Object {
  
  /**
    * The URI for the email resource file that the brand uses.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The URI for the sending resource file that the brand uses.
    */
  var sending: js.UndefOr[String] = js.native
  
  /**
    * The URI for the signing resource file that the brand uses.
    */
  var signing: js.UndefOr[String] = js.native
  
  /**
    * The URI for the captive (embedded) signing resource file that the brand uses.
    */
  var signingCaptive: js.UndefOr[String] = js.native
}
object BrandResourceUrls {
  
  @scala.inline
  def apply(): BrandResourceUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandResourceUrls]
  }
  
  @scala.inline
  implicit class BrandResourceUrlsOps[Self <: BrandResourceUrls] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setSending(value: String): Self = this.set("sending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSending: Self = this.set("sending", js.undefined)
    
    @scala.inline
    def setSigning(value: String): Self = this.set("signing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigning: Self = this.set("signing", js.undefined)
    
    @scala.inline
    def setSigningCaptive(value: String): Self = this.set("signingCaptive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningCaptive: Self = this.set("signingCaptive", js.undefined)
  }
}
