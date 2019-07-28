package typings.gestalt

import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventVolume extends js.Object {
  var event: SyntheticEvent[HTMLDivElement, Event]
  var volume: Double
}

object Anon_EventVolume {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLDivElement, Event], volume: Double): Anon_EventVolume = {
    val __obj = js.Dynamic.literal(event = event, volume = volume)
  
    __obj.asInstanceOf[Anon_EventVolume]
  }
}

