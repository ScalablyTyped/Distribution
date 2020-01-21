package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The specification for fault injection introduced into traffic to test the
  * resiliency of clients to backend service failure. As part of fault
  * injection, when clients send requests to a backend service, delays can be
  * introduced by Loadbalancer on a percentage of requests before sending those
  * request to the backend service. Similarly requests from clients can be
  * aborted by the Loadbalancer for a percentage of requests.
  */
@js.native
trait SchemaHttpFaultInjection extends js.Object {
  /**
    * The specification for how client requests are aborted as part of fault
    * injection.
    */
  var abort: js.UndefOr[SchemaHttpFaultAbort] = js.native
  /**
    * The specification for how client requests are delayed as part of fault
    * injection, before being sent to a backend service.
    */
  var delay: js.UndefOr[SchemaHttpFaultDelay] = js.native
}

object SchemaHttpFaultInjection {
  @scala.inline
  def apply(abort: SchemaHttpFaultAbort = null, delay: SchemaHttpFaultDelay = null): SchemaHttpFaultInjection = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(abort.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttpFaultInjection]
  }
}

