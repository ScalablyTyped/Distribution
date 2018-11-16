package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("GoogleAppsScript.Script.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait CLOCK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.EventType
  
  @js.native
  sealed trait ON_CHANGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.EventType
  
  @js.native
  sealed trait ON_EDIT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.EventType
  
  @js.native
  sealed trait ON_EVENT_UPDATED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.EventType
  
  @js.native
  sealed trait ON_FORM_SUBMIT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.EventType
  
  @js.native
  sealed trait ON_OPEN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.EventType
  
  val CLOCK: CLOCK with java.lang.String = js.native
  val ON_CHANGE: ON_CHANGE with java.lang.String = js.native
  val ON_EDIT: ON_EDIT with java.lang.String = js.native
  val ON_EVENT_UPDATED: ON_EVENT_UPDATED with java.lang.String = js.native
  val ON_FORM_SUBMIT: ON_FORM_SUBMIT with java.lang.String = js.native
  val ON_OPEN: ON_OPEN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.EventType with java.lang.String
  ] = js.native
}

