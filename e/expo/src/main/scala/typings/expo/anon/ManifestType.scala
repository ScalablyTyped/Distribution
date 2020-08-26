package typings.expo.anon

import typings.expo.expoStrings.downloadFinished
import typings.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestType extends UpdateEvent {
  var manifest: typings.expo.updatesMod.Manifest = js.native
  var `type`: downloadFinished = js.native
}

object ManifestType {
  @scala.inline
  def apply(manifest: typings.expo.updatesMod.Manifest, `type`: downloadFinished): ManifestType = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestType]
  }
  @scala.inline
  implicit class ManifestTypeOps[Self <: ManifestType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setManifest(value: typings.expo.updatesMod.Manifest): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: downloadFinished): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

