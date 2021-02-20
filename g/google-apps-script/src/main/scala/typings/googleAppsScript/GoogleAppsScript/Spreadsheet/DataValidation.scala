package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access data validation rules. To create a new rule, use SpreadsheetApp.newDataValidation() and DataValidationBuilder. You can use
  * Range.setDataValidation(rule) to set the validation rule for a range.
  *
  *     // Log information about the data validation rule for cell A1.
  *     var cell = SpreadsheetApp.getActive().getRange('A1');
  *     var rule = cell.getDataValidation();
  *     if (rule != null) {
  *       var criteria = rule.getCriteriaType();
  *       var args = rule.getCriteriaValues();
  *       Logger.log('The data validation rule is %s %s', criteria, args);
  *     } else {
  *       Logger.log('The cell does not have a data validation rule.')
  *     }
  */
@js.native
trait DataValidation extends StObject {
  
  def copy(): DataValidationBuilder = js.native
  
  def getAllowInvalid(): Boolean = js.native
  
  def getCriteriaType(): DataValidationCriteria = js.native
  
  def getCriteriaValues(): js.Array[_] = js.native
  
  def getHelpText(): String = js.native
}
object DataValidation {
  
  @scala.inline
  def apply(
    copy: () => DataValidationBuilder,
    getAllowInvalid: () => Boolean,
    getCriteriaType: () => DataValidationCriteria,
    getCriteriaValues: () => js.Array[_],
    getHelpText: () => String
  ): DataValidation = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAllowInvalid = js.Any.fromFunction0(getAllowInvalid), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getHelpText = js.Any.fromFunction0(getHelpText))
    __obj.asInstanceOf[DataValidation]
  }
  
  @scala.inline
  implicit class DataValidationMutableBuilder[Self <: DataValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => DataValidationBuilder): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowInvalid(value: () => Boolean): Self = StObject.set(x, "getAllowInvalid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCriteriaType(value: () => DataValidationCriteria): Self = StObject.set(x, "getCriteriaType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCriteriaValues(value: () => js.Array[_]): Self = StObject.set(x, "getCriteriaValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
  }
}
