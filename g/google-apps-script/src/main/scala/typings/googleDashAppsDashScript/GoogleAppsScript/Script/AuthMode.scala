package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthMode extends js.Object

@JSGlobal("GoogleAppsScript.Script.AuthMode")
@js.native
object AuthMode extends js.Object {
  @js.native
  sealed trait CUSTOM_FUNCTION extends AuthMode
  
  @js.native
  sealed trait FULL extends AuthMode
  
  @js.native
  sealed trait LIMITED extends AuthMode
  
  @js.native
  sealed trait NONE extends AuthMode
  
  /* 1 */ val CUSTOM_FUNCTION: typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode.CUSTOM_FUNCTION with Double = js.native
  /* 3 */ val FULL: typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode.FULL with Double = js.native
  /* 2 */ val LIMITED: typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode.LIMITED with Double = js.native
  /* 0 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode.NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthMode with Double] = js.native
}

