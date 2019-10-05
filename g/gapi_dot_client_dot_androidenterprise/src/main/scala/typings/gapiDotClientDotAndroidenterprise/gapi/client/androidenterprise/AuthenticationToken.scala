package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#authenticationToken". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The authentication token to be passed to the device policy client on the device where it can be used to provision the account for which this token was
    * generated.
    */
  var token: js.UndefOr[String] = js.undefined
}

object AuthenticationToken {
  @scala.inline
  def apply(kind: String = null, token: String = null): AuthenticationToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[AuthenticationToken]
  }
}

