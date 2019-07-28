package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderType extends js.Object

@JSGlobal("ej.Spreadsheet.BorderType")
@js.native
object BorderType extends js.Object {
  ///To apply all border for the given range of cell.
  @js.native
  sealed trait AllBorder extends BorderType
  
  ///To apply bottom border for the given range of cell.
  @js.native
  sealed trait Bottom extends BorderType
  
  ///To apply left border for the given range of cell.
  @js.native
  sealed trait Left extends BorderType
  
  ///To apply outside border for the given range of cell.
  @js.native
  sealed trait OutSide extends BorderType
  
  ///To apply right border for the given range of cell.
  @js.native
  sealed trait Right extends BorderType
  
  ///To apply thick bottom border for the given range of cell.
  @js.native
  sealed trait ThickBottom extends BorderType
  
  ///To apply thick box border for the given range of cell.
  @js.native
  sealed trait ThickBox extends BorderType
  
  ///To apply top border for the given range of cell.
  @js.native
  sealed trait Top extends BorderType
  
  ///To apply top and bottom border for the given range of cell.
  @js.native
  sealed trait TopandBottom extends BorderType
  
  ///To apply top and thick bottom border for the given range of cell.
  @js.native
  sealed trait TopandThickBottom extends BorderType
  
  /* 5 */ val AllBorder: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.AllBorder with Double = js.native
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.Bottom with Double = js.native
  /* 1 */ val Left: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.Left with Double = js.native
  /* 4 */ val OutSide: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.OutSide with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.Right with Double = js.native
  /* 7 */ val ThickBottom: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.ThickBottom with Double = js.native
  /* 6 */ val ThickBox: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.ThickBox with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.Top with Double = js.native
  /* 8 */ val TopandBottom: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.TopandBottom with Double = js.native
  /* 9 */ val TopandThickBottom: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.BorderType.TopandThickBottom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BorderType with Double] = js.native
}

