package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearOptimizationConstraint extends js.Object {
  def setCoefficient(variableName: java.lang.String, coefficient: scala.Double): LinearOptimizationConstraint
}

object LinearOptimizationConstraint {
  @scala.inline
  def apply(setCoefficient: (java.lang.String, scala.Double) => LinearOptimizationConstraint): LinearOptimizationConstraint = {
    val __obj = js.Dynamic.literal(setCoefficient = js.Any.fromFunction2(setCoefficient))
  
    __obj.asInstanceOf[LinearOptimizationConstraint]
  }
}

