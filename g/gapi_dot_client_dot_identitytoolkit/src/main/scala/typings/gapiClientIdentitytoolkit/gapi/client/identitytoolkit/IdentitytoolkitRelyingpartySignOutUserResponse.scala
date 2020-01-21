package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySignOutUserResponse extends js.Object {
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartySignOutUserResponse {
  @scala.inline
  def apply(localId: String = null): IdentitytoolkitRelyingpartySignOutUserResponse = {
    val __obj = js.Dynamic.literal()
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignOutUserResponse]
  }
}

