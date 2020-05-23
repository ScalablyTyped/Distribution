package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiFactorInfo extends js.Object {
  var displayName: js.UndefOr[String | Null] = js.undefined
  var enrollmentTime: String
  var factorId: String
  var uid: String
}

object MultiFactorInfo {
  @scala.inline
  def apply(
    enrollmentTime: String,
    factorId: String,
    uid: String,
    displayName: js.UndefOr[Null | String] = js.undefined
  ): MultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorInfo]
  }
}

