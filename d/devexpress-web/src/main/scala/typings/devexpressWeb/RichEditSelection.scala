package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a set of methods and properties to work with the document selection.
  */
@js.native
trait RichEditSelection extends StObject {
  
  /**
    * Gets or sets a value specifying whether the current selection is collapsed (and represents the cursor position).
    */
  var collapsed: Boolean = js.native
  
  /**
    * Gets the maximum position of a document interval in the selection.
    */
  def getIntervalMaxPosition(): Double = js.native
  
  /**
    * Moves the cursor to the end of the document and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToDocumentEnd(): Unit = js.native
  def goToDocumentEnd(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the start of the document and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToDocumentStart(): Unit = js.native
  def goToDocumentStart(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the end of the line in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToLineEnd(): Unit = js.native
  def goToLineEnd(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the start of the line in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToLineStart(): Unit = js.native
  def goToLineStart(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the next character and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextCharacter(): Unit = js.native
  def goToNextCharacter(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the next line and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextLine(): Unit = js.native
  def goToNextLine(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the beginning of the next page and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextPage(): Unit = js.native
  def goToNextPage(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the next word and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToNextWord(): Unit = js.native
  def goToNextWord(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the end of the paragraph in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToParagraphEnd(): Unit = js.native
  def goToParagraphEnd(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the start of the paragraph in which the cursor is located and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToParagraphStart(): Unit = js.native
  def goToParagraphStart(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the previous word and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPrevWord(): Unit = js.native
  def goToPrevWord(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the previous character and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPreviousCharacter(): Unit = js.native
  def goToPreviousCharacter(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the previous line and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPreviousLine(): Unit = js.native
  def goToPreviousLine(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the beginning of the previous page and allows you to extend the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToPreviousPage(): Unit = js.native
  def goToPreviousPage(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the next page break mark and extends the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToStartNextPageCommand(): Unit = js.native
  def goToStartNextPageCommand(extendSelection: Boolean): Unit = js.native
  
  /**
    * Moves the cursor to the previous page break mark and extends the selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def goToStartPrevPageCommand(): Unit = js.native
  def goToStartPrevPageCommand(extendSelection: Boolean): Unit = js.native
  
  /**
    * Gets or sets an array of document intervals in the selection.
    */
  var intervals: js.Array[Interval] = js.native
  
  /**
    * Gets whether a floating picture or text box is selected.
    */
  val isFloatingObjectSelected: Boolean = js.native
  
  /**
    * Gets whether only a picture is selected.
    */
  val isPictureSelected: Boolean = js.native
  
  /**
    * Gets whether only a text box is selected.
    */
  val isTextBoxSelected: Boolean = js.native
  
  /**
    * Selects the editor's entire content.
    */
  def selectAll(): Unit = js.native
  
  /**
    * Selects the line in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectLine(): Unit = js.native
  def selectLine(extendSelection: Boolean): Unit = js.native
  
  /**
    * Selects the paragraph in which the cursor is located.
    */
  def selectParagraph(): Unit = js.native
  
  /**
    * Selects the entire table in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectTable(): Unit = js.native
  def selectTable(extendSelection: Boolean): Unit = js.native
  
  /**
    * Selects the table cell in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectTableCell(): Unit = js.native
  def selectTableCell(extendSelection: Boolean): Unit = js.native
  
  /**
    * Selects the table row in which the cursor is located and allows you to extend the entire selection with the currently existing selection.
    * @param extendSelection true to extend the selection; otherwise, false.
    */
  def selectTableRow(): Unit = js.native
  def selectTableRow(extendSelection: Boolean): Unit = js.native
  
  /**
    * Makes the specified sub-document active. true if the sub-document is made active; false if the sub-document with the specified id is not found.
    * @param id An integer value identifying the target sub-document by its id.
    */
  def setActiveSubDocumentById(id: Double): Boolean = js.native
  
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
  
  def setSelection(arg: js.Array[Interval]): Unit = js.native
  /**
    * Selects the specified interval(s).
    * @param arg The interval(s) or position to select.
    */
  def setSelection(arg: Double): Unit = js.native
  def setSelection(arg: Interval): Unit = js.native
  
  /**
    * Makes the specified text box active.
    * @param arg An integer value that identifies the target text box by its id, or an object that contains the text box settings.
    */
  def setTextBoxSubDocumentAsActive(arg: Double): Unit = js.native
  def setTextBoxSubDocumentAsActive(arg: FloatingTextBoxInfo): Unit = js.native
}
