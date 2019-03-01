package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountInfoResponse extends js.Object {
  /** The fixed string "identitytoolkit#GetAccountInfoResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The info of the users. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
}

object GetAccountInfoResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, users: js.Array[UserInfo] = null): GetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[GetAccountInfoResponse]
  }
}

