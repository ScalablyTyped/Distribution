package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A power management event.
  */
@js.native
trait SchemaPowerManagementEvent extends js.Object {
  /**
    * For BATTERY_LEVEL_COLLECTED events, the battery level as a percentage.
    */
  var batteryLevel: js.UndefOr[Double] = js.native
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Event type.
    */
  var eventType: js.UndefOr[String] = js.native
}

object SchemaPowerManagementEvent {
  @scala.inline
  def apply(
    batteryLevel: js.UndefOr[Double] = js.undefined,
    createTime: String = null,
    eventType: String = null
  ): SchemaPowerManagementEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batteryLevel)) __obj.updateDynamic("batteryLevel")(batteryLevel.get.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPowerManagementEvent]
  }
}

