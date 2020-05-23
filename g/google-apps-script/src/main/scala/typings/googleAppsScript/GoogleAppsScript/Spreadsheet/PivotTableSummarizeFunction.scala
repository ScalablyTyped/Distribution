package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotTableSummarizeFunction extends js.Object

/**
  * An enumeration of functions that summarize pivot table data.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction")
@js.native
object PivotTableSummarizeFunction extends js.Object {
  @js.native
  sealed trait AVERAGE extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait COUNT extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait COUNTA extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait COUNTUNIQUE extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait CUSTOM extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait MAX extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait MEDIAN extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait MIN extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait PRODUCT extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait STDEV extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait STDEVP extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait SUM extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait VAR extends PivotTableSummarizeFunction
  
  @js.native
  sealed trait VARP extends PivotTableSummarizeFunction
  
}

