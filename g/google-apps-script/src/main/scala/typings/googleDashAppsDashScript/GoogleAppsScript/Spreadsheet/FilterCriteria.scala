package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  def copy(): FilterCriteriaBuilder
  def getCriteriaType(): BooleanCriteria
  def getCriteriaValues(): js.Array[_]
  def getHiddenValues(): js.Array[String]
  def getVisibleValues(): js.Array[String]
}

object FilterCriteria {
  @scala.inline
  def apply(
    copy: () => FilterCriteriaBuilder,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[_],
    getHiddenValues: () => js.Array[String],
    getVisibleValues: () => js.Array[String]
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getHiddenValues = js.Any.fromFunction0(getHiddenValues), getVisibleValues = js.Any.fromFunction0(getVisibleValues))
  
    __obj.asInstanceOf[FilterCriteria]
  }
}

