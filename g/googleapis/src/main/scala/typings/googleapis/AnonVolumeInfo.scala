package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVolumeInfo extends js.Object {
  var volumeInfo: js.UndefOr[js.Array[AnonStorageFree]] = js.native
}

object AnonVolumeInfo {
  @scala.inline
  def apply(volumeInfo: js.Array[AnonStorageFree] = null): AnonVolumeInfo = {
    val __obj = js.Dynamic.literal()
    if (volumeInfo != null) __obj.updateDynamic("volumeInfo")(volumeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVolumeInfo]
  }
}

