package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeRotation extends js.Object {
  var creativeAssignments: js.UndefOr[js.Array[CreativeAssignment]] = js.undefined
  var creativeOptimizationConfigurationId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
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

