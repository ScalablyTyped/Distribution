package typings
package ejDotWebDotAllLib.ejNs.ListBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnselectEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** The Datasource of the listbox.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** List itemâ€™s index.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Boolean value based on whether the list item is checked or not.
    */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** Boolean value based on the list item is enabled or not.
    */
  var isEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Boolean value based on whether the list item is selected or not.
    */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  /** List item object.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  /** Instance of the listbox model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** List itemâ€™s text (label).
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** List itemâ€™s value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

