package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Start and end times for a build execution phase.
  */
@js.native
trait Schema$TimeSpan extends js.Object {
  /**
    * End of time span.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start of time span.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$TimeSpan {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): Schema$TimeSpan = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimeSpan]
  }
}

