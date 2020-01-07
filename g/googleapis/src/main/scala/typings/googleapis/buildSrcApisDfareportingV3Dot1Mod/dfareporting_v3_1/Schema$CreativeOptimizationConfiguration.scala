package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative optimization settings.
  */
@js.native
trait Schema$CreativeOptimizationConfiguration extends js.Object {
  /**
    * ID of this creative optimization config. This field is auto-generated
    * when the campaign is inserted or updated. It can be null for existing
    * campaigns.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of this creative optimization config. This is a required field and
    * must be less than 129 characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of optimization activities associated with this configuration.
    */
  var optimizationActivitys: js.UndefOr[js.Array[Schema$OptimizationActivity]] = js.native
  /**
    * Optimization model for this configuration.
    */
  var optimizationModel: js.UndefOr[String] = js.native
}

object Schema$CreativeOptimizationConfiguration {
  @scala.inline
  def apply(
    id: String = null,
    name: String = null,
    optimizationActivitys: js.Array[Schema$OptimizationActivity] = null,
    optimizationModel: String = null
  ): Schema$CreativeOptimizationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optimizationActivitys != null) __obj.updateDynamic("optimizationActivitys")(optimizationActivitys.asInstanceOf[js.Any])
    if (optimizationModel != null) __obj.updateDynamic("optimizationModel")(optimizationModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeOptimizationConfiguration]
  }
}

