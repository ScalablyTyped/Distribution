package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureSettings extends js.Object {
  /**
    * Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to
    * 'readiness_check' and 'liveness_check' values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated, and this value is
    * always true, this setting can be removed.
    */
  var splitHealthChecks: js.UndefOr[Boolean] = js.undefined
}

object FeatureSettings {
  @scala.inline
  def apply(splitHealthChecks: js.UndefOr[Boolean] = js.undefined): FeatureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(splitHealthChecks)) __obj.updateDynamic("splitHealthChecks")(splitHealthChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSettings]
  }
}

