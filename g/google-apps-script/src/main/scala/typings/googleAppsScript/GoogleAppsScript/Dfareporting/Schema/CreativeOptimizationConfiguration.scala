package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

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
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optimizationActivitys != null) __obj.updateDynamic("optimizationActivitys")(optimizationActivitys.asInstanceOf[js.Any])
    if (optimizationModel != null) __obj.updateDynamic("optimizationModel")(optimizationModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeOptimizationConfiguration]
  }
}

