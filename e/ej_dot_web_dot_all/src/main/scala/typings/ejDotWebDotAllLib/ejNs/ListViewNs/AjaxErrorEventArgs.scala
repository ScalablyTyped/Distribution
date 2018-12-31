package typings
package ejDotWebDotAllLib.ejNs.ListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxErrorEventArgs extends js.Object {
  /** returns true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the error thrown in the AJAX post.
    */
  var errorThrown: js.UndefOr[js.Any] = js.undefined
  /** returns the current item index.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** returns the current list item.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  /** returns the model value of the control.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the current item text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** returns the status.
    */
  var textStatus: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

