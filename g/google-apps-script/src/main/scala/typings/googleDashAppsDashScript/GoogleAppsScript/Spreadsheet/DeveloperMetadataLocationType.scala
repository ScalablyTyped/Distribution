package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeveloperMetadataLocationType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType")
@js.native
object DeveloperMetadataLocationType extends js.Object {
  @js.native
  sealed trait COLUMN extends DeveloperMetadataLocationType
  
  @js.native
  sealed trait ROW extends DeveloperMetadataLocationType
  
  @js.native
  sealed trait SHEET extends DeveloperMetadataLocationType
  
  @js.native
  sealed trait SPREADSHEET extends DeveloperMetadataLocationType
  
  /* 3 */ val COLUMN: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.COLUMN with Double = js.native
  /* 2 */ val ROW: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.ROW with Double = js.native
  /* 1 */ val SHEET: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.SHEET with Double = js.native
  /* 0 */ val SPREADSHEET: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.SPREADSHEET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeveloperMetadataLocationType with Double] = js.native
}

