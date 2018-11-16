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

