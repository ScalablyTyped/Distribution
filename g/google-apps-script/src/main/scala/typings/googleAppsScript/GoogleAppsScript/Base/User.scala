package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a user, suitable for scripting.
  */
trait User extends js.Object {
  def getEmail(): String
  /** @deprecated DO NOT USE */ def getUserLoginId(): String
}

object User {
  @scala.inline
  def apply(getEmail: () => String, getUserLoginId: () => String): User = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getUserLoginId = js.Any.fromFunction0(getUserLoginId))
    __obj.asInstanceOf[User]
  }
}

