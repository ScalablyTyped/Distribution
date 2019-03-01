package typings
package ejDotWebDotAllLib.ejNs.ListBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemDragEventArgs extends js.Object {
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
  /** Boolean value based on whether the list item is enabled or not.
    */
  var isEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Boolean value based on whether the list item is selected or not.
    */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
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

object ItemDragEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    index: scala.Int | scala.Double = null,
    isChecked: js.UndefOr[scala.Boolean] = js.undefined,
    isEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): ItemDragEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked)
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ItemDragEventArgs]
  }
}

