package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdministratorWebToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#administratorWebToken". */
  var kind: js.UndefOr[String] = js.undefined
  /** An opaque token to be passed to the Play front-end to generate an iframe. */
  var token: js.UndefOr[String] = js.undefined
}

object AdministratorWebToken {
  @scala.inline
  def apply(kind: String = null, token: String = null): AdministratorWebToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministratorWebToken]
  }
}

