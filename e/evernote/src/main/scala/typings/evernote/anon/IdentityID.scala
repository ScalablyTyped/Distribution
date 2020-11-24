package typings.evernote.anon

import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityID extends js.Object {
  
  var identityID: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.native
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  
  var userException: js.UndefOr[EDAMUserException] = js.native
  
  var userID: js.UndefOr[UserID] = js.native
}
object IdentityID {
  
  @scala.inline
  def apply(): IdentityID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityID]
  }
  
  @scala.inline
  implicit class IdentityIDOps[Self <: IdentityID] (val x: Self) extends AnyVal {
    
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
    def setIdentityID(value: typings.evernote.mod.Types.IdentityID): Self = this.set("identityID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityID: Self = this.set("identityID", js.undefined)
    
    @scala.inline
    def setNotFoundException(value: EDAMNotFoundException): Self = this.set("notFoundException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFoundException: Self = this.set("notFoundException", js.undefined)
    
    @scala.inline
    def setUserException(value: EDAMUserException): Self = this.set("userException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserException: Self = this.set("userException", js.undefined)
    
    @scala.inline
    def setUserID(value: UserID): Self = this.set("userID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserID: Self = this.set("userID", js.undefined)
  }
}
