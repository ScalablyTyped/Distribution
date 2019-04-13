package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValueElement extends js.Object {
  var event: reactLib.reactMod.SyntheticEvent[reactLib.reactMod.FocusEvent[reactLib.Element], reactLib.Event]
  var value: java.lang.String
}

object Anon_EventValueElement {
  @scala.inline
  def apply(
    event: reactLib.reactMod.SyntheticEvent[reactLib.reactMod.FocusEvent[reactLib.Element], reactLib.Event],
    value: java.lang.String
  ): Anon_EventValueElement = {
    val __obj = js.Dynamic.literal(event = event, value = value)
  
    __obj.asInstanceOf[Anon_EventValueElement]
  }
}

