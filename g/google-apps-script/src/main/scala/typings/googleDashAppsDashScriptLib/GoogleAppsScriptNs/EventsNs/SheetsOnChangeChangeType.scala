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
  
  val EDIT: EDIT with java.lang.String = js.native
  val FORMAT: FORMAT with java.lang.String = js.native
  val INSERT_COLUMN: INSERT_COLUMN with java.lang.String = js.native
  val INSERT_GRID: INSERT_GRID with java.lang.String = js.native
  val INSERT_ROW: INSERT_ROW with java.lang.String = js.native
  val OTHER: OTHER with java.lang.String = js.native
  val REMOVE_COLUMN: REMOVE_COLUMN with java.lang.String = js.native
  val REMOVE_GRID: REMOVE_GRID with java.lang.String = js.native
  val REMOVE_ROW: REMOVE_ROW with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs.SheetsOnChangeChangeType with java.lang.String
  ] = js.native
}

