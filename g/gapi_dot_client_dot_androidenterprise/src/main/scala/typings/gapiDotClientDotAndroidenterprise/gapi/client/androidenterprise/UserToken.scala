package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#userToken". */
  var kind: js.UndefOr[String] = js.undefined
  /** The token (activation code) to be entered by the user. This consists of a sequence of decimal digits. Note that the leading digit may be 0. */
  var token: js.UndefOr[String] = js.undefined
  /** The unique ID for the user. */
  var userId: js.UndefOr[String] = js.undefined
}

object UserToken {
  @scala.inline
  def apply(kind: String = null, token: String = null, userId: String = null): UserToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (token != null) __obj.updateDynamic("token")(token)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[UserToken]
  }
}

