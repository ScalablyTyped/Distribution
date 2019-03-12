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
    getGotoPage: () => PageBreakItem,
    getPageNavigationType: () => PageNavigationType,
    getValue: () => java.lang.String,
    isCorrectAnswer: () => scala.Boolean
  ): Choice = {
    val __obj = js.Dynamic.literal(getGotoPage = js.Any.fromFunction0(getGotoPage), getPageNavigationType = js.Any.fromFunction0(getPageNavigationType), getValue = js.Any.fromFunction0(getValue), isCorrectAnswer = js.Any.fromFunction0(isCorrectAnswer))
  
    __obj.asInstanceOf[Choice]
  }
}

