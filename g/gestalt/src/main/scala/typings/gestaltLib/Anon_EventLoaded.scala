package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventLoaded extends js.Object {
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLVideoElement, reactLib.Event]
  var loaded: scala.Double
}

object Anon_EventLoaded {
  @scala.inline
  def apply(
    event: reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLVideoElement, reactLib.Event],
    loaded: scala.Double
  ): Anon_EventLoaded = {
    val __obj = js.Dynamic.literal(event = event, loaded = loaded)
  
    __obj.asInstanceOf[Anon_EventLoaded]
  }
}

