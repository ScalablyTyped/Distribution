package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing base properties of a user enrolled second factor for a
  * `CreateRequest`.
  */
trait CreateMultiFactorInfoRequest extends js.Object {
  /**
    * The optional display name for an enrolled second factor.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The type identifier of the second factor. For SMS second factors, this is `phone`.
    */
  var factorId: String
}

object CreateMultiFactorInfoRequest {
  @scala.inline
  def apply(factorId: String, displayName: String = null): CreateMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiFactorInfoRequest]
  }
}

