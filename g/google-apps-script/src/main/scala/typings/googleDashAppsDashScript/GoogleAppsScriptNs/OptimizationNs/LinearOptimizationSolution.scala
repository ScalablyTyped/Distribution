package typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearOptimizationSolution extends js.Object {
  def getObjectiveValue(): Double
  def getStatus(): Status
  def getVariableValue(variableName: String): Double
  def isValid(): Boolean
}

object LinearOptimizationSolution {
  @scala.inline
  def apply(
    getObjectiveValue: () => Double,
    getStatus: () => Status,
    getVariableValue: String => Double,
    isValid: () => Boolean
  ): LinearOptimizationSolution = {
    val __obj = js.Dynamic.literal(getObjectiveValue = js.Any.fromFunction0(getObjectiveValue), getStatus = js.Any.fromFunction0(getStatus), getVariableValue = js.Any.fromFunction1(getVariableValue), isValid = js.Any.fromFunction0(isValid))
  
    __obj.asInstanceOf[LinearOptimizationSolution]
  }
}

