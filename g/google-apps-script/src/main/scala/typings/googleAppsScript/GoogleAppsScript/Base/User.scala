package typings.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a user, suitable for scripting.
  */
@js.native
trait User extends StObject {
  
  def getEmail(): String = js.native
  
  /** @deprecated DO NOT USE */ def getUserLoginId(): String = js.native
}
object User {
  
  @scala.inline
  def apply(getEmail: () => String, getUserLoginId: () => String): User = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getUserLoginId = js.Any.fromFunction0(getUserLoginId))
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEmail(value: () => String): Self = StObject.set(x, "getEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserLoginId(value: () => String): Self = StObject.set(x, "getUserLoginId", js.Any.fromFunction0(value))
  }
}
