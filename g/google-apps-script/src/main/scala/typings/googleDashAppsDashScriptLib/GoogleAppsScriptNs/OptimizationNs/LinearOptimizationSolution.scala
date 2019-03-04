package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearOptimizationSolution extends js.Object {
  def getObjectiveValue(): stdLib.Number
  def getStatus(): Status
  def getVariableValue(variableName: java.lang.String): stdLib.Number
  def isValid(): scala.Boolean
}

object LinearOptimizationSolution {
  @scala.inline
  def apply(
    getObjectiveValue: js.Function0[stdLib.Number],
    getStatus: js.Function0[Status],
    getVariableValue: js.Function1[java.lang.String, stdLib.Number],
    isValid: js.Function0[scala.Boolean]
  ): LinearOptimizationSolution = {
    val __obj = js.Dynamic.literal(getObjectiveValue = getObjectiveValue, getStatus = getStatus, getVariableValue = getVariableValue, isValid = isValid)
  
    __obj.asInstanceOf[LinearOptimizationSolution]
  }
}

