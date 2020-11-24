package typings.evernote.anon

import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotFoundException extends js.Object {
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  
  var userException: js.UndefOr[EDAMUserException] = js.native
  
  var userIdentity: js.UndefOr[UserIdentity] = js.native
}
object NotFoundException {
  
  @scala.inline
  def apply(): NotFoundException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotFoundException]
  }
  
  @scala.inline
  implicit class NotFoundExceptionOps[Self <: NotFoundException] (val x: Self) extends AnyVal {
    
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
    def setNotFoundException(value: EDAMNotFoundException): Self = this.set("notFoundException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFoundException: Self = this.set("notFoundException", js.undefined)
    
    @scala.inline
    def setUserException(value: EDAMUserException): Self = this.set("userException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserException: Self = this.set("userException", js.undefined)
    
    @scala.inline
    def setUserIdentity(value: UserIdentity): Self = this.set("userIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIdentity: Self = this.set("userIdentity", js.undefined)
  }
}
