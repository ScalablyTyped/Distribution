package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.FileExplorer")
@js.native
class FileExplorer_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.FileExplorer.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.FileExplorer.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.FileExplorer.Model = js.native
  @JSName("model")
  var model_FileExplorer_ : typings.ejDotWebDotAll.ej.FileExplorer.Model = js.native
  /** Refresh the size of FileExplorer control.
    * @returns {void}
    */
  def adjustSize(): Unit = js.native
  /** Disable the particular context menu item.
    * @param {string|HTMLElement} Id of the menu item/ Menu element to be disabled
    * @returns {void}
    */
  def disableMenuItem(item: String): Unit = js.native
  def disableMenuItem(item: HTMLElement): Unit = js.native
  /** Disable the particular toolbar item.
    * @param {string|HTMLElement} Id of the toolbar item/ Tool item element to be disabled
    * @returns {void}
    */
  def disableToolbarItem(item: String): Unit = js.native
  def disableToolbarItem(item: HTMLElement): Unit = js.native
  /** Enable the particular context menu item.
    * @param {string|HTMLElement} Id of the menu item/ Menu element to be Enabled
    * @returns {void}
    */
  def enableMenuItem(item: String): Unit = js.native
  def enableMenuItem(item: HTMLElement): Unit = js.native
  /** Enable the particular toolbar item
    * @param {string|HTMLElement} Id of the tool item/ Tool item element to be Enabled
    * @returns {void}
    */
  def enableToolbarItem(item: String): Unit = js.native
  def enableToolbarItem(item: HTMLElement): Unit = js.native
  /** Refresh the content of the selected folder in FileExplorer control.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** Remove the particular toolbar item.
    * @param {string|HTMLElement} Id of the tool item/ tool item element to be removed
    * @returns {void}
    */
  def removeToolbarItem(item: String): Unit = js.native
  def removeToolbarItem(item: HTMLElement): Unit = js.native
}

