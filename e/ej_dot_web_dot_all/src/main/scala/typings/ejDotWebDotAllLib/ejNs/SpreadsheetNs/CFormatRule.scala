package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CFormatRule extends js.Object

@JSGlobal("ej.Spreadsheet.CFormatRule")
@js.native
object CFormatRule extends js.Object {
  ///To identify in between values in the given range of cells.
  @js.native
  sealed trait Between
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatRule
  
  ///To identify the specified date in the range of cells.
  @js.native
  sealed trait DateOccurs
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatRule
  
  ///To identify the equal values in the given range of cells.
  @js.native
  sealed trait EqualTo
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatRule
  
  ///To identify greater than values in the given range of cells.
  @js.native
  sealed trait GreaterThan
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatRule
  
  ///To identify less than values in the given range of cells.
  @js.native
  sealed trait LessThan
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatRule
  
  ///To identify the specified text in the range of cells.
  @js.native
  sealed trait TextContains
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatRule
  
  /* 2 */ val Between: Between with scala.Double = js.native
  /* 5 */ val DateOccurs: DateOccurs with scala.Double = js.native
  /* 3 */ val EqualTo: EqualTo with scala.Double = js.native
  /* 0 */ val GreaterThan: GreaterThan with scala.Double = js.native
  /* 1 */ val LessThan: LessThan with scala.Double = js.native
  /* 4 */ val TextContains: TextContains with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatRule with scala.Double] = js.native
}

