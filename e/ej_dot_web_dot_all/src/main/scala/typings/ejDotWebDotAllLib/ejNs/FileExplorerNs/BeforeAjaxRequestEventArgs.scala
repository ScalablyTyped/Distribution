package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeAjaxRequestEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the AJAX request data
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

