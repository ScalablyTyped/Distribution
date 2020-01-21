package typings.firebaseFirestore.credentialsMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /** Extra header values to be passed along with a request */
  var authHeaders: StringDictionary[String]
  /** Type of token. */
  var `type`: TokenType
  /**
    * The user with which the token is associated (used for persisting user
    * state on disk, etc.).
    */
  var user: User
}

object Token {
  @scala.inline
  def apply(authHeaders: StringDictionary[String], `type`: TokenType, user: User): Token = {
    val __obj = js.Dynamic.literal(authHeaders = authHeaders.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

