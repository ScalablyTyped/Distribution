package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PasteEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the FileExplorer model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of moved/copied file or folder.
               */
  var name: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** returns the selected item details.
               */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the target folder item details.
               */
  var targetFolder: js.UndefOr[js.Any] = js.undefined
  /** returns the target path.
               */
  var targetPath: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

