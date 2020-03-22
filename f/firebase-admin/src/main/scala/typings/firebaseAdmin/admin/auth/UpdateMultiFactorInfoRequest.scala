package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing common properties of a user enrolled second factor
  * for an `UpdateRequest`.
  */
trait UpdateMultiFactorInfoRequest extends js.Object {
  /**
    * The optional display name for an enrolled second factor.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The optional date the second factor was enrolled, formatted as a UTC string.
    */
  var enrollmentTime: js.UndefOr[String] = js.undefined
  /**
    * The type identifier of the second factor. For SMS second factors, this is `phone`.
    */
  var factorId: String
  /**
    * The ID of the enrolled second factor. This ID is unique to the user. When not provided,
    * a new one is provisioned by the Auth server.
    */
  var uid: js.UndefOr[String] = js.undefined
}

object UpdateMultiFactorInfoRequest {
  @scala.inline
  def apply(factorId: String, displayName: String = null, enrollmentTime: String = null, uid: String = null): UpdateMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enrollmentTime != null) __obj.updateDynamic("enrollmentTime")(enrollmentTime.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiFactorInfoRequest]
  }
}

