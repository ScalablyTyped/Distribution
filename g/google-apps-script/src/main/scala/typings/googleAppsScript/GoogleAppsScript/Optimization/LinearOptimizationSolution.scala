package typings.googleAppsScript.GoogleAppsScript.Optimization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The solution of a linear program. The example below solves the following linear program:
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
  *     // Add variables, constraints and define the objective with addVariable(), addConstraint(), etc.
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
  *       Logger.log('Objective  value: ' + solution.getObjectiveValue());
  *       Logger.log('Value of x: ' + solution.getVariableValue('x'));
  *       Logger.log('Value of y: ' + solution.getVariableValue('y'));
  *     }
  */
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

