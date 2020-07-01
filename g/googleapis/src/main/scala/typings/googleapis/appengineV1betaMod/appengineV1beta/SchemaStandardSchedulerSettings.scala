package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scheduler settings for standard environment.
  */
@js.native
trait SchemaStandardSchedulerSettings extends js.Object {
  /**
    * Maximum number of instances to run for this version. Set to zero to
    * disable max_instances configuration.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * Minimum number of instances to run for this version. Set to zero to
    * disable min_instances configuration.
    */
  var minInstances: js.UndefOr[Double] = js.native
  /**
    * Target CPU utilization ratio to maintain when scaling.
    */
  var targetCpuUtilization: js.UndefOr[Double] = js.native
  /**
    * Target throughput utilization ratio to maintain when scaling
    */
  var targetThroughputUtilization: js.UndefOr[Double] = js.native
}

object SchemaStandardSchedulerSettings {
  @scala.inline
  def apply(
    maxInstances: js.UndefOr[Double] = js.undefined,
    minInstances: js.UndefOr[Double] = js.undefined,
    targetCpuUtilization: js.UndefOr[Double] = js.undefined,
    targetThroughputUtilization: js.UndefOr[Double] = js.undefined
  ): SchemaStandardSchedulerSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxInstances)) __obj.updateDynamic("maxInstances")(maxInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minInstances)) __obj.updateDynamic("minInstances")(minInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetCpuUtilization)) __obj.updateDynamic("targetCpuUtilization")(targetCpuUtilization.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetThroughputUtilization)) __obj.updateDynamic("targetThroughputUtilization")(targetThroughputUtilization.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStandardSchedulerSettings]
  }
}

