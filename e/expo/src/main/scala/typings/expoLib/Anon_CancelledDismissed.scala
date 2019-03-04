package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelledDismissed extends js.Object {
  var `type`: expoLib.expoLibStrings.cancelled | expoLib.expoLibStrings.dismissed
}

object Anon_CancelledDismissed {
  @scala.inline
  def apply(`type`: expoLib.expoLibStrings.cancelled | expoLib.expoLibStrings.dismissed): Anon_CancelledDismissed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CancelledDismissed]
  }
}

