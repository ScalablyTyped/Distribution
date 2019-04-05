package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomViewabilityMetric extends js.Object {
  var configuration: js.UndefOr[CustomViewabilityMetricConfiguration] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object CustomViewabilityMetric {
  @scala.inline
  def apply(
    configuration: CustomViewabilityMetricConfiguration = null,
    id: java.lang.String = null,
    name: java.lang.String = null
  ): CustomViewabilityMetric = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CustomViewabilityMetric]
  }
}

