package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeAnnotationsVersion extends js.Object {
  var layerId: js.UndefOr[String] = js.native
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
}

object VolumeAnnotationsVersion {
  @scala.inline
  def apply(): VolumeAnnotationsVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeAnnotationsVersion]
  }
  @scala.inline
  implicit class VolumeAnnotationsVersionOps[Self <: VolumeAnnotationsVersion] (val x: Self) extends AnyVal {
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
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setVolumeAnnotationsVersion(value: String): Self = this.set("volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeAnnotationsVersion: Self = this.set("volumeAnnotationsVersion", js.undefined)
  }
  
}

