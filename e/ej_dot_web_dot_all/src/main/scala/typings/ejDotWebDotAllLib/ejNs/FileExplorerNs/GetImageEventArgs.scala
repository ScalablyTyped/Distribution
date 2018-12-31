package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageEventArgs extends js.Object {
  /** returns the action type, which specifies thumbnail preview or opening image.
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** loaded image element
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** original arguments of image load or error event
    */
  var originalArgs: js.UndefOr[js.Any] = js.undefined
  /** loaded image path.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

