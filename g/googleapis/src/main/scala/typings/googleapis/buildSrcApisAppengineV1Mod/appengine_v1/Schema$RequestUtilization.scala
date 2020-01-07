package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by request utilization. Only applicable in the App Engine
  * flexible environment.
  */
@js.native
trait Schema$RequestUtilization extends js.Object {
  /**
    * Target number of concurrent requests.
    */
  var targetConcurrentRequests: js.UndefOr[Double] = js.native
  /**
    * Target requests per second.
    */
  var targetRequestCountPerSecond: js.UndefOr[Double] = js.native
}

object Schema$RequestUtilization {
  @scala.inline
  def apply(targetConcurrentRequests: Int | Double = null, targetRequestCountPerSecond: Int | Double = null): Schema$RequestUtilization = {
    val __obj = js.Dynamic.literal()
    if (targetConcurrentRequests != null) __obj.updateDynamic("targetConcurrentRequests")(targetConcurrentRequests.asInstanceOf[js.Any])
    if (targetRequestCountPerSecond != null) __obj.updateDynamic("targetRequestCountPerSecond")(targetRequestCountPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RequestUtilization]
  }
}

