package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeRotation extends js.Object {
  var creativeAssignments: js.UndefOr[js.Array[CreativeAssignment]] = js.undefined
  var creativeOptimizationConfigurationId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var weightCalculationStrategy: js.UndefOr[String] = js.undefined
}

object CreativeRotation {
  @scala.inline
  def apply(
    creativeAssignments: js.Array[CreativeAssignment] = null,
    creativeOptimizationConfigurationId: String = null,
    `type`: String = null,
    weightCalculationStrategy: String = null
  ): CreativeRotation = {
    val __obj = js.Dynamic.literal()
    if (creativeAssignments != null) __obj.updateDynamic("creativeAssignments")(creativeAssignments)
    if (creativeOptimizationConfigurationId != null) __obj.updateDynamic("creativeOptimizationConfigurationId")(creativeOptimizationConfigurationId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (weightCalculationStrategy != null) __obj.updateDynamic("weightCalculationStrategy")(weightCalculationStrategy)
    __obj.asInstanceOf[CreativeRotation]
  }
}

