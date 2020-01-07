package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metrics value that holds number of executions counted.
  */
@js.native
trait Schema$MetricsValue extends js.Object {
  /**
    * Required field indicating the end time of the interval.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Required field indicating the start time of the interval.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Indicates the number of executions counted.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$MetricsValue {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null, value: String = null): Schema$MetricsValue = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetricsValue]
  }
}

