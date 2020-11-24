package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeveloperMetadataVisibility extends js.Object
/**
  * An enumeration of the types of developer metadata visibility.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility")
@js.native
object DeveloperMetadataVisibility extends js.Object {
  
  @js.native
  sealed trait DOCUMENT extends DeveloperMetadataVisibility
  
  @js.native
  sealed trait PROJECT extends DeveloperMetadataVisibility
}
