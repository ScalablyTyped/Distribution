package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  def getCurrentPage(): Page
  def getPageElementRange(): PageElementRange
  def getPageRange(): PageRange
  def getSelectionType(): SelectionType
  def getTableCellRange(): TableCellRange
  def getTextRange(): TextRange
}

object Selection {
  @scala.inline
  def apply(
    getCurrentPage: () => Page,
    getPageElementRange: () => PageElementRange,
    getPageRange: () => PageRange,
    getSelectionType: () => SelectionType,
    getTableCellRange: () => TableCellRange,
    getTextRange: () => TextRange
  ): Selection = {
    val __obj = js.Dynamic.literal(getCurrentPage = js.Any.fromFunction0(getCurrentPage), getPageElementRange = js.Any.fromFunction0(getPageElementRange), getPageRange = js.Any.fromFunction0(getPageRange), getSelectionType = js.Any.fromFunction0(getSelectionType), getTableCellRange = js.Any.fromFunction0(getTableCellRange), getTextRange = js.Any.fromFunction0(getTextRange))
  
    __obj.asInstanceOf[Selection]
  }
}

