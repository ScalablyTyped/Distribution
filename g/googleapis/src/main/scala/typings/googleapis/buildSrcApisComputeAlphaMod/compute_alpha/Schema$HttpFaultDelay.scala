package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the delay introduced by Loadbalancer before forwarding the
  * request to the backend service as part of fault injection.
  */
@js.native
trait Schema$HttpFaultDelay extends js.Object {
  /**
    * Specifies the value of the fixed delay interval.
    */
  var fixedDelay: js.UndefOr[Schema$Duration] = js.native
  /**
    * The percentage of traffic (connections/operations/requests) on which
    * delay will be introduced as part of fault injection. The value must be
    * between 0.0 and 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double] = js.native
}

object Schema$HttpFaultDelay {
  @scala.inline
  def apply(fixedDelay: Schema$Duration = null, percentage: Int | Double = null): Schema$HttpFaultDelay = {
    val __obj = js.Dynamic.literal()
    if (fixedDelay != null) __obj.updateDynamic("fixedDelay")(fixedDelay.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpFaultDelay]
  }
}

