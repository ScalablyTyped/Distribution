package typings.ejDotWebDotAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Spreadsheet.CFormatRule.Between
import typings.ejDotWebDotAll.ej.Spreadsheet.CFormatRule.DateOccurs
import typings.ejDotWebDotAll.ej.Spreadsheet.CFormatRule.EqualTo
import typings.ejDotWebDotAll.ej.Spreadsheet.CFormatRule.GreaterThan
import typings.ejDotWebDotAll.ej.Spreadsheet.CFormatRule.LessThan
import typings.ejDotWebDotAll.ej.Spreadsheet.CFormatRule.TextContains
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CFormatRule with Double] = js.native
  /* 2 */ @js.native
  object Between extends TopLevel[Between with Double]
  
  /* 5 */ @js.native
  object DateOccurs extends TopLevel[DateOccurs with Double]
  
  /* 3 */ @js.native
  object EqualTo extends TopLevel[EqualTo with Double]
  
  /* 0 */ @js.native
  object GreaterThan extends TopLevel[GreaterThan with Double]
  
  /* 1 */ @js.native
  object LessThan extends TopLevel[LessThan with Double]
  
  /* 4 */ @js.native
  object TextContains extends TopLevel[TextContains with Double]
  
}

