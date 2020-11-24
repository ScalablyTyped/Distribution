package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoEmail extends js.Object {
  
  var noEmail: js.UndefOr[Boolean] = js.native
  
  var noShare: js.UndefOr[Boolean] = js.native
  
  var noSharePublicly: js.UndefOr[Boolean] = js.native
  
  var noUpdateContent: js.UndefOr[Boolean] = js.native
  
  var noUpdateTitle: js.UndefOr[Boolean] = js.native
}
object NoEmail {
  
  @scala.inline
  def apply(): NoEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoEmail]
  }
  
  @scala.inline
  implicit class NoEmailOps[Self <: NoEmail] (val x: Self) extends AnyVal {
    
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
    def setNoEmail(value: Boolean): Self = this.set("noEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmail: Self = this.set("noEmail", js.undefined)
    
    @scala.inline
    def setNoShare(value: Boolean): Self = this.set("noShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoShare: Self = this.set("noShare", js.undefined)
    
    @scala.inline
    def setNoSharePublicly(value: Boolean): Self = this.set("noSharePublicly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSharePublicly: Self = this.set("noSharePublicly", js.undefined)
    
    @scala.inline
    def setNoUpdateContent(value: Boolean): Self = this.set("noUpdateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoUpdateContent: Self = this.set("noUpdateContent", js.undefined)
    
    @scala.inline
    def setNoUpdateTitle(value: Boolean): Self = this.set("noUpdateTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoUpdateTitle: Self = this.set("noUpdateTitle", js.undefined)
  }
}
