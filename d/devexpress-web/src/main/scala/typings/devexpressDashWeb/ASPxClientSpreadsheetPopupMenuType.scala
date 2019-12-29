package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASPxClientSpreadsheetPopupMenuType extends js.Object

/**
  * Lists values that identify the context menu type.
  */
@JSGlobal("ASPxClientSpreadsheetPopupMenuType")
@js.native
object ASPxClientSpreadsheetPopupMenuType extends js.Object {
  /**
    * Specifies a context menu which can be invoked by clicking the AutoFilter drop-down arrow.
    */
  @js.native
  sealed trait AutoFilter extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking any cell in a worksheet.
    */
  @js.native
  sealed trait Cell extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a chart in a worksheet.
    */
  @js.native
  sealed trait Chart extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a column header.
    */
  @js.native
  sealed trait ColumnHeading extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a picture embedded in a worksheet.
    */
  @js.native
  sealed trait Picture extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking any cell in a pivot table.
    */
  @js.native
  sealed trait PivotTable extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by clicking the AutoFilter drop-down arrow on the row or column label of a pivot table.
    */
  @js.native
  sealed trait PivotTableAutoFilter extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a row header.
    */
  @js.native
  sealed trait RowHeading extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a worksheet tab.
    */
  @js.native
  sealed trait SheetTab extends ASPxClientSpreadsheetPopupMenuType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ASPxClientSpreadsheetPopupMenuType with Double] = js.native
  /* 8 */ @js.native
  object AutoFilter extends TopLevel[AutoFilter with Double]
  
  /* 7 */ @js.native
  object Cell extends TopLevel[Cell with Double]
  
  /* 5 */ @js.native
  object Chart extends TopLevel[Chart with Double]
  
  /* 0 */ @js.native
  object ColumnHeading extends TopLevel[ColumnHeading with Double]
  
  /* 4 */ @js.native
  object Picture extends TopLevel[Picture with Double]
  
  /* 9 */ @js.native
  object PivotTable extends TopLevel[PivotTable with Double]
  
  /* 10 */ @js.native
  object PivotTableAutoFilter extends TopLevel[PivotTableAutoFilter with Double]
  
  /* 1 */ @js.native
  object RowHeading extends TopLevel[RowHeading with Double]
  
  /* 3 */ @js.native
  object SheetTab extends TopLevel[SheetTab with Double]
  
}

