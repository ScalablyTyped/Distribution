package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnUrlRequest extends js.Object {
  
  /**
    * (Optional) The URL to which the user should be redirected after the sending session is complete.
    *
    * Maximum Length: 500 characters. If the `returnUrl` exceeds this limit, the user is redirected to a truncated URL.
    */
  var returnUrl: js.UndefOr[String] = js.native
}
object ReturnUrlRequest {
  
  @scala.inline
  def apply(): ReturnUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnUrlRequest]
  }
  
  @scala.inline
  implicit class ReturnUrlRequestOps[Self <: ReturnUrlRequest] (val x: Self) extends AnyVal {
    
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
  }
}
