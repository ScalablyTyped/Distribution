package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A UserToken is used by a user when setting up a managed device or profile
  * with their managed Google Play account on a device. When the user enters
  * their email address and token (activation code) the appropriate EMM app can
  * be automatically downloaded.
  */
@js.native
trait Schema$UserToken extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#userToken&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token (activation code) to be entered by the user. This consists of a
    * sequence of decimal digits. Note that the leading digit may be 0.
    */
  var token: js.UndefOr[String] = js.native
  /**
    * The unique ID for the user.
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$UserToken {
  @scala.inline
  def apply(kind: String = null, token: String = null, userId: String = null): Schema$UserToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserToken]
  }
}

