package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel
  extends expoLib.expoMod.GoogleNs.LogInResult
     with expoLib.expoMod.DocumentPickerNs.Response
     with expoLib.expoMod.AuthSessionNs.StartAsyncResponse {
  var `type`: expoLib.expoLibStrings.cancel
}

object Anon_Cancel {
  @scala.inline
  def apply(`type`: expoLib.expoLibStrings.cancel): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Cancel]
  }
}

