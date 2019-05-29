package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearOptimizationEngine extends js.Object {
  def addConstraint(lowerBound: scala.Double, upperBound: scala.Double): LinearOptimizationConstraint = js.native
  def addConstraints(
    lowerBounds: js.Array[scala.Double],
    upperBounds: js.Array[scala.Double],
    variableNames: js.Array[js.Array[java.lang.String]],
    coefficients: js.Array[js.Array[scala.Double]]
  ): LinearOptimizationEngine = js.native
  def addVariable(name: java.lang.String, lowerBound: scala.Double, upperBound: scala.Double): LinearOptimizationEngine = js.native
  def addVariable(name: java.lang.String, lowerBound: scala.Double, upperBound: scala.Double, `type`: VariableType): LinearOptimizationEngine = js.native
  def addVariable(
    name: java.lang.String,
    lowerBound: scala.Double,
    upperBound: scala.Double,
    `type`: VariableType,
    objectiveCoefficient: scala.Double
  ): LinearOptimizationEngine = js.native
  def addVariables(
    names: js.Array[java.lang.String],
    lowerBounds: js.Array[scala.Double],
    upperBounds: js.Array[scala.Double],
    types: js.Array[VariableType],
    objectiveCoefficients: js.Array[scala.Double]
  ): LinearOptimizationEngine = js.native
  def setMaximization(): LinearOptimizationEngine = js.native
  def setMinimization(): LinearOptimizationEngine = js.native
  def setObjectiveCoefficient(variableName: java.lang.String, coefficient: scala.Double): LinearOptimizationEngine = js.native
  def solve(): LinearOptimizationSolution = js.native
  def solve(seconds: scala.Double): LinearOptimizationSolution = js.native
}

