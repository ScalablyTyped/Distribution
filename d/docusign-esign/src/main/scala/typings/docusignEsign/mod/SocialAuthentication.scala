package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocialAuthentication extends js.Object {
  
  /**
    * Reserved for DocuSign.
    */
  var authentication: js.UndefOr[String] = js.native
}
object SocialAuthentication {
  
  @scala.inline
  def apply(): SocialAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialAuthentication]
  }
  
  @scala.inline
  implicit class SocialAuthenticationOps[Self <: SocialAuthentication] (val x: Self) extends AnyVal {
    
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
    def setAuthentication(value: String): Self = this.set("authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
  }
}
