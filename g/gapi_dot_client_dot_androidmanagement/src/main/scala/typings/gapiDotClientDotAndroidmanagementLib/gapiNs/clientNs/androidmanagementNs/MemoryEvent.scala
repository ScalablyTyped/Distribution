package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryEvent extends js.Object {
  /** The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED, the total capacity in bytes of the storage medium. */
  var byteCount: js.UndefOr[java.lang.String] = js.undefined
  /** The creation time of the event. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** Event type. */
  var eventType: js.UndefOr[java.lang.String] = js.undefined
}

object MemoryEvent {
  @scala.inline
  def apply(
    byteCount: java.lang.String = null,
    createTime: java.lang.String = null,
    eventType: java.lang.String = null
  ): MemoryEvent = {
    val __obj = js.Dynamic.literal()
    if (byteCount != null) __obj.updateDynamic("byteCount")(byteCount)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (eventType != null) __obj.updateDynamic("eventType")(eventType)
    __obj.asInstanceOf[MemoryEvent]
  }
}

