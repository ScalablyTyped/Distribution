package typings
package ejDotWebDotAllLib.ejNs.DropDownTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckChangeEventArgs extends js.Object {
  /** If the event has to be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selected item with checkbox checked or not.
    */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** Selected item's ID.
    */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** DropDownTreeView model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Selected item's text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Event name
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Selected item's value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

