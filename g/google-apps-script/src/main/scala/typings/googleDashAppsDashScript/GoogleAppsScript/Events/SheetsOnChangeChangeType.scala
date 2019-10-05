package typings.googleDashAppsDashScript.GoogleAppsScript.Events

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
  
  /* 0 */ val EDIT: typings.googleDashAppsDashScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.EDIT with Double = js.native
  /* 7 */ val FORMAT: typings.googleDashAppsDashScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.FORMAT with Double = js.native
  /* 2 */ val INSERT_COLUMN: typings.googleDashAppsDashScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.INSERT_COLUMN with Double = js.native
  /* 5 */ val INSERT_GRID: typings.googleDashAppsDashScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.INSERT_GRID with Double = js.native
  /* 1 */ val INSERT_ROW: typings.googleDashAppsDashScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.INSERT_ROW with Double = js.native
  /* 8 */ val OTHER: typings.googleDashAppsDashScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.OTHER with Double = js.native
  /* 4 */ val REMOVE_COLUMN: typings.googleDashAppsDashScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.REMOVE_COLUMN with Double = js.native
  /* 6 */ val REMOVE_GRID: typings.googleDashAppsDashScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.REMOVE_GRID with Double = js.native
  /* 3 */ val REMOVE_ROW: typings.googleDashAppsDashScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.REMOVE_ROW with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SheetsOnChangeChangeType with Double] = js.native
}

