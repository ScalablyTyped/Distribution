package typings.evernote.anon

import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityID extends StObject {
  
  var identityID: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.undefined
  
  var userException: js.UndefOr[EDAMUserException] = js.undefined
  
  var userID: js.UndefOr[UserID] = js.undefined
}
object IdentityID {
  
  inline def apply(): IdentityID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityID]
  }
  
  extension [Self <: IdentityID](x: Self) {
    
    inline def setIdentityID(value: typings.evernote.mod.Types.IdentityID): Self = StObject.set(x, "identityID", value.asInstanceOf[js.Any])
    
    inline def setIdentityIDUndefined: Self = StObject.set(x, "identityID", js.undefined)
    
    inline def setNotFoundException(value: EDAMNotFoundException): Self = StObject.set(x, "notFoundException", value.asInstanceOf[js.Any])
    
    inline def setNotFoundExceptionUndefined: Self = StObject.set(x, "notFoundException", js.undefined)
    
    inline def setUserException(value: EDAMUserException): Self = StObject.set(x, "userException", value.asInstanceOf[js.Any])
    
    inline def setUserExceptionUndefined: Self = StObject.set(x, "userException", js.undefined)
    
    inline def setUserID(value: UserID): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
    
    inline def setUserIDUndefined: Self = StObject.set(x, "userID", js.undefined)
  }
}
