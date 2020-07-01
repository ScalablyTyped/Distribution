package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by request utilization. Only applicable in the App Engine
  * flexible environment.
  */
@js.native
trait SchemaRequestUtilization extends js.Object {
  /**
    * Target number of concurrent requests.
    */
  var targetConcurrentRequests: js.UndefOr[Double] = js.native
  /**
    * Target requests per second.
    */
  var targetRequestCountPerSecond: js.UndefOr[Double] = js.native
}

object SchemaRequestUtilization {
  @scala.inline
  def apply(
    targetConcurrentRequests: js.UndefOr[Double] = js.undefined,
    targetRequestCountPerSecond: js.UndefOr[Double] = js.undefined
  ): SchemaRequestUtilization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(targetConcurrentRequests)) __obj.updateDynamic("targetConcurrentRequests")(targetConcurrentRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetRequestCountPerSecond)) __obj.updateDynamic("targetRequestCountPerSecond")(targetRequestCountPerSecond.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRequestUtilization]
  }
}

