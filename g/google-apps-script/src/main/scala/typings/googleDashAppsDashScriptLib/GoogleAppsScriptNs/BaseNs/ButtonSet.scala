package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonSet extends js.Object

@JSGlobal("GoogleAppsScript.Base.ButtonSet")
@js.native
object ButtonSet extends js.Object {
  @js.native
  sealed trait OK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.ButtonSet
  
  @js.native
  sealed trait OK_CANCEL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.ButtonSet
  
  @js.native
  sealed trait YES_NO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.ButtonSet
  
  @js.native
  sealed trait YES_NO_CANCEL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.ButtonSet
  
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 1 */ val OK_CANCEL: OK_CANCEL with scala.Double = js.native
  /* 2 */ val YES_NO: YES_NO with scala.Double = js.native
  /* 3 */ val YES_NO_CANCEL: YES_NO_CANCEL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.ButtonSet with scala.Double
  ] = js.native
}

