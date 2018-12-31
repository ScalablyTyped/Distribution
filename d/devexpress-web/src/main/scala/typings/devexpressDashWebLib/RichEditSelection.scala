package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set of methods and properties to work with the document selection.
  */
@js.native
trait RichEditSelection extends js.Object {
  /**
    * Gets or sets a value specifying whether the current selection is collapsed (and represents the cursor position).
    * Value: true, if the selection is collapsed; otherwise, false.
    */
  var collapsed: scala.Boolean = js.native
  /**
    * Gets or sets an array of document intervals in the selection.
    * Value: An array of Interval objects.
    */
  var intervals: js.Array[Interval] = js.native
  /**
    * Gets whether a floating picture or text box is selected.
    * Value: true, if only a floating picture or text box is selected; otherwise, false.
    */
  var isFloatingObjectSelected: scala.Boolean = js.native
  /**
    * Gets whether only a picture is selected.
    * Value: true, if only the picture is selected; otherwise, false.
    */
  var isPictureSelected: scala.Boolean = js.native
  /**
    * Gets whether only a text box is selected.
    * Value: true, if only a text box or any its content is selected; otherwise, false.
    */
  var isTextBoxSelected: scala.Boolean = js.native
  /**
    * Gets the maximum position of a document interval in the selection.
    */
  def getIntervalMaxPosition(): scala.Double = js.native
  /**
    * Moves the cursor to the end of the document.
    */
  def goToDocumentEnd(): scala.Unit = js.native
  /**
    * Moves the cursor to the end of the document and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToDocumentEnd(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the start of the document.
    */
  def goToDocumentStart(): scala.Unit = js.native
  /**
    * Moves the cursor to the start of the document and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToDocumentStart(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the end of the line in which the cursor is located.
    */
  def goToLineEnd(): scala.Unit = js.native
  /**
    * Moves the cursor to the end of the line in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToLineEnd(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the start of the line in which the cursor is located.
    */
  def goToLineStart(): scala.Unit = js.native
  /**
    * Moves the cursor to the start of the line in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToLineStart(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the next character.
    */
  def goToNextCharacter(): scala.Unit = js.native
  /**
    * Moves the cursor to the next character and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextCharacter(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the next line.
    */
  def goToNextLine(): scala.Unit = js.native
  /**
    * Moves the cursor to the next line and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextLine(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the beginning of the next page.
    */
  def goToNextPage(): scala.Unit = js.native
  /**
    * Moves the cursor to the beginning of the next page and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextPage(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the next word.
    */
  def goToNextWord(): scala.Unit = js.native
  /**
    * Moves the cursor to the next word and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextWord(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the end of the paragraph in which the cursor is located.
    */
  def goToParagraphEnd(): scala.Unit = js.native
  /**
    * Moves the cursor to the end of the paragraph in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToParagraphEnd(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the start of the paragraph in which the cursor is located.
    */
  def goToParagraphStart(): scala.Unit = js.native
  /**
    * Moves the cursor to the start of the paragraph in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToParagraphStart(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the previous word.
    */
  def goToPrevWord(): scala.Unit = js.native
  /**
    * Moves the cursor to the previous word and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPrevWord(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the previous character.
    */
  def goToPreviousCharacter(): scala.Unit = js.native
  /**
    * Moves the cursor to the previous character and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPreviousCharacter(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the previous line.
    */
  def goToPreviousLine(): scala.Unit = js.native
  /**
    * Moves the cursor to the previous line and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPreviousLine(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the beginning of the previous page.
    */
  def goToPreviousPage(): scala.Unit = js.native
  /**
    * Moves the cursor to the beginning of the previous page and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPreviousPage(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the next page break mark.
    */
  def goToStartNextPageCommand(): scala.Unit = js.native
  /**
    * Moves the cursor to the next page break mark and extends the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToStartNextPageCommand(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the cursor to the previous page break mark.
    */
  def goToStartPrevPageCommand(): scala.Unit = js.native
  /**
    * Moves the cursor to the previous page break mark and extends the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToStartPrevPageCommand(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Selects the editor's entire content.
    */
  def selectAll(): scala.Unit = js.native
  /**
    * Selects the line in which the cursor is located.
    */
  def selectLine(): scala.Unit = js.native
  /**
    * Selects the line in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectLine(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Selects the paragraph in which the cursor is located.
    */
  def selectParagraph(): scala.Unit = js.native
  /**
    * Selects the entire table in which the cursor is located.
    */
  def selectTable(): scala.Unit = js.native
  /**
    * Selects the entire table in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectTable(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Selects the table cell in which the cursor is located.
    */
  def selectTableCell(): scala.Unit = js.native
  /**
    * Selects the table cell in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectTableCell(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Selects the table row in which the cursor is located.
    */
  def selectTableRow(): scala.Unit = js.native
  /**
    * Selects the table row in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectTableRow(extendSelection: scala.Boolean): scala.Unit = js.native
  /**
    * Makes the specified sub-document active.
    * @param id An integer value identifying the target sub-document by its id.
    */
  def setActiveSubDocumentById(id: scala.Double): scala.Unit = js.native
  /**
    * Creates a footer sub-document (if it was not created before) and sets the footer as the active sub-document. Moves the cursor to the footer's start position.
    * @param pageIndex An integer value specifying the active page's index.
    */
  def setFooterSubDocumentAsActiveByPageIndex(pageIndex: scala.Double): scala.Unit = js.native
  /**
    * Creates a header sub-document (if it was not created before) and sets the header as the active sub-document. Moves the cursor to the header's start position.
    * @param pageIndex An integer value specifying the active page's index.
    */
  def setHeaderSubDocumentAsActiveByPageIndex(pageIndex: scala.Double): scala.Unit = js.native
  /**
    * Makes the main sub-document active and moves the cursor to its beginning.
    */
  def setMainSubDocumentAsActive(): scala.Unit = js.native
  /**
    * Defines the selection to the specified interval.
    * @param interval An  value specifying the target interval.
    */
  def setSelection(interval: Interval): scala.Unit = js.native
  /**
    * Defines the selection as the specified intervals.
    * @param intervals An array of the Interval objects specifying the target intervals.
    */
  def setSelection(intervals: js.Array[Interval]): scala.Unit = js.native
  /**
    * Defines the selection as the specified position.
    * @param position An integer value specifying the position in the sub-document.
    */
  def setSelection(position: scala.Double): scala.Unit = js.native
  /**
    * Makes the selected text box active.
    */
  def setTextBoxSubDocumentAsActive(): scala.Unit = js.native
  /**
    * Makes the specified text box active.
    * @param position An integer value identifying the target text box by its anchor position.
    */
  def setTextBoxSubDocumentAsActive(position: scala.Double): scala.Unit = js.native
  /**
    * Makes the specified text box active.
    * @param textBoxInfo A FloatingTextBoxInfo object identifying the target text box.
    */
  def setTextBoxSubDocumentAsActive(textBoxInfo: FloatingTextBoxInfo): scala.Unit = js.native
}

