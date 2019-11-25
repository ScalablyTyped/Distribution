package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTrace extends js.Object {
  /** Exception cluster ID */
  var clusterId: js.UndefOr[String] = js.undefined
  /**
    * The stack trace message.
    *
    * Required
    */
  var exception: js.UndefOr[String] = js.undefined
  /** Exception report ID */
  var reportId: js.UndefOr[String] = js.undefined
}

object StackTrace {
  @scala.inline
  def apply(clusterId: String = null, exception: String = null, reportId: String = null): StackTrace = {
    val __obj = js.Dynamic.literal()
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    if (reportId != null) __obj.updateDynamic("reportId")(reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTrace]
  }
}

