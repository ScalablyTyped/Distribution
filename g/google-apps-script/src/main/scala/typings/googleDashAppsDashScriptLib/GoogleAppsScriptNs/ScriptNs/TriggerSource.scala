package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriggerSource extends js.Object

@JSGlobal("GoogleAppsScript.Script.TriggerSource")
@js.native
object TriggerSource extends js.Object {
  @js.native
  sealed trait CALENDAR
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.TriggerSource
  
  @js.native
  sealed trait CLOCK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.TriggerSource
  
  @js.native
  sealed trait DOCUMENTS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.TriggerSource
  
  @js.native
  sealed trait FORMS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.TriggerSource
  
  @js.native
  sealed trait SPREADSHEETS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.TriggerSource
  
  /* 4 */ val CALENDAR: CALENDAR with scala.Double = js.native
  /* 1 */ val CLOCK: CLOCK with scala.Double = js.native
  /* 3 */ val DOCUMENTS: DOCUMENTS with scala.Double = js.native
  /* 2 */ val FORMS: FORMS with scala.Double = js.native
  /* 0 */ val SPREADSHEETS: SPREADSHEETS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.TriggerSource with scala.Double
  ] = js.native
}

