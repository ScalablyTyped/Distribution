package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: scala.Double
  var event: reactLib.reactMod.SyntheticEvent[stdLib.HTMLVideoElement, reactLib.Event]
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: scala.Double,
    event: reactLib.reactMod.SyntheticEvent[stdLib.HTMLVideoElement, reactLib.Event]
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration, event = event)
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

