package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification for how requests are aborted as part of fault injection.
  */
@js.native
trait Schema$HttpFaultAbort extends js.Object {
  /**
    * The HTTP status code used to abort the request. The value must be between
    * 200 and 599 inclusive.
    */
  var httpStatus: js.UndefOr[Double] = js.native
  /**
    * The percentage of traffic (connections/operations/requests) which will be
    * aborted as part of fault injection. The value must be between 0.0 and
    * 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double] = js.native
}

object Schema$HttpFaultAbort {
  @scala.inline
  def apply(httpStatus: Int | Double = null, percentage: Int | Double = null): Schema$HttpFaultAbort = {
    val __obj = js.Dynamic.literal()
    if (httpStatus != null) __obj.updateDynamic("httpStatus")(httpStatus.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpFaultAbort]
  }
}

