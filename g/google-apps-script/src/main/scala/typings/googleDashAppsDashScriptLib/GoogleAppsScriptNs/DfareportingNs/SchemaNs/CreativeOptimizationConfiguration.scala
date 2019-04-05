package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeOptimizationConfiguration extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var optimizationActivitys: js.UndefOr[js.Array[OptimizationActivity]] = js.undefined
  var optimizationModel: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeOptimizationConfiguration {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    name: java.lang.String = null,
    optimizationActivitys: js.Array[OptimizationActivity] = null,
    optimizationModel: java.lang.String = null
  ): CreativeOptimizationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (optimizationActivitys != null) __obj.updateDynamic("optimizationActivitys")(optimizationActivitys)
    if (optimizationModel != null) __obj.updateDynamic("optimizationModel")(optimizationModel)
    __obj.asInstanceOf[CreativeOptimizationConfiguration]
  }
}

