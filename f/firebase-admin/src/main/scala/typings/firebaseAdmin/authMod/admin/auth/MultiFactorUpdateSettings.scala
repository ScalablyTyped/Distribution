package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The multi-factor related user settings for update operations.
  */
trait MultiFactorUpdateSettings extends js.Object {
  /**
    * The updated list of enrolled second factors. The provided list overwrites the user's
    * existing list of second factors.
    * When null is passed, all of the user's existing second factors are removed.
    */
  var enrolledFactors: js.Array[UpdateMultiFactorInfoRequest] | Null
}

object MultiFactorUpdateSettings {
  @scala.inline
  def apply(enrolledFactors: js.Array[UpdateMultiFactorInfoRequest] = null): MultiFactorUpdateSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = enrolledFactors.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorUpdateSettings]
  }
}

