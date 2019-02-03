package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RTE")
@js.native
class RTE protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.RTENs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.RTENs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.RTENs.Model = js.native
  @JSName("model")
  var model_RTE: ejDotWebDotAllLib.ejNs.RTENs.Model = js.native
  /** Returns the range object.
    * @returns {any}
    */
  def createRange(): js.Any = js.native
  /** Disables the RTE control.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Disables the corresponding tool in the RTE ToolBar.
    * @returns {void}
    */
  def disableToolbarItem(): scala.Unit = js.native
  /** Enables the RTE control.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Enables the corresponding tool in the toolbar when the tool is disabled.
    * @returns {void}
    */
  def enableToolbarItem(): scala.Unit = js.native
  /** Performs the action value based on the given command.
    * @param {string} Command Name.
    * @param {any} Content to be inserted as argument.
    * @param {boolean} Boolean value to specify whether the argument is textNode or not, this is optional.
    * @returns {void}
    */
  def executeCommand(cmdName: java.lang.String, args: js.Any): scala.Unit = js.native
  def executeCommand(cmdName: java.lang.String, args: js.Any, textnodeType: scala.Boolean): scala.Unit = js.native
  /** Focuses the RTE control.
    * @returns {void}
    */
  def focus(): scala.Unit = js.native
  /** Gets the command status of the selected text based on the given comment in the RTE control.
    * @returns {boolean}
    */
  def getCommandStatus(): scala.Boolean = js.native
  /** Gets the Document from the RTE control.
    * @returns {Document}
    */
  def getDocument(): stdLib.Document = js.native
  /** Gets the HTML string from the RTE control.
    * @returns {HTMLElement}
    */
  def getHtml(): stdLib.HTMLElement = js.native
  /** Gets the selected HTML string from the RTE control.
    * @returns {HTMLElement}
    */
  def getSelectedHtml(): stdLib.HTMLElement = js.native
  /** Gets the content as string from the RTE control.
    * @returns {string}
    */
  def getText(): java.lang.String = js.native
  /** Hides the RTE control.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** Add a table column at the right or left of the specified cell
    * @param {boolean} If itâ€™s true, add a column at the left of the cell, otherwise add a column at the right of the cell
    * @param {JQuery} Column will be added based on the given cell element
    * @returns {HTMLElement}
    */
  def insertColumn(): stdLib.HTMLElement = js.native
  def insertColumn(before: scala.Boolean): stdLib.HTMLElement = js.native
  def insertColumn(before: scala.Boolean, cell: ejDotWebDotAllLib.JQuery): stdLib.HTMLElement = js.native
  /** Inserts new item to the target contextmenu node.
    * @returns {void}
    */
  def insertMenuOption(): scala.Unit = js.native
  /** To add a table row below or above the specified cell.
    * @param {boolean} If itâ€™s true, add a row before the cell, otherwise add a row after the cell
    * @param {JQuery} Row will be added based on the given cell element
    * @returns {HTMLElement}
    */
  def insertRow(): stdLib.HTMLElement = js.native
  def insertRow(before: scala.Boolean): stdLib.HTMLElement = js.native
  def insertRow(before: scala.Boolean, cell: ejDotWebDotAllLib.JQuery): stdLib.HTMLElement = js.native
  /** This method helps to insert/paste the content at the current cursor (caret) position or the selected content to be replaced with our text by passing the value as parameter to the
    * pasteContent method in the Editor.
    * @param {string} paste content
    * @returns {void}
    */
  def pasteContent(html: java.lang.String): scala.Unit = js.native
  /** Refreshes the RTE control.
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  /** Removes the specified table column.
    * @param {JQuery} Remove the given column element
    * @returns {void}
    */
  def removeColumn(): scala.Unit = js.native
  def removeColumn(cell: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
  /** Removes the target menu item from the RTE contextmenu.
    * @returns {void}
    */
  def removeMenuOption(): scala.Unit = js.native
  /** Removes the specified table row.
    * @param {JQuery} Remove the given row element
    * @returns {void}
    */
  def removeRow(): scala.Unit = js.native
  def removeRow(cell: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
  /** Deletes the specified table.
    * @param {JQuery} Remove the given table
    * @returns {void}
    */
  def removeTable(): scala.Unit = js.native
  def removeTable(table: ejDotWebDotAllLib.JQuery): scala.Unit = js.native
  /** Removes the given tool from the RTE Toolbar.
    * @returns {void}
    */
  def removeToolbarItem(): scala.Unit = js.native
  /** Selects all the contents within the RTE.
    * @returns {void}
    */
  def selectAll(): scala.Unit = js.native
  /** Selects the contents in the given range.
    * @returns {void}
    */
  def selectRange(): scala.Unit = js.native
  /** Sets the color picker model type rendered initially in the RTE control.
    * @returns {void}
    */
  def setColorPickerType(): scala.Unit = js.native
  /** Sets the HTML string from the RTE control.
    * @returns {void}
    */
  def setHtml(): scala.Unit = js.native
  /** Displays the RTE control.
    * @returns {void}
    */
  def show(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.RTE")
@js.native
object RTE extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.RTE = js.native
}

