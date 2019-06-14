package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  sealed trait AllBorder
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  ///To apply bottom border for the given range of cell.
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  ///To apply left border for the given range of cell.
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  ///To apply outside border for the given range of cell.
  @js.native
  sealed trait OutSide
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  ///To apply right border for the given range of cell.
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  ///To apply thick bottom border for the given range of cell.
  @js.native
  sealed trait ThickBottom
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  ///To apply thick box border for the given range of cell.
  @js.native
  sealed trait ThickBox
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  ///To apply top border for the given range of cell.
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  ///To apply top and bottom border for the given range of cell.
  @js.native
  sealed trait TopandBottom
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  ///To apply top and thick bottom border for the given range of cell.
  @js.native
  sealed trait TopandThickBottom
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType
  
  /* 5 */ val AllBorder: AllBorder with scala.Double = js.native
  /* 3 */ val Bottom: Bottom with scala.Double = js.native
  /* 1 */ val Left: Left with scala.Double = js.native
  /* 4 */ val OutSide: OutSide with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  /* 7 */ val ThickBottom: ThickBottom with scala.Double = js.native
  /* 6 */ val ThickBox: ThickBox with scala.Double = js.native
  /* 0 */ val Top: Top with scala.Double = js.native
  /* 8 */ val TopandBottom: TopandBottom with scala.Double = js.native
  /* 9 */ val TopandThickBottom: TopandThickBottom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType with scala.Double] = js.native
}

