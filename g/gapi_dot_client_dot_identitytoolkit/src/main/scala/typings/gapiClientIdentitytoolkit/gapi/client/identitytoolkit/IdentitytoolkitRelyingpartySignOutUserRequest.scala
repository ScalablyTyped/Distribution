package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySignOutUserRequest extends js.Object {
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartySignOutUserRequest {
  @scala.inline
  def apply(instanceId: String = null, localId: String = null): IdentitytoolkitRelyingpartySignOutUserRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignOutUserRequest]
  }
}

