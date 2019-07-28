package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeOptimizationConfiguration extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var optimizationActivitys: js.UndefOr[js.Array[OptimizationActivity]] = js.undefined
  var optimizationModel: js.UndefOr[String] = js.undefined
}

object CreativeOptimizationConfiguration {
  @scala.inline
  def apply(
    id: String = null,
    name: String = null,
    optimizationActivitys: js.Array[OptimizationActivity] = null,
    optimizationModel: String = null
  ): CreativeOptimizationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (optimizationActivitys != null) __obj.updateDynamic("optimizationActivitys")(optimizationActivitys)
    if (optimizationModel != null) __obj.updateDynamic("optimizationModel")(optimizationModel)
    __obj.asInstanceOf[CreativeOptimizationConfiguration]
  }
}

