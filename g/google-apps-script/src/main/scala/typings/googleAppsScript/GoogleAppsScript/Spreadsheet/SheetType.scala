package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SheetType extends js.Object
/**
  * The different types of sheets that can exist in a spreadsheet.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.SheetType")
@js.native
object SheetType extends js.Object {
  
  @js.native
  sealed trait GRID extends SheetType
  
  @js.native
  sealed trait OBJECT extends SheetType
}
