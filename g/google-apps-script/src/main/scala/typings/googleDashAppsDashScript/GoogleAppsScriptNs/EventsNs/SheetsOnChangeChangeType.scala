package typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetsOnChangeChangeType extends js.Object

@JSGlobal("GoogleAppsScript.Events.SheetsOnChangeChangeType")
@js.native
object SheetsOnChangeChangeType extends js.Object {
  @js.native
  sealed trait EDIT extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait FORMAT extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait INSERT_COLUMN extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait INSERT_GRID extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait INSERT_ROW extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait OTHER extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait REMOVE_COLUMN extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait REMOVE_GRID extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait REMOVE_ROW extends SheetsOnChangeChangeType
  
  /* 0 */ val EDIT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType.EDIT with Double = js.native
  /* 7 */ val FORMAT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType.FORMAT with Double = js.native
  /* 2 */ val INSERT_COLUMN: typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType.INSERT_COLUMN with Double = js.native
  /* 5 */ val INSERT_GRID: typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType.INSERT_GRID with Double = js.native
  /* 1 */ val INSERT_ROW: typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType.INSERT_ROW with Double = js.native
  /* 8 */ val OTHER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType.OTHER with Double = js.native
  /* 4 */ val REMOVE_COLUMN: typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType.REMOVE_COLUMN with Double = js.native
  /* 6 */ val REMOVE_GRID: typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType.REMOVE_GRID with Double = js.native
  /* 3 */ val REMOVE_ROW: typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType.REMOVE_ROW with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SheetsOnChangeChangeType with Double] = js.native
}

