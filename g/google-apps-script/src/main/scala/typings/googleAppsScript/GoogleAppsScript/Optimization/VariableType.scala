package typings.googleAppsScript.GoogleAppsScript.Optimization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
