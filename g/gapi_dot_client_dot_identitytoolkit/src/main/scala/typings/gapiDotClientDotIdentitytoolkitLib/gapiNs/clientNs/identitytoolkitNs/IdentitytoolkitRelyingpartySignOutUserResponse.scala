package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySignOutUserResponse extends js.Object {
  /** The local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartySignOutUserResponse {
  @scala.inline
  def apply(localId: java.lang.String = null): IdentitytoolkitRelyingpartySignOutUserResponse = {
    val __obj = js.Dynamic.literal()
    if (localId != null) __obj.updateDynamic("localId")(localId)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignOutUserResponse]
  }
}

