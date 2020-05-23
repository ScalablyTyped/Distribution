package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

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
  
}

