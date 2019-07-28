package typings.devexpressDashWeb

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
  var collapsed: Boolean = js.native
  /**
    * Gets or sets an array of document intervals in the selection.
    * Value: An array of Interval objects.
    */
  var intervals: js.Array[Interval] = js.native
  /**
    * Gets whether a floating picture or text box is selected.
    * Value: true, if only a floating picture or text box is selected; otherwise, false.
    */
  var isFloatingObjectSelected: Boolean = js.native
  /**
    * Gets whether only a picture is selected.
    * Value: true, if only the picture is selected; otherwise, false.
    */
  var isPictureSelected: Boolean = js.native
  /**
    * Gets whether only a text box is selected.
    * Value: true, if only a text box or any its content is selected; otherwise, false.
    */
  var isTextBoxSelected: Boolean = js.native
  /**
    * Gets the maximum position of a document interval in the selection.
    */
  def getIntervalMaxPosition(): Double = js.native
  /**
    * Moves the cursor to the end of the document.
    */
  def goToDocumentEnd(): Unit = js.native
  /**
    * Moves the cursor to the end of the document and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToDocumentEnd(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the start of the document.
    */
  def goToDocumentStart(): Unit = js.native
  /**
    * Moves the cursor to the start of the document and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToDocumentStart(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the end of the line in which the cursor is located.
    */
  def goToLineEnd(): Unit = js.native
  /**
    * Moves the cursor to the end of the line in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToLineEnd(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the start of the line in which the cursor is located.
    */
  def goToLineStart(): Unit = js.native
  /**
    * Moves the cursor to the start of the line in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToLineStart(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the next character.
    */
  def goToNextCharacter(): Unit = js.native
  /**
    * Moves the cursor to the next character and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextCharacter(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the next line.
    */
  def goToNextLine(): Unit = js.native
  /**
    * Moves the cursor to the next line and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextLine(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the beginning of the next page.
    */
  def goToNextPage(): Unit = js.native
  /**
    * Moves the cursor to the beginning of the next page and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextPage(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the next word.
    */
  def goToNextWord(): Unit = js.native
  /**
    * Moves the cursor to the next word and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextWord(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the end of the paragraph in which the cursor is located.
    */
  def goToParagraphEnd(): Unit = js.native
  /**
    * Moves the cursor to the end of the paragraph in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToParagraphEnd(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the start of the paragraph in which the cursor is located.
    */
  def goToParagraphStart(): Unit = js.native
  /**
    * Moves the cursor to the start of the paragraph in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToParagraphStart(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the previous word.
    */
  def goToPrevWord(): Unit = js.native
  /**
    * Moves the cursor to the previous word and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPrevWord(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the previous character.
    */
  def goToPreviousCharacter(): Unit = js.native
  /**
    * Moves the cursor to the previous character and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPreviousCharacter(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the previous line.
    */
  def goToPreviousLine(): Unit = js.native
  /**
    * Moves the cursor to the previous line and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPreviousLine(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the beginning of the previous page.
    */
  def goToPreviousPage(): Unit = js.native
  /**
    * Moves the cursor to the beginning of the previous page and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPreviousPage(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the next page break mark.
    */
  def goToStartNextPageCommand(): Unit = js.native
  /**
    * Moves the cursor to the next page break mark and extends the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToStartNextPageCommand(extendSelection: Boolean): Unit = js.native
  /**
    * Moves the cursor to the previous page break mark.
    */
  def goToStartPrevPageCommand(): Unit = js.native
  /**
    * Moves the cursor to the previous page break mark and extends the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToStartPrevPageCommand(extendSelection: Boolean): Unit = js.native
  /**
    * Selects the editor's entire content.
    */
  def selectAll(): Unit = js.native
  /**
    * Selects the line in which the cursor is located.
    */
  def selectLine(): Unit = js.native
  /**
    * Selects the line in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectLine(extendSelection: Boolean): Unit = js.native
  /**
    * Selects the paragraph in which the cursor is located.
    */
  def selectParagraph(): Unit = js.native
  /**
    * Selects the entire table in which the cursor is located.
    */
  def selectTable(): Unit = js.native
  /**
    * Selects the entire table in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectTable(extendSelection: Boolean): Unit = js.native
  /**
    * Selects the table cell in which the cursor is located.
    */
  def selectTableCell(): Unit = js.native
  /**
    * Selects the table cell in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectTableCell(extendSelection: Boolean): Unit = js.native
  /**
    * Selects the table row in which the cursor is located.
    */
  def selectTableRow(): Unit = js.native
  /**
    * Selects the table row in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectTableRow(extendSelection: Boolean): Unit = js.native
  /**
    * Makes the specified sub-document active.
    * @param id An integer value identifying the target sub-document by its id.
    */
  def setActiveSubDocumentById(id: Double): Unit = js.native
  /**
    * Creates a footer sub-document (if it was not created before) and sets the footer as the active sub-document. Moves the cursor to the footer's start position.
    * @param pageIndex An integer value specifying the active page's index.
    */
  def setFooterSubDocumentAsActiveByPageIndex(pageIndex: Double): Unit = js.native
  /**
    * Creates a header sub-document (if it was not created before) and sets the header as the active sub-document. Moves the cursor to the header's start position.
    * @param pageIndex An integer value specifying the active page's index.
    */
  def setHeaderSubDocumentAsActiveByPageIndex(pageIndex: Double): Unit = js.native
  /**
    * Makes the main sub-document active and moves the cursor to its beginning.
    */
  def setMainSubDocumentAsActive(): Unit = js.native
  /**
    * Defines the selection as the specified intervals.
    * @param intervals An array of the Interval objects specifying the target intervals.
    */
  def setSelection(intervals: js.Array[Interval]): Unit = js.native
  /**
    * Defines the selection to the specified interval.
    * @param interval An  value specifying the target interval.
    */
  def setSelection(interval: Interval): Unit = js.native
  /**
    * Defines the selection as the specified position.
    * @param position An integer value specifying the position in the sub-document.
    */
  def setSelection(position: Double): Unit = js.native
  /**
    * Makes the selected text box active.
    */
  def setTextBoxSubDocumentAsActive(): Unit = js.native
  /**
    * Makes the specified text box active.
    * @param position An integer value identifying the target text box by its anchor position.
    */
  def setTextBoxSubDocumentAsActive(position: Double): Unit = js.native
  /**
    * Makes the specified text box active.
    * @param textBoxInfo A FloatingTextBoxInfo object identifying the target text box.
    */
  def setTextBoxSubDocumentAsActive(textBoxInfo: FloatingTextBoxInfo): Unit = js.native
}

