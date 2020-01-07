package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about device memory and storage.
  */
@js.native
trait Schema$MemoryInfo extends js.Object {
  /**
    * Total internal storage on device in bytes.
    */
  var totalInternalStorage: js.UndefOr[String] = js.native
  /**
    * Total RAM on device in bytes.
    */
  var totalRam: js.UndefOr[String] = js.native
}

object Schema$MemoryInfo {
  @scala.inline
  def apply(totalInternalStorage: String = null, totalRam: String = null): Schema$MemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (totalInternalStorage != null) __obj.updateDynamic("totalInternalStorage")(totalInternalStorage.asInstanceOf[js.Any])
    if (totalRam != null) __obj.updateDynamic("totalRam")(totalRam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MemoryInfo]
  }
}

