package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearOptimizationEngine extends js.Object {
  def addConstraint(lowerBound: stdLib.Number, upperBound: stdLib.Number): LinearOptimizationConstraint = js.native
  def addConstraints(
    lowerBounds: js.Array[stdLib.Number],
    upperBounds: js.Array[stdLib.Number],
    variableNames: js.Array[js.Array[java.lang.String]],
    coefficients: js.Array[js.Array[stdLib.Number]]
  ): LinearOptimizationEngine = js.native
  def addVariable(name: java.lang.String, lowerBound: stdLib.Number, upperBound: stdLib.Number): LinearOptimizationEngine = js.native
  def addVariable(name: java.lang.String, lowerBound: stdLib.Number, upperBound: stdLib.Number, `type`: VariableType): LinearOptimizationEngine = js.native
  def addVariable(
    name: java.lang.String,
    lowerBound: stdLib.Number,
    upperBound: stdLib.Number,
    `type`: VariableType,
    objectiveCoefficient: stdLib.Number
  ): LinearOptimizationEngine = js.native
  def addVariables(
    names: js.Array[java.lang.String],
    lowerBounds: js.Array[stdLib.Number],
    upperBounds: js.Array[stdLib.Number],
    types: js.Array[VariableType],
    objectiveCoefficients: js.Array[stdLib.Number]
  ): LinearOptimizationEngine = js.native
  def setMaximization(): LinearOptimizationEngine = js.native
  def setMinimization(): LinearOptimizationEngine = js.native
  def setObjectiveCoefficient(variableName: java.lang.String, coefficient: stdLib.Number): LinearOptimizationEngine = js.native
  def solve(): LinearOptimizationSolution = js.native
  def solve(seconds: stdLib.Number): LinearOptimizationSolution = js.native
}

