package typings.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Apps Script Events
  * @see https://developers.google.com/apps-script/guides/triggers/events
  */
@JSGlobal("GoogleAppsScript.Events")
@js.native
object Events extends js.Object {
  @js.native
  object SheetsOnChangeChangeType extends js.Object {
    /* 0 */ val EDIT: typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.EDIT with Double = js.native
    /* 7 */ val FORMAT: typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.FORMAT with Double = js.native
    /* 2 */ val INSERT_COLUMN: typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.INSERT_COLUMN with Double = js.native
    /* 5 */ val INSERT_GRID: typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.INSERT_GRID with Double = js.native
    /* 1 */ val INSERT_ROW: typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.INSERT_ROW with Double = js.native
    /* 8 */ val OTHER: typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.OTHER with Double = js.native
    /* 4 */ val REMOVE_COLUMN: typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.REMOVE_COLUMN with Double = js.native
    /* 6 */ val REMOVE_GRID: typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.REMOVE_GRID with Double = js.native
    /* 3 */ val REMOVE_ROW: typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType.REMOVE_ROW with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleAppsScript.GoogleAppsScript.Events.SheetsOnChangeChangeType with Double
      ] = js.native
  }
  
}

