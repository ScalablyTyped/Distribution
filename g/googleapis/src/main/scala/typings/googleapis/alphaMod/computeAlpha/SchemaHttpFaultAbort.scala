package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification for how requests are aborted as part of fault injection.
  */
@js.native
trait SchemaHttpFaultAbort extends js.Object {
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

object SchemaHttpFaultAbort {
  @scala.inline
  def apply(httpStatus: js.UndefOr[Double] = js.undefined, percentage: js.UndefOr[Double] = js.undefined): SchemaHttpFaultAbort = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(httpStatus)) __obj.updateDynamic("httpStatus")(httpStatus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttpFaultAbort]
  }
}

