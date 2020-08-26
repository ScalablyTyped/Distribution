package typings.googleAppsScript.GoogleAppsScript.Optimization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object storing a linear constraint of the form lowerBound ≤ Sum(a(i) x(i)) ≤ upperBound
  * where lowerBound and upperBound are constants, a(i) are constant
  * coefficients and x(i) are variables (unknowns).
  *
  * The example below creates one variable x with values between 0 and 5
  * and creates the constraint 0 ≤ 2 * x ≤ 5. This is done by first creating a constraint
  * with the lower bound 5 and upper bound 5. Then the coefficient for variable
  * x in this constraint is set to 2.
  *
  *     var engine = LinearOptimizationService.createEngine();
  *     // Create a variable so we can add it to the constraint
  *     engine.addVariable('x', 0, 5);
  *     // Create a linear constraint with the bounds 0 and 10
  *     var constraint = engine.addConstraint(0, 10);
  *     // Set the coefficient of the variable in the constraint. The constraint is now:
  *     // 0 <= 2 * x <= 5
  *     constraint.setCoefficient('x', 2);
  */
@js.native
trait LinearOptimizationConstraint extends js.Object {
  def setCoefficient(variableName: String, coefficient: Double): LinearOptimizationConstraint = js.native
}

object LinearOptimizationConstraint {
  @scala.inline
  def apply(setCoefficient: (String, Double) => LinearOptimizationConstraint): LinearOptimizationConstraint = {
    val __obj = js.Dynamic.literal(setCoefficient = js.Any.fromFunction2(setCoefficient))
    __obj.asInstanceOf[LinearOptimizationConstraint]
  }
  @scala.inline
  implicit class LinearOptimizationConstraintOps[Self <: LinearOptimizationConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetCoefficient(value: (String, Double) => LinearOptimizationConstraint): Self = this.set("setCoefficient", js.Any.fromFunction2(value))
  }
  
}

