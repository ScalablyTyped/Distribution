package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Success
  extends expoLib.expoMod.LocalAuthenticationNs.LocalAuthenticationResult {
  var success: expoLib.expoLibNumbers.`true`
}

object Anon_Success {
  @scala.inline
  def apply(success: expoLib.expoLibNumbers.`true`): Anon_Success = {
    val __obj = js.Dynamic.literal(success = success)
  
    __obj.asInstanceOf[Anon_Success]
  }
}

