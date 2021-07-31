package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataValidationCriteria extends StObject
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
object DataValidationCriteria extends StObject {
  
  @js.native
  sealed trait CHECKBOX
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait CUSTOM_FORMULA
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait DATE_AFTER
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait DATE_BEFORE
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait DATE_BETWEEN
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait DATE_EQUAL_TO
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait DATE_IS_VALID_DATE
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait DATE_NOT_BETWEEN
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait DATE_ON_OR_AFTER
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait DATE_ON_OR_BEFORE
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_BETWEEN
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_EQUAL_TO
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_GREATER_THAN_OR_EQUAL_TO
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_LESS_THAN_OR_EQUAL_TO
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_NOT_BETWEEN
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait NUMBER_NOT_EQUAL_TO
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait TEXT_CONTAINS
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait TEXT_DOES_NOT_CONTAIN
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait TEXT_EQUAL_TO
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait TEXT_IS_VALID_EMAIL
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait TEXT_IS_VALID_URL
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait VALUE_IN_LIST
    extends StObject
       with DataValidationCriteria
  
  @js.native
  sealed trait VALUE_IN_RANGE
    extends StObject
       with DataValidationCriteria
}
