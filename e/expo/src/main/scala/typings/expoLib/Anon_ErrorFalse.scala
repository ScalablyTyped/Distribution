package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFalse
  extends expoLib.expoMod.LocalAuthenticationNs.LocalAuthenticationResult {
  /** Error code in the case where authentication fails. */
  var error: java.lang.String
  var success: expoLib.expoLibNumbers.`false`
}

object Anon_ErrorFalse {
  @scala.inline
  def apply(error: java.lang.String, success: expoLib.expoLibNumbers.`false`): Anon_ErrorFalse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_ErrorFalse]
  }
}

