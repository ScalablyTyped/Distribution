package typings.expo

import typings.expo.buildUpdatesUpdatesMod.Manifest
import typings.expo.buildUpdatesUpdatesMod.UpdateEvent
import typings.expo.expoStrings.downloadFinished
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DownloadFinished extends UpdateEvent {
  var manifest: Manifest
  var `type`: downloadFinished
}

object Anon_DownloadFinished {
  @scala.inline
  def apply(manifest: Manifest, `type`: downloadFinished): Anon_DownloadFinished = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DownloadFinished]
  }
}

