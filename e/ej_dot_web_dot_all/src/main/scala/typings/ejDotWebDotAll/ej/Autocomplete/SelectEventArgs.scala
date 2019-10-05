package typings.ejDotWebDotAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** Data object of the selected item.
    */
  var Item: js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.Model] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Key of the selected item.
    */
  var key: js.UndefOr[String] = js.undefined
  /** Instance of the autocomplete model object.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.Model] = js.undefined
  /** Text of the selected item.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Value of the autocomplete textbox.
    */
  var value: js.UndefOr[String] = js.undefined
}

object SelectEventArgs {
  @scala.inline
  def apply(
    Item: typings.ejDotWebDotAll.ej.Autocomplete.Model = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    model: typings.ejDotWebDotAll.ej.Autocomplete.Model = null,
    text: String = null,
    `type`: String = null,
    value: String = null
  ): SelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (key != null) __obj.updateDynamic("key")(key)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SelectEventArgs]
  }
}

