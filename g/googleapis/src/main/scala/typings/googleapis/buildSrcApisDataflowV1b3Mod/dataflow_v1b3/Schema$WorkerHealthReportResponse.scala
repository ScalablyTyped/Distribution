package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkerHealthReportResponse contains information returned to the worker in
  * response to a health ping.
  */
@js.native
trait Schema$WorkerHealthReportResponse extends js.Object {
  /**
    * A positive value indicates the worker should change its reporting
    * interval to the specified value.  The default value of zero means no
    * change in report rate is requested by the server.
    */
  var reportInterval: js.UndefOr[String] = js.native
}

object Schema$WorkerHealthReportResponse {
  @scala.inline
  def apply(reportInterval: String = null): Schema$WorkerHealthReportResponse = {
    val __obj = js.Dynamic.literal()
    if (reportInterval != null) __obj.updateDynamic("reportInterval")(reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkerHealthReportResponse]
  }
}

