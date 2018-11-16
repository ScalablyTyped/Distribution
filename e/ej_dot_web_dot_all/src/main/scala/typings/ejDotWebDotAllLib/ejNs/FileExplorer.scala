package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.FileExplorer")
@js.native
class FileExplorer protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.FileExplorerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.FileExplorerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.FileExplorerNs.Model = js.native
  @JSName("model")
  var model_FileExplorer: ejDotWebDotAllLib.ejNs.FileExplorerNs.Model = js.native
  /** Refresh the size of FileExplorer control.
           * @returns {void}
           */
  def adjustSize(): scala.Unit = js.native
  /** Disable the particular context menu item.
           * @param {string|HTMLElement} Id of the menu item/ Menu element to be disabled
           * @returns {void}
           */
  def disableMenuItem(item: java.lang.String): scala.Unit = js.native
  /** Disable the particular context menu item.
           * @param {string|HTMLElement} Id of the menu item/ Menu element to be disabled
           * @returns {void}
           */
  def disableMenuItem(item: stdLib.HTMLElement): scala.Unit = js.native
  /** Disable the particular toolbar item.
           * @param {string|HTMLElement} Id of the toolbar item/ Tool item element to be disabled
           * @returns {void}
           */
  def disableToolbarItem(item: java.lang.String): scala.Unit = js.native
  /** Disable the particular toolbar item.
           * @param {string|HTMLElement} Id of the toolbar item/ Tool item element to be disabled
           * @returns {void}
           */
  def disableToolbarItem(item: stdLib.HTMLElement): scala.Unit = js.native
  /** Enable the particular context menu item.
           * @param {string|HTMLElement} Id of the menu item/ Menu element to be Enabled
           * @returns {void}
           */
  def enableMenuItem(item: java.lang.String): scala.Unit = js.native
  /** Enable the particular context menu item.
           * @param {string|HTMLElement} Id of the menu item/ Menu element to be Enabled
           * @returns {void}
           */
  def enableMenuItem(item: stdLib.HTMLElement): scala.Unit = js.native
  /** Enable the particular toolbar item
           * @param {string|HTMLElement} Id of the tool item/ Tool item element to be Enabled
           * @returns {void}
           */
  def enableToolbarItem(item: java.lang.String): scala.Unit = js.native
  /** Enable the particular toolbar item
           * @param {string|HTMLElement} Id of the tool item/ Tool item element to be Enabled
           * @returns {void}
           */
  def enableToolbarItem(item: stdLib.HTMLElement): scala.Unit = js.native
  /** Refresh the content of the selected folder in FileExplorer control.
           * @returns {void}
           */
  def refresh(): scala.Unit = js.native
  /** Remove the particular toolbar item.
           * @param {string|HTMLElement} Id of the tool item/ tool item element to be removed
           * @returns {void}
           */
  def removeToolbarItem(item: java.lang.String): scala.Unit = js.native
  /** Remove the particular toolbar item.
           * @param {string|HTMLElement} Id of the tool item/ tool item element to be removed
           * @returns {void}
           */
  def removeToolbarItem(item: stdLib.HTMLElement): scala.Unit = js.native
}

@JSGlobal("ej.FileExplorer")
@js.native
object FileExplorer extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.FileExplorer = js.native
}

