package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LinearOptimizationSolution extends js.Object {
  def getObjectiveValue(): stdLib.Number
  def getStatus(): Status
  def getVariableValue(variableName: java.lang.String): stdLib.Number
  def isValid(): scala.Boolean
}

