package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerHealthReportResponse extends js.Object {
  /**
    * A positive value indicates the worker should change its reporting interval
    * to the specified value.
    *
    * The default value of zero means no change in report rate is requested by
    * the server.
    */
  var reportInterval: js.UndefOr[String] = js.undefined
}

object WorkerHealthReportResponse {
  @scala.inline
  def apply(reportInterval: String = null): WorkerHealthReportResponse = {
    val __obj = js.Dynamic.literal()
    if (reportInterval != null) __obj.updateDynamic("reportInterval")(reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerHealthReportResponse]
  }
}

