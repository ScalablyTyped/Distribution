package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: scala.Boolean
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLInputElement, reactLib.Event]
}

object Anon_Checked {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLInputElement, reactLib.Event]
  ): Anon_Checked = {
    val __obj = js.Dynamic.literal(checked = checked, event = event)
  
    __obj.asInstanceOf[Anon_Checked]
  }
}

