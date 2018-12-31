package typings
package ejDotWebDotAllLib.ejNs.DropDownListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selected item with checkbox checked or not.
    */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selected item ID.
    */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the DropDownList model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected item text.
    */
  var selectedText: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the selected text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the selected value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

