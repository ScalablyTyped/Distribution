package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a user, suitable for scripting.
  */
@js.native
trait User extends js.Object {
  
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
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setGetEmail(value: () => String): Self = this.set("getEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserLoginId(value: () => String): Self = this.set("getUserLoginId", js.Any.fromFunction0(value))
  }
}
