package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Dimension extends js.Object
/**
  * An enumeration of possible directions along which data can be stored in a spreadsheet.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.Dimension")
@js.native
object Dimension extends js.Object {
  
  @js.native
  sealed trait COLUMNS extends Dimension
  
  @js.native
  sealed trait ROWS extends Dimension
}
