package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeveloperMetadataLocationType extends StObject
/**
  * An enumeration of the types of developer metadata location types.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType")
@js.native
object DeveloperMetadataLocationType extends StObject {
  
  @js.native
  sealed trait COLUMN
    extends StObject
       with DeveloperMetadataLocationType
  
  @js.native
  sealed trait ROW
    extends StObject
       with DeveloperMetadataLocationType
  
  @js.native
  sealed trait SHEET
    extends StObject
       with DeveloperMetadataLocationType
  
  @js.native
  sealed trait SPREADSHEET
    extends StObject
       with DeveloperMetadataLocationType
}
