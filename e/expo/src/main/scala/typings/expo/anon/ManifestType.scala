package typings.expo.anon

import typings.expo.expoStrings.downloadFinished
import typings.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestType extends UpdateEvent {
  var manifest: typings.expo.updatesMod.Manifest
  var `type`: downloadFinished
}

object ManifestType {
  @scala.inline
  def apply(manifest: typings.expo.updatesMod.Manifest, `type`: downloadFinished): ManifestType = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestType]
  }
}

