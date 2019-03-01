package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySignOutUserRequest extends js.Object {
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartySignOutUserRequest {
  @scala.inline
  def apply(instanceId: java.lang.String = null, localId: java.lang.String = null): IdentitytoolkitRelyingpartySignOutUserRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignOutUserRequest]
  }
}

