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
  
  val Between: Between with java.lang.String = js.native
  val DateOccurs: DateOccurs with java.lang.String = js.native
  val EqualTo: EqualTo with java.lang.String = js.native
  val GreaterThan: GreaterThan with java.lang.String = js.native
  val LessThan: LessThan with java.lang.String = js.native
  val TextContains: TextContains with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatRule with java.lang.String] = js.native
}

