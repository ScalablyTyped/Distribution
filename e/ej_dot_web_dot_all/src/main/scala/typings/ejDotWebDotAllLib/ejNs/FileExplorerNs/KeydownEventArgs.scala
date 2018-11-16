package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeydownEventArgs extends js.Object {
  /** returns altKey value.
               */
  var altKey: js.UndefOr[scala.Boolean] = js.undefined
  /** Set to true when the event has to be canceled, else false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns ctrlKey value.
               */
  var ctrlKey: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the downed key keyCode value
               */
  var keyCode: js.UndefOr[scala.Double] = js.undefined
  /** returns the FileExplorer model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the event object.
               */
  var originalArgs: js.UndefOr[js.Any] = js.undefined
  /** returns shiftKey value.
               */
  var shiftKey: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

