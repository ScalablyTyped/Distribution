package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  /** Maximum memory that can be allocated to the process in KiB */
  var memoryCapInKibibyte: js.UndefOr[java.lang.String] = js.undefined
  /** Total memory available on the device in KiB */
  var memoryTotalInKibibyte: js.UndefOr[java.lang.String] = js.undefined
}

object MemoryInfo {
  @scala.inline
  def apply(memoryCapInKibibyte: java.lang.String = null, memoryTotalInKibibyte: java.lang.String = null): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (memoryCapInKibibyte != null) __obj.updateDynamic("memoryCapInKibibyte")(memoryCapInKibibyte)
    if (memoryTotalInKibibyte != null) __obj.updateDynamic("memoryTotalInKibibyte")(memoryTotalInKibibyte)
    __obj.asInstanceOf[MemoryInfo]
  }
}

