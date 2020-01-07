package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time window of (start_time, end_time].
  */
@js.native
trait Schema$TimeWindow extends js.Object {
  /**
    * End time of the time window (inclusive). Current timestamp if not
    * specified.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start time of the time window (exclusive).
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$TimeWindow {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): Schema$TimeWindow = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimeWindow]
  }
}

