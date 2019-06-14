package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetsOnChangeChangeType extends js.Object

@JSGlobal("GoogleAppsScript.Events.SheetsOnChangeChangeType")
@js.native
object SheetsOnChangeChangeType extends js.Object {
  @js.native
  sealed trait EDIT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType
  
  @js.native
  sealed trait FORMAT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType
  
  @js.native
  sealed trait INSERT_COLUMN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType
  
  @js.native
  sealed trait INSERT_GRID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType
  
  @js.native
  sealed trait INSERT_ROW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType
  
  @js.native
  sealed trait OTHER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType
  
  @js.native
  sealed trait REMOVE_COLUMN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType
  
  @js.native
  sealed trait REMOVE_GRID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType
  
  @js.native
  sealed trait REMOVE_ROW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType
  
  /* 0 */ val EDIT: EDIT with scala.Double = js.native
  /* 7 */ val FORMAT: FORMAT with scala.Double = js.native
  /* 2 */ val INSERT_COLUMN: INSERT_COLUMN with scala.Double = js.native
  /* 5 */ val INSERT_GRID: INSERT_GRID with scala.Double = js.native
  /* 1 */ val INSERT_ROW: INSERT_ROW with scala.Double = js.native
  /* 8 */ val OTHER: OTHER with scala.Double = js.native
  /* 4 */ val REMOVE_COLUMN: REMOVE_COLUMN with scala.Double = js.native
  /* 6 */ val REMOVE_GRID: REMOVE_GRID with scala.Double = js.native
  /* 3 */ val REMOVE_ROW: REMOVE_ROW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType with scala.Double
  ] = js.native
}

