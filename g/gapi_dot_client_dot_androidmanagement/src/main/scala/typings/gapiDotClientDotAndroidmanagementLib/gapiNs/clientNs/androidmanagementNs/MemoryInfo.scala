package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  /** Total internal storage on device in bytes. */
  var totalInternalStorage: js.UndefOr[java.lang.String] = js.undefined
  /** Total RAM on device in bytes. */
  var totalRam: js.UndefOr[java.lang.String] = js.undefined
}

object MemoryInfo {
  @scala.inline
  def apply(totalInternalStorage: java.lang.String = null, totalRam: java.lang.String = null): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (totalInternalStorage != null) __obj.updateDynamic("totalInternalStorage")(totalInternalStorage)
    if (totalRam != null) __obj.updateDynamic("totalRam")(totalRam)
    __obj.asInstanceOf[MemoryInfo]
  }
}

