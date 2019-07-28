package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DocumentEditor")
@js.native
class DocumentEditor protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.DocumentEditorNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.DocumentEditorNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.DocumentEditorNs.Model = js.native
  @JSName("model")
  var model_DocumentEditor: typings.ejDotWebDotAll.ejNs.DocumentEditorNs.Model = js.native
  /** Finds the first occurrence of specified text from current selection and  highlights the result. If the document end is reached, find operation will occur from the document start
    * position.
    * @param {string} Specifies the text to search in a document.
    * @returns {void}
    */
  def find(text: String): Unit = js.native
  /** Gets the page number of current selection in the document.
    * @returns {number}
    */
  def getCurrentPageNumber(): Double = js.native
  /** Gets the total number of pages in the document.
    * @returns {number}
    */
  def getPageCount(): Double = js.native
  /** Gets the text of current selection in the document.
    * @returns {string}
    */
  def getSelectedText(): String = js.native
  /** Gets the current zoom factor value of the document editor.
    * @returns {number}
    */
  def getZoomFactor(): Double = js.native
  /** Loads the document from specified path using web API provided by importUrl.
    * @param {string} Specifies the file path.
    * @returns {void}
    */
  def load(path: String): Unit = js.native
  /** Prints the document content as page by page.
    * @returns {void}
    */
  def print(): Unit = js.native
  /** Scales the document editor with the specified zoom factor. The range of zoom factor should be 0.10 to 5.00 (10 - 500 %).
    * @param {number} Specifies the factor for zooming.
    * @returns {void}
    */
  def setZoomFactor(factor: Double): Unit = js.native
}

/* static members */
@JSGlobal("ej.DocumentEditor")
@js.native
object DocumentEditor extends js.Object {
  var Locale: js.Any = js.native
  var fn: DocumentEditor = js.native
}

