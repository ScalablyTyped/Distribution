package typings.ejDotWebDotAll.ejNs.ComboBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
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
  /** Data object of the selected item.
    */
  var itemData: js.UndefOr[typings.ejDotWebDotAll.ejNs.ComboBoxNs.Model] = js.undefined
  /** Instance of the combobox model object.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.ComboBoxNs.Model] = js.undefined
  /** Text of the selected item.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Value of the combobox textbox.
    */
  var value: js.UndefOr[String | Double] = js.undefined
}

object SelectEventArgs {
  @scala.inline
  def apply(
    Item: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    e: js.Any = null,
    isInteracted: js.UndefOr[Boolean] = js.undefined,
    itemData: typings.ejDotWebDotAll.ejNs.ComboBoxNs.Model = null,
    model: typings.ejDotWebDotAll.ejNs.ComboBoxNs.Model = null,
    text: String = null,
    `type`: String = null,
    value: String | Double = null
  ): SelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (e != null) __obj.updateDynamic("e")(e)
    if (!js.isUndefined(isInteracted)) __obj.updateDynamic("isInteracted")(isInteracted)
    if (itemData != null) __obj.updateDynamic("itemData")(itemData)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectEventArgs]
  }
}

