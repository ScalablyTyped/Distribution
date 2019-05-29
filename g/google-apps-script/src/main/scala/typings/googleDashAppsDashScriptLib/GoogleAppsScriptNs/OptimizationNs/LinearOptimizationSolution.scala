package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearOptimizationSolution extends js.Object {
  def getObjectiveValue(): scala.Double
  def getStatus(): Status
  def getVariableValue(variableName: java.lang.String): scala.Double
  def isValid(): scala.Boolean
}

object LinearOptimizationSolution {
  @scala.inline
  def apply(
    getObjectiveValue: () => scala.Double,
    getStatus: () => Status,
    getVariableValue: java.lang.String => scala.Double,
    isValid: () => scala.Boolean
  ): LinearOptimizationSolution = {
    val __obj = js.Dynamic.literal(getObjectiveValue = js.Any.fromFunction0(getObjectiveValue), getStatus = js.Any.fromFunction0(getStatus), getVariableValue = js.Any.fromFunction1(getVariableValue), isValid = js.Any.fromFunction0(isValid))
  
    __obj.asInstanceOf[LinearOptimizationSolution]
  }
}

