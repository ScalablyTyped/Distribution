package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

@JSGlobal("GoogleAppsScript.Base.Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait CANCEL extends Button
  
  @js.native
  sealed trait CLOSE extends Button
  
  @js.native
  sealed trait NO extends Button
  
  @js.native
  sealed trait OK extends Button
  
  @js.native
  sealed trait YES extends Button
  
  /* 2 */ val CANCEL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Button.CANCEL with Double = js.native
  /* 0 */ val CLOSE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Button.CLOSE with Double = js.native
  /* 4 */ val NO: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Button.NO with Double = js.native
  /* 1 */ val OK: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Button.OK with Double = js.native
  /* 3 */ val YES: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Button.YES with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Button with Double] = js.native
}

