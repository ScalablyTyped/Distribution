package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("GoogleAppsScript.Charts.Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait BOTTOM extends Position
  
  @js.native
  sealed trait NONE extends Position
  
  @js.native
  sealed trait RIGHT extends Position
  
  @js.native
  sealed trait TOP extends Position
  
  /* 2 */ val BOTTOM: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.Position.BOTTOM with Double = js.native
  /* 3 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.Position.NONE with Double = js.native
  /* 1 */ val RIGHT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.Position.RIGHT with Double = js.native
  /* 0 */ val TOP: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.Position.TOP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
}

