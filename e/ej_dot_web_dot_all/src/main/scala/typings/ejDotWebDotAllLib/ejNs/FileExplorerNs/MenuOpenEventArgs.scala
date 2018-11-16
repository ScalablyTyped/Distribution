package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MenuOpenEventArgs extends js.Object {
  /** set to true when the event has to be canceled, else false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the name of ContextMenu items group.
               */
  var contextMenu: js.UndefOr[java.lang.String] = js.undefined
  /** returns the element of ContextMenu.
               */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the target element.
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

