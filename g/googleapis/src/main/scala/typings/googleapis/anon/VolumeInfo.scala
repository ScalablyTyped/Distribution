package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeInfo extends js.Object {
  var volumeInfo: js.UndefOr[js.Array[StorageFree]] = js.native
}

object VolumeInfo {
  @scala.inline
  def apply(volumeInfo: js.Array[StorageFree] = null): VolumeInfo = {
    val __obj = js.Dynamic.literal()
    if (volumeInfo != null) __obj.updateDynamic("volumeInfo")(volumeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeInfo]
  }
}

