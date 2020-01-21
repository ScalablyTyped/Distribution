package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The feature specific settings to be used in the application. These define
  * behaviors that are user configurable.
  */
@js.native
trait SchemaFeatureSettings extends js.Object {
  /**
    * Boolean value indicating if split health checks should be used instead of
    * the legacy health checks. At an app.yaml level, this means defaulting to
    * &#39;readiness_check&#39; and &#39;liveness_check&#39; values instead of
    * &#39;health_check&#39; ones. Once the legacy &#39;health_check&#39;
    * behavior is deprecated, and this value is always true, this setting can
    * be removed.
    */
  var splitHealthChecks: js.UndefOr[Boolean] = js.native
  /**
    * If true, use Container-Optimized OS
    * (https://cloud.google.com/container-optimized-os/) base image for VMs,
    * rather than a base Debian image.
    */
  var useContainerOptimizedOs: js.UndefOr[Boolean] = js.native
}

object SchemaFeatureSettings {
  @scala.inline
  def apply(
    splitHealthChecks: js.UndefOr[Boolean] = js.undefined,
    useContainerOptimizedOs: js.UndefOr[Boolean] = js.undefined
  ): SchemaFeatureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(splitHealthChecks)) __obj.updateDynamic("splitHealthChecks")(splitHealthChecks.asInstanceOf[js.Any])
    if (!js.isUndefined(useContainerOptimizedOs)) __obj.updateDynamic("useContainerOptimizedOs")(useContainerOptimizedOs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFeatureSettings]
  }
}

