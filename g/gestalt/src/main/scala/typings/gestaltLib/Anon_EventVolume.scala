package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventVolume extends js.Object {
  var event: reactLib.reactMod.SyntheticEvent[stdLib.HTMLDivElement, reactLib.Event]
  var volume: scala.Double
}

object Anon_EventVolume {
  @scala.inline
  def apply(
    event: reactLib.reactMod.SyntheticEvent[stdLib.HTMLDivElement, reactLib.Event],
    volume: scala.Double
  ): Anon_EventVolume = {
    val __obj = js.Dynamic.literal(event = event, volume = volume)
  
    __obj.asInstanceOf[Anon_EventVolume]
  }
}

