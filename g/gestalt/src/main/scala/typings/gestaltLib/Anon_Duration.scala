package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: scala.Double
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLVideoElement, reactLib.Event]
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: scala.Double,
    event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLVideoElement, reactLib.Event]
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[Anon_Duration]
  }
}

