package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LayerId extends js.Object {
  var layerId: js.UndefOr[String] = js.native
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
}

object Anon_LayerId {
  @scala.inline
  def apply(layerId: String = null, volumeAnnotationsVersion: String = null): Anon_LayerId = {
    val __obj = js.Dynamic.literal()
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (volumeAnnotationsVersion != null) __obj.updateDynamic("volumeAnnotationsVersion")(volumeAnnotationsVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LayerId]
  }
}

