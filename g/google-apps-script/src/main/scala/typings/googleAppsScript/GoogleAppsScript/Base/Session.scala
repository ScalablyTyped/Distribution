package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Session class provides access to session information, such as the user's email address (in
  * some circumstances) and language setting.
  */
trait Session extends js.Object {
  def getActiveUser(): User
  def getActiveUserLocale(): String
  def getEffectiveUser(): User
  def getScriptTimeZone(): String
  def getTemporaryActiveUserKey(): String
  /** @deprecated DO NOT USE */ def getTimeZone(): String
  /** @deprecated DO NOT USE */ def getUser(): User
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
}

