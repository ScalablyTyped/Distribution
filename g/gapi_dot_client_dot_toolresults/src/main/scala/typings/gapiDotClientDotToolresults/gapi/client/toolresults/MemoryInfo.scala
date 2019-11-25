package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  /** Maximum memory that can be allocated to the process in KiB */
  var memoryCapInKibibyte: js.UndefOr[String] = js.undefined
  /** Total memory available on the device in KiB */
  var memoryTotalInKibibyte: js.UndefOr[String] = js.undefined
}

object MemoryInfo {
  @scala.inline
  def apply(memoryCapInKibibyte: String = null, memoryTotalInKibibyte: String = null): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (memoryCapInKibibyte != null) __obj.updateDynamic("memoryCapInKibibyte")(memoryCapInKibibyte.asInstanceOf[js.Any])
    if (memoryTotalInKibibyte != null) __obj.updateDynamic("memoryTotalInKibibyte")(memoryTotalInKibibyte.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
}

