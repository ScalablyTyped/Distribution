package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventFullscreen extends js.Object {
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLDivElement, reactLib.Event]
  var fullscreen: scala.Boolean
}

object Anon_EventFullscreen {
  @scala.inline
  def apply(
    event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLDivElement, reactLib.Event],
    fullscreen: scala.Boolean
  ): Anon_EventFullscreen = {
    val __obj = js.Dynamic.literal(event = event, fullscreen = fullscreen)
  
    __obj.asInstanceOf[Anon_EventFullscreen]
  }
}

