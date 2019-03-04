package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice extends js.Object {
  def getGotoPage(): PageBreakItem
  def getPageNavigationType(): PageNavigationType
  def getValue(): java.lang.String
  def isCorrectAnswer(): scala.Boolean
}

object Choice {
  @scala.inline
  def apply(
    getGotoPage: js.Function0[PageBreakItem],
    getPageNavigationType: js.Function0[PageNavigationType],
    getValue: js.Function0[java.lang.String],
    isCorrectAnswer: js.Function0[scala.Boolean]
  ): Choice = {
    val __obj = js.Dynamic.literal(getGotoPage = getGotoPage, getPageNavigationType = getPageNavigationType, getValue = getValue, isCorrectAnswer = isCorrectAnswer)
  
    __obj.asInstanceOf[Choice]
  }
}

