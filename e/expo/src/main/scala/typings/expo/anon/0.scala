package typings.expo.anon

import typings.expo.expoStrings.downloadProgress
import typings.expo.expoStrings.downloadStart
import typings.expo.expoStrings.noUpdateAvailable
import typings.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends UpdateEvent {
  var `type`: downloadStart | downloadProgress | noUpdateAvailable
}

object `0` {
  @scala.inline
  def apply(`type`: downloadStart | downloadProgress | noUpdateAvailable): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

