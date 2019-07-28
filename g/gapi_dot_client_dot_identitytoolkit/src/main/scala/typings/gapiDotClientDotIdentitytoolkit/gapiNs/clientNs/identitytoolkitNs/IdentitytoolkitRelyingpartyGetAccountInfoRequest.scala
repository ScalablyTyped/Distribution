package typings.gapiDotClientDotIdentitytoolkit.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyGetAccountInfoRequest extends js.Object {
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  /** The list of emails of the users to inquiry. */
  var email: js.UndefOr[js.Array[String]] = js.undefined
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  /** The list of local ID's of the users to inquiry. */
  var localId: js.UndefOr[js.Array[String]] = js.undefined
  /** Privileged caller can query users by specified phone number. */
  var phoneNumber: js.UndefOr[js.Array[String]] = js.undefined
}

object IdentitytoolkitRelyingpartyGetAccountInfoRequest {
  @scala.inline
  def apply(
    delegatedProjectNumber: String = null,
    email: js.Array[String] = null,
    idToken: String = null,
    localId: js.Array[String] = null,
    phoneNumber: js.Array[String] = null
  ): IdentitytoolkitRelyingpartyGetAccountInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber)
    if (email != null) __obj.updateDynamic("email")(email)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyGetAccountInfoRequest]
  }
}

