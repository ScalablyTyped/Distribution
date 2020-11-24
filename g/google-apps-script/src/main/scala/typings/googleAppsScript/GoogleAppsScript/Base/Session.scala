package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Session class provides access to session information, such as the user's email address (in
  * some circumstances) and language setting.
  */
@js.native
trait Session extends js.Object {
  
  def getActiveUser(): User = js.native
  
  def getActiveUserLocale(): String = js.native
  
  def getEffectiveUser(): User = js.native
  
  def getScriptTimeZone(): String = js.native
  
  def getTemporaryActiveUserKey(): String = js.native
  
  /** @deprecated DO NOT USE */ def getTimeZone(): String = js.native
  
  /** @deprecated DO NOT USE */ def getUser(): User = js.native
}
object Session {
  
  @scala.inline
  def apply(
    getActiveUser: () => User,
    getActiveUserLocale: () => String,
    getEffectiveUser: () => User,
    getScriptTimeZone: () => String,
    getTemporaryActiveUserKey: () => String,
    getTimeZone: () => String,
    getUser: () => User
  ): Session = {
    val __obj = js.Dynamic.literal(getActiveUser = js.Any.fromFunction0(getActiveUser), getActiveUserLocale = js.Any.fromFunction0(getActiveUserLocale), getEffectiveUser = js.Any.fromFunction0(getEffectiveUser), getScriptTimeZone = js.Any.fromFunction0(getScriptTimeZone), getTemporaryActiveUserKey = js.Any.fromFunction0(getTemporaryActiveUserKey), getTimeZone = js.Any.fromFunction0(getTimeZone), getUser = js.Any.fromFunction0(getUser))
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
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
    def setGetActiveUser(value: () => User): Self = this.set("getActiveUser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveUserLocale(value: () => String): Self = this.set("getActiveUserLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEffectiveUser(value: () => User): Self = this.set("getEffectiveUser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScriptTimeZone(value: () => String): Self = this.set("getScriptTimeZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTemporaryActiveUserKey(value: () => String): Self = this.set("getTemporaryActiveUserKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeZone(value: () => String): Self = this.set("getTimeZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUser(value: () => User): Self = this.set("getUser", js.Any.fromFunction0(value))
  }
}
