package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoFillSeries extends js.Object
/**
  * An enumeration of the types of series used to calculate auto-filled values. The manner in which
  * these series affect calculated values differs depending on the type and amount of source data.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.AutoFillSeries")
@js.native
object AutoFillSeries extends js.Object {
  
  @js.native
  sealed trait ALTERNATE_SERIES extends AutoFillSeries
  
  @js.native
  sealed trait DEFAULT_SERIES extends AutoFillSeries
}
