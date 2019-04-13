package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventTime extends js.Object {
  var event: reactLib.reactMod.SyntheticEvent[stdLib.HTMLVideoElement, reactLib.Event]
  var time: scala.Double
}

object Anon_EventTime {
  @scala.inline
  def apply(
    event: reactLib.reactMod.SyntheticEvent[stdLib.HTMLVideoElement, reactLib.Event],
    time: scala.Double
  ): Anon_EventTime = {
    val __obj = js.Dynamic.literal(event = event, time = time)
  
    __obj.asInstanceOf[Anon_EventTime]
  }
}

