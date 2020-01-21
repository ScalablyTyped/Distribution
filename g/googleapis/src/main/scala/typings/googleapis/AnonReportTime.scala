package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReportTime extends js.Object {
  var reportTime: js.UndefOr[String] = js.native
  var systemRamFreeInfo: js.UndefOr[js.Array[String]] = js.native
}

object AnonReportTime {
  @scala.inline
  def apply(reportTime: String = null, systemRamFreeInfo: js.Array[String] = null): AnonReportTime = {
    val __obj = js.Dynamic.literal()
    if (reportTime != null) __obj.updateDynamic("reportTime")(reportTime.asInstanceOf[js.Any])
    if (systemRamFreeInfo != null) __obj.updateDynamic("systemRamFreeInfo")(systemRamFreeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReportTime]
  }
}

