package typings.evernote.anon

import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityID extends StObject {
  
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
  implicit class IdentityIDMutableBuilder[Self <: IdentityID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityID(value: typings.evernote.mod.Types.IdentityID): Self = StObject.set(x, "identityID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIDUndefined: Self = StObject.set(x, "identityID", js.undefined)
    
    @scala.inline
    def setNotFoundException(value: EDAMNotFoundException): Self = StObject.set(x, "notFoundException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundExceptionUndefined: Self = StObject.set(x, "notFoundException", js.undefined)
    
    @scala.inline
    def setUserException(value: EDAMUserException): Self = StObject.set(x, "userException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserExceptionUndefined: Self = StObject.set(x, "userException", js.undefined)
    
    @scala.inline
    def setUserID(value: UserID): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIDUndefined: Self = StObject.set(x, "userID", js.undefined)
  }
}
