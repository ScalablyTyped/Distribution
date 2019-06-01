package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValidation extends js.Object {
  def copy(): DataValidationBuilder
  def getAllowInvalid(): scala.Boolean
  def getCriteriaType(): DataValidationCriteria
  def getCriteriaValues(): js.Array[_]
  def getHelpText(): java.lang.String
}

object DataValidation {
  @scala.inline
  def apply(
    copy: () => DataValidationBuilder,
    getAllowInvalid: () => scala.Boolean,
    getCriteriaType: () => DataValidationCriteria,
    getCriteriaValues: () => js.Array[_],
    getHelpText: () => java.lang.String
  ): DataValidation = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAllowInvalid = js.Any.fromFunction0(getAllowInvalid), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getHelpText = js.Any.fromFunction0(getHelpText))
  
    __obj.asInstanceOf[DataValidation]
  }
}

