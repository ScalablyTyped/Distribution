package typings.googleDashAppsDashScript.GoogleAppsScript.Optimization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearOptimizationEngine extends js.Object {
  def addConstraint(lowerBound: Double, upperBound: Double): LinearOptimizationConstraint = js.native
  def addConstraints(
    lowerBounds: js.Array[Double],
    upperBounds: js.Array[Double],
    variableNames: js.Array[js.Array[String]],
    coefficients: js.Array[js.Array[Double]]
  ): LinearOptimizationEngine = js.native
  def addVariable(name: String, lowerBound: Double, upperBound: Double): LinearOptimizationEngine = js.native
  def addVariable(name: String, lowerBound: Double, upperBound: Double, `type`: VariableType): LinearOptimizationEngine = js.native
  def addVariable(
    name: String,
    lowerBound: Double,
    upperBound: Double,
    `type`: VariableType,
    objectiveCoefficient: Double
  ): LinearOptimizationEngine = js.native
  def addVariables(
    names: js.Array[String],
    lowerBounds: js.Array[Double],
    upperBounds: js.Array[Double],
    types: js.Array[VariableType],
    objectiveCoefficients: js.Array[Double]
  ): LinearOptimizationEngine = js.native
  def setMaximization(): LinearOptimizationEngine = js.native
  def setMinimization(): LinearOptimizationEngine = js.native
  def setObjectiveCoefficient(variableName: String, coefficient: Double): LinearOptimizationEngine = js.native
  def solve(): LinearOptimizationSolution = js.native
  def solve(seconds: Double): LinearOptimizationSolution = js.native
}

