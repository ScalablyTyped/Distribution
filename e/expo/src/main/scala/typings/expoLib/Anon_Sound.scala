package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sound extends js.Object {
  var sound: expoLib.expoMod.AudioNs.Sound
  var status: expoLib.expoMod.PlaybackStatus
}

object Anon_Sound {
  @scala.inline
  def apply(sound: expoLib.expoMod.AudioNs.Sound, status: expoLib.expoMod.PlaybackStatus): Anon_Sound = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sound")(sound)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Anon_Sound]
  }
}

