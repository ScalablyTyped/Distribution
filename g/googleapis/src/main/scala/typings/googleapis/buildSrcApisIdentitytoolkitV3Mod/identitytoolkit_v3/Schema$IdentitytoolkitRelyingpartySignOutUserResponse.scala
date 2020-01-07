package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of signing out user.
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartySignOutUserResponse extends js.Object {
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
}

object Schema$IdentitytoolkitRelyingpartySignOutUserResponse {
  @scala.inline
  def apply(localId: String = null): Schema$IdentitytoolkitRelyingpartySignOutUserResponse = {
    val __obj = js.Dynamic.literal()
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartySignOutUserResponse]
  }
}

