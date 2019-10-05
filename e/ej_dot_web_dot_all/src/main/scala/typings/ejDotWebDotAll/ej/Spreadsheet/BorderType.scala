package typings.ejDotWebDotAll.ej.Spreadsheet

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
  
  /* 5 */ val AllBorder: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.AllBorder with Double = js.native
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.Bottom with Double = js.native
  /* 1 */ val Left: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.Left with Double = js.native
  /* 4 */ val OutSide: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.OutSide with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.Right with Double = js.native
  /* 7 */ val ThickBottom: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.ThickBottom with Double = js.native
  /* 6 */ val ThickBox: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.ThickBox with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.Top with Double = js.native
  /* 8 */ val TopandBottom: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.TopandBottom with Double = js.native
  /* 9 */ val TopandThickBottom: typings.ejDotWebDotAll.ej.Spreadsheet.BorderType.TopandThickBottom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BorderType with Double] = js.native
}

