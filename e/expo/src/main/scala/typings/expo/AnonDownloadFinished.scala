package typings.expo

import typings.expo.expoStrings.downloadFinished
import typings.expo.updatesMod.Manifest
import typings.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownloadFinished extends UpdateEvent {
  var manifest: Manifest
  var `type`: downloadFinished
}

object AnonDownloadFinished {
  @scala.inline
  def apply(manifest: Manifest, `type`: downloadFinished): AnonDownloadFinished = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDownloadFinished]
  }
}

