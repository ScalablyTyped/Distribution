package typings.googleDashAppsDashScript.GoogleAppsScript.Optimization

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableType with Double] = js.native
  /* 1 */ @js.native
  object CONTINUOUS extends TopLevel[CONTINUOUS with Double]
  
  /* 0 */ @js.native
  object INTEGER extends TopLevel[INTEGER with Double]
  
}

