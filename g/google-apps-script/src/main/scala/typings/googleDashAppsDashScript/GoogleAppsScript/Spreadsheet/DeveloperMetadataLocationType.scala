package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeveloperMetadataLocationType extends js.Object

/**
  * An enumeration of the types of developer metadata location types.
  */
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeveloperMetadataLocationType with Double] = js.native
  /* 3 */ @js.native
  object COLUMN extends TopLevel[COLUMN with Double]
  
  /* 2 */ @js.native
  object ROW extends TopLevel[ROW with Double]
  
  /* 1 */ @js.native
  object SHEET extends TopLevel[SHEET with Double]
  
  /* 0 */ @js.native
  object SPREADSHEET extends TopLevel[SPREADSHEET with Double]
  
}

