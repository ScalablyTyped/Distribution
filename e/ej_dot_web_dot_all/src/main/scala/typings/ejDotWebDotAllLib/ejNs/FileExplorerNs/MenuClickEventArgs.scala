package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuClickEventArgs extends js.Object {
  /** returns the ID of clicked ContextMenu item.
    */
  var ID: js.UndefOr[java.lang.String] = js.undefined
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the name of ContextMenu items group.
    */
  var contextMenu: js.UndefOr[java.lang.String] = js.undefined
  /** returns the element of clicked ContextMenu item.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the event of ContextMenu.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the parent element ID of clicked ContextMenu item.
    */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the parent element text of clicked ContextMenu item.
    */
  var parentText: js.UndefOr[java.lang.String] = js.undefined
  /** returns the text of clicked ContextMenu item.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

