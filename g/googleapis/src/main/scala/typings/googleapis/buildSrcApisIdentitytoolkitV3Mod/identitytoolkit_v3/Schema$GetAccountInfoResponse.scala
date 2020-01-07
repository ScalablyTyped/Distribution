package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of getting account information.
  */
@js.native
trait Schema$GetAccountInfoResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#GetAccountInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The info of the users.
    */
  var users: js.UndefOr[js.Array[Schema$UserInfo]] = js.native
}

object Schema$GetAccountInfoResponse {
  @scala.inline
  def apply(kind: String = null, users: js.Array[Schema$UserInfo] = null): Schema$GetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetAccountInfoResponse]
  }
}

