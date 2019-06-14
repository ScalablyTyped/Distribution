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
  
  /* 0 */ val CLOCK: CLOCK with scala.Double = js.native
  /* 4 */ val ON_CHANGE: ON_CHANGE with scala.Double = js.native
  /* 2 */ val ON_EDIT: ON_EDIT with scala.Double = js.native
  /* 5 */ val ON_EVENT_UPDATED: ON_EVENT_UPDATED with scala.Double = js.native
  /* 3 */ val ON_FORM_SUBMIT: ON_FORM_SUBMIT with scala.Double = js.native
  /* 1 */ val ON_OPEN: ON_OPEN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.EventType with scala.Double
  ] = js.native
}

