package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PivotValueDisplayType with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 2 */ @js.native
  object PERCENT_OF_COLUMN_TOTAL extends TopLevel[PERCENT_OF_COLUMN_TOTAL with Double]
  
  /* 3 */ @js.native
  object PERCENT_OF_GRAND_TOTAL extends TopLevel[PERCENT_OF_GRAND_TOTAL with Double]
  
  /* 1 */ @js.native
  object PERCENT_OF_ROW_TOTAL extends TopLevel[PERCENT_OF_ROW_TOTAL with Double]
  
}

