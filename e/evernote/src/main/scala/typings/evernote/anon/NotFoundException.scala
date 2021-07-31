package typings.evernote.anon

import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotFoundException extends StObject {
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.undefined
  
  var userException: js.UndefOr[EDAMUserException] = js.undefined
  
  var userIdentity: js.UndefOr[UserIdentity] = js.undefined
}
object NotFoundException {
  
  @scala.inline
  def apply(): NotFoundException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotFoundException]
  }
  
  @scala.inline
  implicit class NotFoundExceptionMutableBuilder[Self <: NotFoundException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotFoundException(value: EDAMNotFoundException): Self = StObject.set(x, "notFoundException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundExceptionUndefined: Self = StObject.set(x, "notFoundException", js.undefined)
    
    @scala.inline
    def setUserException(value: EDAMUserException): Self = StObject.set(x, "userException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserExceptionUndefined: Self = StObject.set(x, "userException", js.undefined)
    
    @scala.inline
    def setUserIdentity(value: UserIdentity): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdentityUndefined: Self = StObject.set(x, "userIdentity", js.undefined)
  }
}
