package typings.expo

import typings.expo.expoMod.AudioNs.Sound
import typings.expo.expoMod.PlaybackStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sound extends js.Object {
  var sound: Sound
  var status: PlaybackStatus
}

object Anon_Sound {
  @scala.inline
  def apply(sound: Sound, status: PlaybackStatus): Anon_Sound = {
    val __obj = js.Dynamic.literal(sound = sound, status = status)
  
    __obj.asInstanceOf[Anon_Sound]
  }
}

