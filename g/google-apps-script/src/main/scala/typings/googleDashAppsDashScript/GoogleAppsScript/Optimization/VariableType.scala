package typings.googleDashAppsDashScript.GoogleAppsScript.Optimization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VariableType extends js.Object

/**
  * Type of variables created by the engine.
  */
@JSGlobal("GoogleAppsScript.Optimization.VariableType")
@js.native
object VariableType extends js.Object {
  @js.native
  sealed trait CONTINUOUS extends VariableType
  
  @js.native
  sealed trait INTEGER extends VariableType
  
  /* 1 */ val CONTINUOUS: typings.googleDashAppsDashScript.GoogleAppsScript.Optimization.VariableType.CONTINUOUS with Double = js.native
  /* 0 */ val INTEGER: typings.googleDashAppsDashScript.GoogleAppsScript.Optimization.VariableType.INTEGER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableType with Double] = js.native
}

