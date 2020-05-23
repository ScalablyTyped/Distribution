package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotValueDisplayType extends js.Object

/**
  * An enumeration of ways to display a pivot value as a function of another value.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.PivotValueDisplayType")
@js.native
object PivotValueDisplayType extends js.Object {
  @js.native
  sealed trait DEFAULT extends PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_COLUMN_TOTAL extends PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_GRAND_TOTAL extends PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_ROW_TOTAL extends PivotValueDisplayType
  
}

