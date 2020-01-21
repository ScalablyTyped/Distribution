package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PivotTableSummarizeFunction with Double] = js.native
  /* 5 */ @js.native
  object AVERAGE extends TopLevel[AVERAGE with Double]
  
  /* 3 */ @js.native
  object COUNT extends TopLevel[COUNT with Double]
  
  /* 2 */ @js.native
  object COUNTA extends TopLevel[COUNTA with Double]
  
  /* 4 */ @js.native
  object COUNTUNIQUE extends TopLevel[COUNTUNIQUE with Double]
  
  /* 0 */ @js.native
  object CUSTOM extends TopLevel[CUSTOM with Double]
  
  /* 6 */ @js.native
  object MAX extends TopLevel[MAX with Double]
  
  /* 8 */ @js.native
  object MEDIAN extends TopLevel[MEDIAN with Double]
  
  /* 7 */ @js.native
  object MIN extends TopLevel[MIN with Double]
  
  /* 9 */ @js.native
  object PRODUCT extends TopLevel[PRODUCT with Double]
  
  /* 10 */ @js.native
  object STDEV extends TopLevel[STDEV with Double]
  
  /* 11 */ @js.native
  object STDEVP extends TopLevel[STDEVP with Double]
  
  /* 1 */ @js.native
  object SUM extends TopLevel[SUM with Double]
  
  /* 12 */ @js.native
  object VAR extends TopLevel[VAR with Double]
  
  /* 13 */ @js.native
  object VARP extends TopLevel[VARP with Double]
  
}

