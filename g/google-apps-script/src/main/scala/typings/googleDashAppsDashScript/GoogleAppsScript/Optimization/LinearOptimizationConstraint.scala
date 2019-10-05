package typings.googleDashAppsDashScript.GoogleAppsScript.Optimization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearOptimizationConstraint extends js.Object {
  def setCoefficient(variableName: String, coefficient: Double): LinearOptimizationConstraint
}

object LinearOptimizationConstraint {
  @scala.inline
  def apply(setCoefficient: (String, Double) => LinearOptimizationConstraint): LinearOptimizationConstraint = {
    val __obj = js.Dynamic.literal(setCoefficient = js.Any.fromFunction2(setCoefficient))
  
    __obj.asInstanceOf[LinearOptimizationConstraint]
  }
}

