package typings.ejDotWebDotAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** Li element of the selected item.
    */
  var Item: js.UndefOr[js.Any] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Event argument.
    */
  var e: js.UndefOr[js.Any] = js.undefined
  /** value of the interaction
    */
  var isInteracted: js.UndefOr[Boolean] = js.undefined
  /** Instance of the combobox model object.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.ComboBox.Model] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Value of the combobox textbox.
    */
  var value: js.UndefOr[String | Double] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(
    Item: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    e: js.Any = null,
    isInteracted: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.ComboBox.Model = null,
    `type`: String = null,
    value: String | Double = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteracted)) __obj.updateDynamic("isInteracted")(isInteracted.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

