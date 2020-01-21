package typings.expo

import typings.expo.expoStrings.downloadProgress
import typings.expo.expoStrings.downloadStart
import typings.expo.expoStrings.noUpdateAvailable
import typings.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownloadProgress extends UpdateEvent {
  var `type`: downloadStart | downloadProgress | noUpdateAvailable
}

object AnonDownloadProgress {
  @scala.inline
  def apply(`type`: downloadStart | downloadProgress | noUpdateAvailable): AnonDownloadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDownloadProgress]
  }
}

