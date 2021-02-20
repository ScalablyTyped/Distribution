package typings.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Session class provides access to session information, such as the user's email address (in
  * some circumstances) and language setting.
  */
@js.native
trait Session extends StObject {
  
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
  implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetActiveUser(value: () => User): Self = StObject.set(x, "getActiveUser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveUserLocale(value: () => String): Self = StObject.set(x, "getActiveUserLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEffectiveUser(value: () => User): Self = StObject.set(x, "getEffectiveUser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScriptTimeZone(value: () => String): Self = StObject.set(x, "getScriptTimeZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTemporaryActiveUserKey(value: () => String): Self = StObject.set(x, "getTemporaryActiveUserKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeZone(value: () => String): Self = StObject.set(x, "getTimeZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUser(value: () => User): Self = StObject.set(x, "getUser", js.Any.fromFunction0(value))
  }
}
