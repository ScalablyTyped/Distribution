package typings.googleDashAppsDashScript.GoogleAppsScript.Optimization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The engine used to model and solve a linear program. The example below solves the following
  * linear program:
  *
  * Two variables, x and y:
  *
  * 0 ≤ x ≤ 10
  *
  * 0 ≤ y ≤ 5
  *
  * Constraints:
  *
  * 0 ≤ 2 * x + 5 * y ≤ 10
  *
  * 0 ≤ 10 * x + 3 * y ≤ 20
  *
  * Objective:
  * Maximize x + y
  *
  *     var engine = LinearOptimizationService.createEngine();
  *
  *     // Add variables, constraints and define the objective with addVariable(), addConstraint(), etc
  *     // Add two variables, 0 <= x <= 10 and 0 <= y <= 5
  *     engine.addVariable('x', 0, 10);
  *     engine.addVariable('y', 0, 5);
  *
  *     // Create the constraint: 0 <= 2 * x + 5 * y <= 10
  *     var constraint = engine.addConstraint(0, 10);
  *     constraint.setCoefficient('x', 2);
  *     constraint.setCoefficient('y', 5);
  *
  *     // Create the constraint: 0 <= 10 * x + 3 * y <= 20
  *     var constraint = engine.addConstraint(0, 20);
  *     constraint.setCoefficient('x', 10);
  *     constraint.setCoefficient('y', 3);
  *
  *     // Set the objective to be x + y
  *     engine.setObjectiveCoefficient('x', 1);
  *     engine.setObjectiveCoefficient('y', 1);
  *
  *     // Engine should maximize the objective
  *     engine.setMaximization();
  *
  *     // Solve the linear program
  *     var solution = engine.solve();
  *     if (!solution.isValid()) {
  *       Logger.log('No solution ' + solution.getStatus());
  *     } else {
  *       Logger.log('Value of x: ' + solution.getVariableValue('x'));
  *       Logger.log('Value of y: ' + solution.getVariableValue('y'));
  *     }
  */
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

