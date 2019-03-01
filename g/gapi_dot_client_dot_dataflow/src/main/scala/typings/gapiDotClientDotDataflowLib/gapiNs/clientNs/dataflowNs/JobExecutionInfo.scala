package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionInfo extends js.Object {
  /** A mapping from each stage to the information about that stage. */
  var stages: js.UndefOr[stdLib.Record[java.lang.String, JobExecutionStageInfo]] = js.undefined
}

object JobExecutionInfo {
  @scala.inline
  def apply(stages: stdLib.Record[java.lang.String, JobExecutionStageInfo] = null): JobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    if (stages != null) __obj.updateDynamic("stages")(stages)
    __obj.asInstanceOf[JobExecutionInfo]
  }
}

