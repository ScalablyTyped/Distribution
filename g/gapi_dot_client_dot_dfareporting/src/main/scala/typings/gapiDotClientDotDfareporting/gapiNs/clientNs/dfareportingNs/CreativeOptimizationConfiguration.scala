package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeOptimizationConfiguration extends js.Object {
  /** ID of this creative optimization config. This field is auto-generated when the campaign is inserted or updated. It can be null for existing campaigns. */
  var id: js.UndefOr[String] = js.undefined
  /** Name of this creative optimization config. This is a required field and must be less than 129 characters long. */
  var name: js.UndefOr[String] = js.undefined
  /** List of optimization activities associated with this configuration. */
  var optimizationActivitys: js.UndefOr[js.Array[OptimizationActivity]] = js.undefined
  /** Optimization model for this configuration. */
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

