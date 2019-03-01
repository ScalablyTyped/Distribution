package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelledSaved extends js.Object {
  var status: expoLib.expoLibStrings.sent | expoLib.expoLibStrings.saved | expoLib.expoLibStrings.cancelled
}

object Anon_CancelledSaved {
  @scala.inline
  def apply(
    status: expoLib.expoLibStrings.sent | expoLib.expoLibStrings.saved | expoLib.expoLibStrings.cancelled
  ): Anon_CancelledSaved = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CancelledSaved]
  }
}

