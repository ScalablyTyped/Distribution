package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  def copy(): FilterCriteriaBuilder
  def getCriteriaType(): BooleanCriteria
  def getCriteriaValues(): js.Array[_]
  def getHiddenValues(): js.Array[java.lang.String]
  def getVisibleValues(): js.Array[java.lang.String]
}

object FilterCriteria {
  @scala.inline
  def apply(
    copy: () => FilterCriteriaBuilder,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[_],
    getHiddenValues: () => js.Array[java.lang.String],
    getVisibleValues: () => js.Array[java.lang.String]
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getHiddenValues = js.Any.fromFunction0(getHiddenValues), getVisibleValues = js.Any.fromFunction0(getVisibleValues))
  
    __obj.asInstanceOf[FilterCriteria]
  }
}

