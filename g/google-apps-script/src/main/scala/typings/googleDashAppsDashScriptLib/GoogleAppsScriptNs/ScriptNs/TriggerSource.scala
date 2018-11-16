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
  
  val CALENDAR: CALENDAR with java.lang.String = js.native
  val CLOCK: CLOCK with java.lang.String = js.native
  val DOCUMENTS: DOCUMENTS with java.lang.String = js.native
  val FORMS: FORMS with java.lang.String = js.native
  val SPREADSHEETS: SPREADSHEETS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.TriggerSource with java.lang.String
  ] = js.native
}

