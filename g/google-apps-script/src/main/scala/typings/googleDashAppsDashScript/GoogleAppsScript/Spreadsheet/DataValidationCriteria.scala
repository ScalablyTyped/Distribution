package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataValidationCriteria extends js.Object

/**
  * An enumeration representing the data validation criteria that can be set on a range.
  *
  *     // Change existing data-validation rules that require a date in 2013 to require a date in 2014.
  *     var oldDates = [new Date('1/1/2013'), new Date('12/31/2013')];
  *     var newDates = [new Date('1/1/2014'), new Date('12/31/2014')];
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var range = sheet.getRange(1, 1, sheet.getMaxRows(), sheet.getMaxColumns());
  *     var rules = range.getDataValidations();
  *
  *     for (var i = 0; i < rules.length; i++) {
  *       for (var j = 0; j < rules[i].length; j++) {
  *         var rule = rules[i][j];
  *
  *         if (rule != null) {
  *           var criteria = rule.getCriteriaType();
  *           var args = rule.getCriteriaValues();
  *
  *           if (criteria == SpreadsheetApp.DataValidationCriteria.DATE_BETWEEN
  *               && args[0].getTime() == oldDates[0].getTime()
  *               && args[1].getTime() == oldDates[1].getTime()) {
  *             // Create a builder from the existing rule, then change the dates.
  *             rules[i][j] = rule.copy().withCriteria(criteria, newDates).build();
  *           }
  *         }
  *       }
  *     }
  *     range.setDataValidations(rules);
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DataValidationCriteria")
@js.native
object DataValidationCriteria extends js.Object {
  @js.native
  sealed trait CHECKBOX extends DataValidationCriteria
  
  @js.native
  sealed trait CUSTOM_FORMULA extends DataValidationCriteria
  
  @js.native
  sealed trait DATE_AFTER extends DataValidationCriteria
  
  @js.native
  sealed trait DATE_BEFORE extends DataValidationCriteria
  
  @js.native
  sealed trait DATE_BETWEEN extends DataValidationCriteria
  
  @js.native
  sealed trait DATE_EQUAL_TO extends DataValidationCriteria
  
  @js.native
  sealed trait DATE_IS_VALID_DATE extends DataValidationCriteria
  
  @js.native
  sealed trait DATE_NOT_BETWEEN extends DataValidationCriteria
  
  @js.native
  sealed trait DATE_ON_OR_AFTER extends DataValidationCriteria
  
  @js.native
  sealed trait DATE_ON_OR_BEFORE extends DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_BETWEEN extends DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_EQUAL_TO extends DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN extends DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN_OR_EQUAL_TO extends DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN extends DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN_OR_EQUAL_TO extends DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_NOT_BETWEEN extends DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_NOT_EQUAL_TO extends DataValidationCriteria
  
  @js.native
  sealed trait TEXT_CONTAINS extends DataValidationCriteria
  
  @js.native
  sealed trait TEXT_DOES_NOT_CONTAIN extends DataValidationCriteria
  
  @js.native
  sealed trait TEXT_EQUAL_TO extends DataValidationCriteria
  
  @js.native
  sealed trait TEXT_IS_VALID_EMAIL extends DataValidationCriteria
  
  @js.native
  sealed trait TEXT_IS_VALID_URL extends DataValidationCriteria
  
  @js.native
  sealed trait VALUE_IN_LIST extends DataValidationCriteria
  
  @js.native
  sealed trait VALUE_IN_RANGE extends DataValidationCriteria
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataValidationCriteria with Double] = js.native
  /* 24 */ @js.native
  object CHECKBOX extends TopLevel[CHECKBOX with Double]
  
  /* 23 */ @js.native
  object CUSTOM_FORMULA extends TopLevel[CUSTOM_FORMULA with Double]
  
  /* 0 */ @js.native
  object DATE_AFTER extends TopLevel[DATE_AFTER with Double]
  
  /* 1 */ @js.native
  object DATE_BEFORE extends TopLevel[DATE_BEFORE with Double]
  
  /* 2 */ @js.native
  object DATE_BETWEEN extends TopLevel[DATE_BETWEEN with Double]
  
  /* 3 */ @js.native
  object DATE_EQUAL_TO extends TopLevel[DATE_EQUAL_TO with Double]
  
  /* 4 */ @js.native
  object DATE_IS_VALID_DATE extends TopLevel[DATE_IS_VALID_DATE with Double]
  
  /* 5 */ @js.native
  object DATE_NOT_BETWEEN extends TopLevel[DATE_NOT_BETWEEN with Double]
  
  /* 6 */ @js.native
  object DATE_ON_OR_AFTER extends TopLevel[DATE_ON_OR_AFTER with Double]
  
  /* 7 */ @js.native
  object DATE_ON_OR_BEFORE extends TopLevel[DATE_ON_OR_BEFORE with Double]
  
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
  
  /* 18 */ @js.native
  object TEXT_EQUAL_TO extends TopLevel[TEXT_EQUAL_TO with Double]
  
  /* 19 */ @js.native
  object TEXT_IS_VALID_EMAIL extends TopLevel[TEXT_IS_VALID_EMAIL with Double]
  
  /* 20 */ @js.native
  object TEXT_IS_VALID_URL extends TopLevel[TEXT_IS_VALID_URL with Double]
  
  /* 21 */ @js.native
  object VALUE_IN_LIST extends TopLevel[VALUE_IN_LIST with Double]
  
  /* 22 */ @js.native
  object VALUE_IN_RANGE extends TopLevel[VALUE_IN_RANGE with Double]
  
}

