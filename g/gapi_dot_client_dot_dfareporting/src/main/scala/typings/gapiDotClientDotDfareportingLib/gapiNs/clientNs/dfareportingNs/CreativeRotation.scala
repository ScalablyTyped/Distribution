package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeRotation extends js.Object {
  /** Creative assignments in this creative rotation. */
  var creativeAssignments: js.UndefOr[js.Array[CreativeAssignment]] = js.undefined
  /**
    * Creative optimization configuration that is used by this ad. It should refer to one of the existing optimization configurations in the ad's campaign.
    * If it is unset or set to 0, then the campaign's default optimization configuration will be used for this ad.
    */
  var creativeOptimizationConfigurationId: js.UndefOr[java.lang.String] = js.undefined
  /** Type of creative rotation. Can be used to specify whether to use sequential or random rotation. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Strategy for calculating weights. Used with CREATIVE_ROTATION_TYPE_RANDOM. */
  var weightCalculationStrategy: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeRotation {
  @scala.inline
  def apply(
    creativeAssignments: js.Array[CreativeAssignment] = null,
    creativeOptimizationConfigurationId: java.lang.String = null,
    `type`: java.lang.String = null,
    weightCalculationStrategy: java.lang.String = null
  ): CreativeRotation = {
    val __obj = js.Dynamic.literal()
    if (creativeAssignments != null) __obj.updateDynamic("creativeAssignments")(creativeAssignments)
    if (creativeOptimizationConfigurationId != null) __obj.updateDynamic("creativeOptimizationConfigurationId")(creativeOptimizationConfigurationId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (weightCalculationStrategy != null) __obj.updateDynamic("weightCalculationStrategy")(weightCalculationStrategy)
    __obj.asInstanceOf[CreativeRotation]
  }
}

