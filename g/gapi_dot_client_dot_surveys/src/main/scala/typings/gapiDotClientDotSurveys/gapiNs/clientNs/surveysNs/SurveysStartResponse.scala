package typings.gapiDotClientDotSurveys.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysStartResponse extends js.Object {
  /** Unique request ID used for logging and debugging. Please include in any error reporting or troubleshooting requests. */
  var requestId: js.UndefOr[String] = js.undefined
}

object SurveysStartResponse {
  @scala.inline
  def apply(requestId: String = null): SurveysStartResponse = {
    val __obj = js.Dynamic.literal()
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[SurveysStartResponse]
  }
}

