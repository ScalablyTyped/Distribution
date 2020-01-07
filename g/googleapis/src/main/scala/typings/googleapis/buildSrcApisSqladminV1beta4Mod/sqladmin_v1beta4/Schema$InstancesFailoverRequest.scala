package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instance failover request.
  */
@js.native
trait Schema$InstancesFailoverRequest extends js.Object {
  /**
    * Failover Context.
    */
  var failoverContext: js.UndefOr[Schema$FailoverContext] = js.native
}

object Schema$InstancesFailoverRequest {
  @scala.inline
  def apply(failoverContext: Schema$FailoverContext = null): Schema$InstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    if (failoverContext != null) __obj.updateDynamic("failoverContext")(failoverContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesFailoverRequest]
  }
}

