package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyDeleteAccountRequest extends js.Object {
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The GITKit token or STS id token of the authenticated user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartyDeleteAccountRequest {
  @scala.inline
  def apply(
    delegatedProjectNumber: java.lang.String = null,
    idToken: java.lang.String = null,
    localId: java.lang.String = null
  ): IdentitytoolkitRelyingpartyDeleteAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyDeleteAccountRequest]
  }
}

