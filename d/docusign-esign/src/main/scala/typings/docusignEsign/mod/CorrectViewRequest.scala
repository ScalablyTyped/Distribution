package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorrectViewRequest extends js.Object {
  
  /**
    * (Optional) The URL to which the user should be redirected after the correct/send view session has ended. DocuSign redirects to this URL and includes an event
    *  parameter that your app can use.
    *
    * Maximum Length: 500 characters. If the `returnUrl` exceeds this limit, the user is redirected to a truncated URL.
    *
    * The event parameters returned are:
    *
    * * `send` (user corrected and sent the envelope)
    * * `save` (user saved the envelope)
    * * `cancel` (user canceled the transaction.)
    * * `error` (there was an error when performing the correct or send)
    * * `sessionEnd` (the session ended before the user completed a different action)
    *
    * ###### Note: Include `https://` in the URL or the redirect might not succeed on some browsers.
    */
  var returnUrl: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the window is displayed with or without dressing.
    */
  var suppressNavigation: js.UndefOr[String] = js.native
}
object CorrectViewRequest {
  
  @scala.inline
  def apply(): CorrectViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorrectViewRequest]
  }
  
  @scala.inline
  implicit class CorrectViewRequestOps[Self <: CorrectViewRequest] (val x: Self) extends AnyVal {
    
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
    def setReturnUrl(value: String): Self = this.set("returnUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnUrl: Self = this.set("returnUrl", js.undefined)
    
    @scala.inline
    def setSuppressNavigation(value: String): Self = this.set("suppressNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressNavigation: Self = this.set("suppressNavigation", js.undefined)
  }
}
