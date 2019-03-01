package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValidation extends js.Object {
  def copy(): DataValidationBuilder
  def getAllowInvalid(): scala.Boolean
  def getCriteriaType(): DataValidationCriteria
  def getCriteriaValues(): js.Array[js.Object]
  def getHelpText(): java.lang.String
}

object DataValidation {
  @scala.inline
  def apply(
    copy: js.Function0[DataValidationBuilder],
    getAllowInvalid: js.Function0[scala.Boolean],
    getCriteriaType: js.Function0[DataValidationCriteria],
    getCriteriaValues: js.Function0[js.Array[js.Object]],
    getHelpText: js.Function0[java.lang.String]
  ): DataValidation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("getAllowInvalid")(getAllowInvalid)
    __obj.updateDynamic("getCriteriaType")(getCriteriaType)
    __obj.updateDynamic("getCriteriaValues")(getCriteriaValues)
    __obj.updateDynamic("getHelpText")(getHelpText)
    __obj.asInstanceOf[DataValidation]
  }
}

