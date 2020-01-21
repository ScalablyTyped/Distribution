package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeveloperMetadataVisibility with Double] = js.native
  /* 0 */ @js.native
  object DOCUMENT extends TopLevel[DOCUMENT with Double]
  
  /* 1 */ @js.native
  object PROJECT extends TopLevel[PROJECT with Double]
  
}

