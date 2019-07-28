package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonSet extends js.Object

@JSGlobal("GoogleAppsScript.Base.ButtonSet")
@js.native
object ButtonSet extends js.Object {
  @js.native
  sealed trait OK extends ButtonSet
  
  @js.native
  sealed trait OK_CANCEL extends ButtonSet
  
  @js.native
  sealed trait YES_NO extends ButtonSet
  
  @js.native
  sealed trait YES_NO_CANCEL extends ButtonSet
  
  /* 0 */ val OK: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.ButtonSet.OK with Double = js.native
  /* 1 */ val OK_CANCEL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.ButtonSet.OK_CANCEL with Double = js.native
  /* 2 */ val YES_NO: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.ButtonSet.YES_NO with Double = js.native
  /* 3 */ val YES_NO_CANCEL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.ButtonSet.YES_NO_CANCEL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonSet with Double] = js.native
}

