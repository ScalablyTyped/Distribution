package typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesFailoverRequest extends js.Object {
  /** Failover Context. */
  var failoverContext: js.UndefOr[FailoverContext] = js.undefined
}

object InstancesFailoverRequest {
  @scala.inline
  def apply(failoverContext: FailoverContext = null): InstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    if (failoverContext != null) __obj.updateDynamic("failoverContext")(failoverContext)
    __obj.asInstanceOf[InstancesFailoverRequest]
  }
}

