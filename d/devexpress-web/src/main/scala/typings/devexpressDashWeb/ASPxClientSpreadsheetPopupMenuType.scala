package typings.devexpressDashWeb

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
  
  /* 8 */ val AutoFilter: typings.devexpressDashWeb.ASPxClientSpreadsheetPopupMenuType.AutoFilter with Double = js.native
  /* 7 */ val Cell: typings.devexpressDashWeb.ASPxClientSpreadsheetPopupMenuType.Cell with Double = js.native
  /* 5 */ val Chart: typings.devexpressDashWeb.ASPxClientSpreadsheetPopupMenuType.Chart with Double = js.native
  /* 0 */ val ColumnHeading: typings.devexpressDashWeb.ASPxClientSpreadsheetPopupMenuType.ColumnHeading with Double = js.native
  /* 4 */ val Picture: typings.devexpressDashWeb.ASPxClientSpreadsheetPopupMenuType.Picture with Double = js.native
  /* 9 */ val PivotTable: typings.devexpressDashWeb.ASPxClientSpreadsheetPopupMenuType.PivotTable with Double = js.native
  /* 10 */ val PivotTableAutoFilter: typings.devexpressDashWeb.ASPxClientSpreadsheetPopupMenuType.PivotTableAutoFilter with Double = js.native
  /* 1 */ val RowHeading: typings.devexpressDashWeb.ASPxClientSpreadsheetPopupMenuType.RowHeading with Double = js.native
  /* 3 */ val SheetTab: typings.devexpressDashWeb.ASPxClientSpreadsheetPopupMenuType.SheetTab with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ASPxClientSpreadsheetPopupMenuType with Double] = js.native
}

