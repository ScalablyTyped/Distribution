package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RTE")
@js.native
class RTE_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.RTE.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.RTE.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.RTE.Model = js.native
  @JSName("model")
  var model_RTE_ : typings.ejDotWebDotAll.ej.RTE.Model = js.native
  /** Returns the range object.
    * @returns {any}
    */
  def createRange(): js.Any = js.native
  /** Disables the RTE control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Disables the corresponding tool in the RTE ToolBar.
    * @returns {void}
    */
  def disableToolbarItem(): Unit = js.native
  /** Enables the RTE control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Enables the corresponding tool in the toolbar when the tool is disabled.
    * @returns {void}
    */
  def enableToolbarItem(): Unit = js.native
  /** Performs the action value based on the given command.
    * @param {string} Command Name.
    * @param {any} Content to be inserted as argument.
    * @param {boolean} Boolean value to specify whether the argument is textNode or not, this is optional.
    * @returns {void}
    */
  def executeCommand(cmdName: String, args: js.Any): Unit = js.native
  def executeCommand(cmdName: String, args: js.Any, textnodeType: Boolean): Unit = js.native
  /** Focuses the RTE control.
    * @returns {void}
    */
  def focus(): Unit = js.native
  /** Gets the command status of the selected text based on the given comment in the RTE control.
    * @returns {boolean}
    */
  def getCommandStatus(): Boolean = js.native
  /** Gets the Document from the RTE control.
    * @returns {Document}
    */
  def getDocument(): Document = js.native
  /** Gets the HTML string from the RTE control.
    * @returns {HTMLElement}
    */
  def getHtml(): HTMLElement = js.native
  /** Gets the selected HTML string from the RTE control.
    * @returns {HTMLElement}
    */
  def getSelectedHtml(): HTMLElement = js.native
  /** Gets the content as string from the RTE control.
    * @returns {string}
    */
  def getText(): String = js.native
  /** Hides the RTE control.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Add a table column at the right or left of the specified cell
    * @param {boolean} If itâ€™s true, add a column at the left of the cell, otherwise add a column at the right of the cell
    * @param {JQuery} Column will be added based on the given cell element
    * @returns {HTMLElement}
    */
  def insertColumn(): HTMLElement = js.native
  def insertColumn(before: Boolean): HTMLElement = js.native
  def insertColumn(before: Boolean, cell: JQuery): HTMLElement = js.native
  /** Inserts new item to the target contextmenu node.
    * @returns {void}
    */
  def insertMenuOption(): Unit = js.native
  /** To add a table row below or above the specified cell.
    * @param {boolean} If itâ€™s true, add a row before the cell, otherwise add a row after the cell
    * @param {JQuery} Row will be added based on the given cell element
    * @returns {HTMLElement}
    */
  def insertRow(): HTMLElement = js.native
  def insertRow(before: Boolean): HTMLElement = js.native
  def insertRow(before: Boolean, cell: JQuery): HTMLElement = js.native
  /** This method helps to insert/paste the content at the current cursor (caret) position or the selected content to be replaced with our text by passing the value as parameter to the
    * pasteContent method in the Editor.
    * @param {string} paste content
    * @returns {void}
    */
  def pasteContent(html: String): Unit = js.native
  /** Refreshes the RTE control.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** Removes the specified table column.
    * @param {JQuery} Remove the given column element
    * @returns {void}
    */
  def removeColumn(): Unit = js.native
  def removeColumn(cell: JQuery): Unit = js.native
  /** Removes the target menu item from the RTE contextmenu.
    * @returns {void}
    */
  def removeMenuOption(): Unit = js.native
  /** Removes the specified table row.
    * @param {JQuery} Remove the given row element
    * @returns {void}
    */
  def removeRow(): Unit = js.native
  def removeRow(cell: JQuery): Unit = js.native
  /** Deletes the specified table.
    * @param {JQuery} Remove the given table
    * @returns {void}
    */
  def removeTable(): Unit = js.native
  def removeTable(table: JQuery): Unit = js.native
  /** Removes the given tool from the RTE Toolbar.
    * @returns {void}
    */
  def removeToolbarItem(): Unit = js.native
  /** Selects all the contents within the RTE.
    * @returns {void}
    */
  def selectAll(): Unit = js.native
  /** Selects the contents in the given range.
    * @returns {void}
    */
  def selectRange(): Unit = js.native
  /** Sets the color picker model type rendered initially in the RTE control.
    * @returns {void}
    */
  def setColorPickerType(): Unit = js.native
  /** Sets the HTML string from the RTE control.
    * @returns {void}
    */
  def setHtml(): Unit = js.native
  /** Displays the RTE control.
    * @returns {void}
    */
  def show(): Unit = js.native
}

