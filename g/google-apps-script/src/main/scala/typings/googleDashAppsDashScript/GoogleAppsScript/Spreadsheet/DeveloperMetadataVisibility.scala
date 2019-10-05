package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeveloperMetadataVisibility extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility")
@js.native
object DeveloperMetadataVisibility extends js.Object {
  @js.native
  sealed trait DOCUMENT extends DeveloperMetadataVisibility
  
  @js.native
  sealed trait PROJECT extends DeveloperMetadataVisibility
  
  /* 0 */ val DOCUMENT: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility.DOCUMENT with Double = js.native
  /* 1 */ val PROJECT: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility.PROJECT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeveloperMetadataVisibility with Double] = js.native
}

