package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  def copy(): FilterCriteriaBuilder
  def getCriteriaType(): BooleanCriteria
  def getCriteriaValues(): js.Array[js.Object]
  def getHiddenValues(): js.Array[java.lang.String]
  def getVisibleValues(): js.Array[java.lang.String]
}

object FilterCriteria {
  @scala.inline
  def apply(
    copy: js.Function0[FilterCriteriaBuilder],
    getCriteriaType: js.Function0[BooleanCriteria],
    getCriteriaValues: js.Function0[js.Array[js.Object]],
    getHiddenValues: js.Function0[js.Array[java.lang.String]],
    getVisibleValues: js.Function0[js.Array[java.lang.String]]
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(copy = copy, getCriteriaType = getCriteriaType, getCriteriaValues = getCriteriaValues, getHiddenValues = getHiddenValues, getVisibleValues = getVisibleValues)
  
    __obj.asInstanceOf[FilterCriteria]
  }
}

