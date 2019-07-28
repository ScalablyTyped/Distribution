package typings.gapiDotClientDotAndroidmanagement.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryEvent extends js.Object {
  /** The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED, the total capacity in bytes of the storage medium. */
  var byteCount: js.UndefOr[String] = js.undefined
  /** The creation time of the event. */
  var createTime: js.UndefOr[String] = js.undefined
  /** Event type. */
  var eventType: js.UndefOr[String] = js.undefined
}

object MemoryEvent {
  @scala.inline
  def apply(byteCount: String = null, createTime: String = null, eventType: String = null): MemoryEvent = {
    val __obj = js.Dynamic.literal()
    if (byteCount != null) __obj.updateDynamic("byteCount")(byteCount)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (eventType != null) __obj.updateDynamic("eventType")(eventType)
    __obj.asInstanceOf[MemoryEvent]
  }
}

