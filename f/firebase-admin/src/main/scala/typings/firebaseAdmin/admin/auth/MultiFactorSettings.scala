package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The multi-factor related user settings.
  */
trait MultiFactorSettings extends js.Object {
  /**
    * List of second factors enrolled with the current user.
    * Currently only phone second factors are supported.
    */
  var enrolledFactors: js.Array[MultiFactorInfo]
  /**
    * @return A JSON-serializable representation of this multi-factor object.
    */
  def toJSON(): js.Object
}

object MultiFactorSettings {
  @scala.inline
  def apply(enrolledFactors: js.Array[MultiFactorInfo], toJSON: () => js.Object): MultiFactorSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = enrolledFactors.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[MultiFactorSettings]
  }
}

