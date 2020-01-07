package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to delete account.
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartyDeleteAccountRequest extends js.Object {
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * The GITKit token or STS id token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
}

object Schema$IdentitytoolkitRelyingpartyDeleteAccountRequest {
  @scala.inline
  def apply(delegatedProjectNumber: String = null, idToken: String = null, localId: String = null): Schema$IdentitytoolkitRelyingpartyDeleteAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartyDeleteAccountRequest]
  }
}

