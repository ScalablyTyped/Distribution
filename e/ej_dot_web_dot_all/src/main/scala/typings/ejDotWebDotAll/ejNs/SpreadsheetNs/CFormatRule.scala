package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

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
  sealed trait Between extends CFormatRule
  
  ///To identify the specified date in the range of cells.
  @js.native
  sealed trait DateOccurs extends CFormatRule
  
  ///To identify the equal values in the given range of cells.
  @js.native
  sealed trait EqualTo extends CFormatRule
  
  ///To identify greater than values in the given range of cells.
  @js.native
  sealed trait GreaterThan extends CFormatRule
  
  ///To identify less than values in the given range of cells.
  @js.native
  sealed trait LessThan extends CFormatRule
  
  ///To identify the specified text in the range of cells.
  @js.native
  sealed trait TextContains extends CFormatRule
  
  /* 2 */ val Between: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatRule.Between with Double = js.native
  /* 5 */ val DateOccurs: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatRule.DateOccurs with Double = js.native
  /* 3 */ val EqualTo: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatRule.EqualTo with Double = js.native
  /* 0 */ val GreaterThan: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatRule.GreaterThan with Double = js.native
  /* 1 */ val LessThan: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatRule.LessThan with Double = js.native
  /* 4 */ val TextContains: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatRule.TextContains with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CFormatRule with Double] = js.native
}

