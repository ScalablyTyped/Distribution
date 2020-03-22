package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure containing the information of a second factor entity.
  */
trait MultiFactorInfo extends js.Object {
  /**
    * The user friendly name of the current second factor.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /**
    * The enrollment date of the second factor formatted as a UTC string.
    */
  var enrollmentTime: String
  /**
    * The identifier of the second factor.
    */
  var factorId: String
  /**
    * The multi-factor enrollment ID.
    */
  var uid: String
}

object MultiFactorInfo {
  @scala.inline
  def apply(enrollmentTime: String, factorId: String, uid: String, displayName: String = null): MultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorInfo]
  }
}

