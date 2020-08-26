package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user's selection in the active presentation.
  *
  *     var selection = SlidesApp.getActivePresentation().getSelection();
  *     var currentPage = selection.getCurrentPage();
  *     var selectionType = selection.getSelectionType();
  *     }
  */
@js.native
trait Selection extends js.Object {
  def getCurrentPage(): Page = js.native
  def getPageElementRange(): PageElementRange = js.native
  def getPageRange(): PageRange = js.native
  def getSelectionType(): SelectionType = js.native
  def getTableCellRange(): TableCellRange = js.native
  def getTextRange(): TextRange = js.native
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
  @scala.inline
  implicit class SelectionOps[Self <: Selection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCurrentPage(value: () => Page): Self = this.set("getCurrentPage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPageElementRange(value: () => PageElementRange): Self = this.set("getPageElementRange", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPageRange(value: () => PageRange): Self = this.set("getPageRange", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectionType(value: () => SelectionType): Self = this.set("getSelectionType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTableCellRange(value: () => TableCellRange): Self = this.set("getTableCellRange", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTextRange(value: () => TextRange): Self = this.set("getTextRange", js.Any.fromFunction0(value))
  }
  
}

