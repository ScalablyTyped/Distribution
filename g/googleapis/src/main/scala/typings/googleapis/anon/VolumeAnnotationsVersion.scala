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
  def apply(layerId: String = null, volumeAnnotationsVersion: String = null): VolumeAnnotationsVersion = {
    val __obj = js.Dynamic.literal()
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (volumeAnnotationsVersion != null) __obj.updateDynamic("volumeAnnotationsVersion")(volumeAnnotationsVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAnnotationsVersion]
  }
}

