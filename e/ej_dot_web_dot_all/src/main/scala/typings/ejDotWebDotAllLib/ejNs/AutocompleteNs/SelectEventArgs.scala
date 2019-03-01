package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** Data object of the selected item.
    */
  var Item: js.UndefOr[Model] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Key of the selected item.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Instance of the autocomplete model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Text of the selected item.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the autocomplete textbox.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object SelectEventArgs {
  @scala.inline
  def apply(
    Item: Model = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    model: Model = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
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

