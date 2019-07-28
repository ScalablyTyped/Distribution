package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyForDisplayEvent extends js.Object {
  var naturalSize: NaturalSize
  var status: PlaybackStatus
}

object ReadyForDisplayEvent {
  @scala.inline
  def apply(naturalSize: NaturalSize, status: PlaybackStatus): ReadyForDisplayEvent = {
    val __obj = js.Dynamic.literal(naturalSize = naturalSize, status = status)
  
    __obj.asInstanceOf[ReadyForDisplayEvent]
  }
}

