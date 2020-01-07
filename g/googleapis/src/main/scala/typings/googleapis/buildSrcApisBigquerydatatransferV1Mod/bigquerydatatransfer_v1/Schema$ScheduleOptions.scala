package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options customizing the data transfer schedule.
  */
@js.native
trait Schema$ScheduleOptions extends js.Object {
  /**
    * If true, automatic scheduling of data transfer runs for this
    * configuration will be disabled. The runs can be started on ad-hoc basis
    * using StartManualTransferRuns API. When automatic scheduling is disabled,
    * the TransferConfig.schedule field will be ignored.
    */
  var disableAutoScheduling: js.UndefOr[Boolean] = js.native
  /**
    * Defines time to stop scheduling transfer runs. A transfer run cannot be
    * scheduled at or after the end time. The end time can be changed at any
    * moment. The time when a data transfer can be trigerred manually is not
    * limited by this option.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Specifies time to start scheduling transfer runs. The first run will be
    * scheduled at or after the start time according to a recurrence pattern
    * defined in the schedule string. The start time can be changed at any
    * moment. The time when a data transfer can be trigerred manually is not
    * limited by this option.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$ScheduleOptions {
  @scala.inline
  def apply(
    disableAutoScheduling: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    startTime: String = null
  ): Schema$ScheduleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableAutoScheduling)) __obj.updateDynamic("disableAutoScheduling")(disableAutoScheduling.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ScheduleOptions]
  }
}

