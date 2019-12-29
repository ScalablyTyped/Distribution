package typings.ejDotWebDotAll.ej.ListBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemDragStartEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** The Datasource of the listbox.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** List itemâ€™s index.
    */
  var index: js.UndefOr[Double] = js.undefined
  /** Boolean value based on whether the list item is checked or not.
    */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /** Boolean value based on whether the list item is enabled or not.
    */
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  /** Boolean value based on whether the list item is selected or not.
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /** Instance of the listbox model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** List itemâ€™s text (label).
    */
  var text: js.UndefOr[String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** List itemâ€™s value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ItemDragStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    index: Int | Double = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    text: String = null,
    `type`: String = null,
    value: String = null
  ): ItemDragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDragStartEventArgs]
  }
}

