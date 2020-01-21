package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event related to memory and storage measurements.
  */
@js.native
trait SchemaMemoryEvent extends js.Object {
  /**
    * The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED,
    * the total capacity in bytes of the storage medium.
    */
  var byteCount: js.UndefOr[String] = js.native
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Event type.
    */
  var eventType: js.UndefOr[String] = js.native
}

object SchemaMemoryEvent {
  @scala.inline
  def apply(byteCount: String = null, createTime: String = null, eventType: String = null): SchemaMemoryEvent = {
    val __obj = js.Dynamic.literal()
    if (byteCount != null) __obj.updateDynamic("byteCount")(byteCount.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMemoryEvent]
  }
}

