package typings.expo

import typings.expo.buildUpdatesUpdatesMod.UpdateEvent
import typings.expo.expoStrings.downloadProgress
import typings.expo.expoStrings.downloadStart
import typings.expo.expoStrings.noUpdateAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DownloadProgress extends UpdateEvent {
  var `type`: downloadStart | downloadProgress | noUpdateAvailable
}

object Anon_DownloadProgress {
  @scala.inline
  def apply(`type`: downloadStart | downloadProgress | noUpdateAvailable): Anon_DownloadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DownloadProgress]
  }
}

