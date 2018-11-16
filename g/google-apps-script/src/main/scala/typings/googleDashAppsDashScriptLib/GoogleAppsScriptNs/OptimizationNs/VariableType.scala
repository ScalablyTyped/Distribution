package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VariableType extends js.Object

@JSGlobal("GoogleAppsScript.Optimization.VariableType")
@js.native
object VariableType extends js.Object {
  @js.native
  sealed trait CONTINUOUS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.VariableType
  
  @js.native
  sealed trait INTEGER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.VariableType
  
  val CONTINUOUS: CONTINUOUS with java.lang.String = js.native
  val INTEGER: INTEGER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.VariableType with java.lang.String
  ] = js.native
}

