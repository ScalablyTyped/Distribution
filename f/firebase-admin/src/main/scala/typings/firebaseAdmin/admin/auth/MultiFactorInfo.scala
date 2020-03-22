package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the common properties of a user enrolled second factor.
  */
trait MultiFactorInfo extends js.Object {
  /**
    * The optional display name of the enrolled second factor.
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
    * The ID of the enrolled second factor. This ID is unique to the user.
    */
  var uid: String
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}

object MultiFactorInfo {
  @scala.inline
  def apply(
    factorId: String,
    toJSON: () => js.Object,
    uid: String,
    displayName: String = null,
    enrollmentTime: String = null
  ): MultiFactorInfo = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), uid = uid.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enrollmentTime != null) __obj.updateDynamic("enrollmentTime")(enrollmentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorInfo]
  }
}

