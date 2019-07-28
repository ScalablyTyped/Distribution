package typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VariableType extends js.Object

@JSGlobal("GoogleAppsScript.Optimization.VariableType")
@js.native
object VariableType extends js.Object {
  @js.native
  sealed trait CONTINUOUS extends VariableType
  
  @js.native
  sealed trait INTEGER extends VariableType
  
  /* 1 */ val CONTINUOUS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.VariableType.CONTINUOUS with Double = js.native
  /* 0 */ val INTEGER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.VariableType.INTEGER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableType with Double] = js.native
}

