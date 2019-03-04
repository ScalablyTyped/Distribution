package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenUpdateEvent extends js.Object {
  var fullscreenUpdate: FullscreenUpdateVariants
  var status: PlaybackStatus
}

object FullscreenUpdateEvent {
  @scala.inline
  def apply(fullscreenUpdate: FullscreenUpdateVariants, status: PlaybackStatus): FullscreenUpdateEvent = {
    val __obj = js.Dynamic.literal(fullscreenUpdate = fullscreenUpdate, status = status)
  
    __obj.asInstanceOf[FullscreenUpdateEvent]
  }
}

