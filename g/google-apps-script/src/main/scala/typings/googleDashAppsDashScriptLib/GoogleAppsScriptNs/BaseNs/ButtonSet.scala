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
  
  val OK: OK with java.lang.String = js.native
  val OK_CANCEL: OK_CANCEL with java.lang.String = js.native
  val YES_NO: YES_NO with java.lang.String = js.native
  val YES_NO_CANCEL: YES_NO_CANCEL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.ButtonSet with java.lang.String
  ] = js.native
}

