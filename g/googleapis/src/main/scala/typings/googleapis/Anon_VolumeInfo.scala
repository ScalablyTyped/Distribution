package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_VolumeInfo extends js.Object {
  var volumeInfo: js.UndefOr[js.Array[Anon_StorageFree]] = js.native
}

object Anon_VolumeInfo {
  @scala.inline
  def apply(volumeInfo: js.Array[Anon_StorageFree] = null): Anon_VolumeInfo = {
    val __obj = js.Dynamic.literal()
    if (volumeInfo != null) __obj.updateDynamic("volumeInfo")(volumeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_VolumeInfo]
  }
}

