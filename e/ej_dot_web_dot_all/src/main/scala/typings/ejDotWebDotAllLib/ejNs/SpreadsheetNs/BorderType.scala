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
  
  val AllBorder: AllBorder with java.lang.String = js.native
  val Bottom: Bottom with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val OutSide: OutSide with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  val ThickBottom: ThickBottom with java.lang.String = js.native
  val ThickBox: ThickBox with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  val TopandBottom: TopandBottom with java.lang.String = js.native
  val TopandThickBottom: TopandThickBottom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.BorderType with java.lang.String] = js.native
}

