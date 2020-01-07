package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Rotation.
  */
@js.native
trait Schema$CreativeRotation extends js.Object {
  /**
    * Creative assignments in this creative rotation.
    */
  var creativeAssignments: js.UndefOr[js.Array[Schema$CreativeAssignment]] = js.native
  /**
    * Creative optimization configuration that is used by this ad. It should
    * refer to one of the existing optimization configurations in the ad&#39;s
    * campaign. If it is unset or set to 0, then the campaign&#39;s default
    * optimization configuration will be used for this ad.
    */
  var creativeOptimizationConfigurationId: js.UndefOr[String] = js.native
  /**
    * Type of creative rotation. Can be used to specify whether to use
    * sequential or random rotation.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Strategy for calculating weights. Used with
    * CREATIVE_ROTATION_TYPE_RANDOM.
    */
  var weightCalculationStrategy: js.UndefOr[String] = js.native
}

object Schema$CreativeRotation {
  @scala.inline
  def apply(
    creativeAssignments: js.Array[Schema$CreativeAssignment] = null,
    creativeOptimizationConfigurationId: String = null,
    `type`: String = null,
    weightCalculationStrategy: String = null
  ): Schema$CreativeRotation = {
    val __obj = js.Dynamic.literal()
    if (creativeAssignments != null) __obj.updateDynamic("creativeAssignments")(creativeAssignments.asInstanceOf[js.Any])
    if (creativeOptimizationConfigurationId != null) __obj.updateDynamic("creativeOptimizationConfigurationId")(creativeOptimizationConfigurationId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (weightCalculationStrategy != null) __obj.updateDynamic("weightCalculationStrategy")(weightCalculationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeRotation]
  }
}

