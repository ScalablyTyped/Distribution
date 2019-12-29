package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BooleanCriteria extends js.Object

/**
  * An enumeration representing the boolean criteria that can be used in conditional format or
  * filter.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.BooleanCriteria")
@js.native
object BooleanCriteria extends js.Object {
  @js.native
  sealed trait CELL_EMPTY extends BooleanCriteria
  
  @js.native
  sealed trait CELL_NOT_EMPTY extends BooleanCriteria
  
  @js.native
  sealed trait CUSTOM_FORMULA extends BooleanCriteria
  
  @js.native
  sealed trait DATE_AFTER extends BooleanCriteria
  
  @js.native
  sealed trait DATE_AFTER_RELATIVE extends BooleanCriteria
  
  @js.native
  sealed trait DATE_BEFORE extends BooleanCriteria
  
  @js.native
  sealed trait DATE_BEFORE_RELATIVE extends BooleanCriteria
  
  @js.native
  sealed trait DATE_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait DATE_EQUAL_TO_RELATIVE extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_BETWEEN extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN_OR_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN_OR_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_NOT_BETWEEN extends BooleanCriteria
  
  @js.native
  sealed trait NUMBER_NOT_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_CONTAINS extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_DOES_NOT_CONTAIN extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_ENDS_WITH extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_EQUAL_TO extends BooleanCriteria
  
  @js.native
  sealed trait TEXT_STARTS_WITH extends BooleanCriteria
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BooleanCriteria with Double] = js.native
  /* 0 */ @js.native
  object CELL_EMPTY extends TopLevel[CELL_EMPTY with Double]
  
  /* 1 */ @js.native
  object CELL_NOT_EMPTY extends TopLevel[CELL_NOT_EMPTY with Double]
  
  /* 21 */ @js.native
  object CUSTOM_FORMULA extends TopLevel[CUSTOM_FORMULA with Double]
  
  /* 2 */ @js.native
  object DATE_AFTER extends TopLevel[DATE_AFTER with Double]
  
  /* 5 */ @js.native
  object DATE_AFTER_RELATIVE extends TopLevel[DATE_AFTER_RELATIVE with Double]
  
  /* 3 */ @js.native
  object DATE_BEFORE extends TopLevel[DATE_BEFORE with Double]
  
  /* 6 */ @js.native
  object DATE_BEFORE_RELATIVE extends TopLevel[DATE_BEFORE_RELATIVE with Double]
  
  /* 4 */ @js.native
  object DATE_EQUAL_TO extends TopLevel[DATE_EQUAL_TO with Double]
  
  /* 7 */ @js.native
  object DATE_EQUAL_TO_RELATIVE extends TopLevel[DATE_EQUAL_TO_RELATIVE with Double]
  
  /* 8 */ @js.native
  object NUMBER_BETWEEN extends TopLevel[NUMBER_BETWEEN with Double]
  
  /* 9 */ @js.native
  object NUMBER_EQUAL_TO extends TopLevel[NUMBER_EQUAL_TO with Double]
  
  /* 10 */ @js.native
  object NUMBER_GREATER_THAN extends TopLevel[NUMBER_GREATER_THAN with Double]
  
  /* 11 */ @js.native
  object NUMBER_GREATER_THAN_OR_EQUAL_TO extends TopLevel[NUMBER_GREATER_THAN_OR_EQUAL_TO with Double]
  
  /* 12 */ @js.native
  object NUMBER_LESS_THAN extends TopLevel[NUMBER_LESS_THAN with Double]
  
  /* 13 */ @js.native
  object NUMBER_LESS_THAN_OR_EQUAL_TO extends TopLevel[NUMBER_LESS_THAN_OR_EQUAL_TO with Double]
  
  /* 14 */ @js.native
  object NUMBER_NOT_BETWEEN extends TopLevel[NUMBER_NOT_BETWEEN with Double]
  
  /* 15 */ @js.native
  object NUMBER_NOT_EQUAL_TO extends TopLevel[NUMBER_NOT_EQUAL_TO with Double]
  
  /* 16 */ @js.native
  object TEXT_CONTAINS extends TopLevel[TEXT_CONTAINS with Double]
  
  /* 17 */ @js.native
  object TEXT_DOES_NOT_CONTAIN extends TopLevel[TEXT_DOES_NOT_CONTAIN with Double]
  
  /* 20 */ @js.native
  object TEXT_ENDS_WITH extends TopLevel[TEXT_ENDS_WITH with Double]
  
  /* 18 */ @js.native
  object TEXT_EQUAL_TO extends TopLevel[TEXT_EQUAL_TO with Double]
  
  /* 19 */ @js.native
  object TEXT_STARTS_WITH extends TopLevel[TEXT_STARTS_WITH with Double]
  
}

