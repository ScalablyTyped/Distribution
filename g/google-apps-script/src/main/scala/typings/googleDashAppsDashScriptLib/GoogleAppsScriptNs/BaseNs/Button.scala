package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

@JSGlobal("GoogleAppsScript.Base.Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait CANCEL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  @js.native
  sealed trait CLOSE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  @js.native
  sealed trait NO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  @js.native
  sealed trait OK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  @js.native
  sealed trait YES
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  /* 2 */ val CANCEL: CANCEL with scala.Double = js.native
  /* 0 */ val CLOSE: CLOSE with scala.Double = js.native
  /* 4 */ val NO: NO with scala.Double = js.native
  /* 1 */ val OK: OK with scala.Double = js.native
  /* 3 */ val YES: YES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button with scala.Double] = js.native
}

