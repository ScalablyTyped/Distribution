package typings
package ejDotWebDotAllLib.ejNs.ComboBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** Li element of the selected item.
    */
  var Item: js.UndefOr[js.Any] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Event argument.
    */
  var e: js.UndefOr[js.Any] = js.undefined
  /** value of the interaction
    */
  var isInteracted: js.UndefOr[scala.Boolean] = js.undefined
  /** Instance of the combobox model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the combobox textbox.
    */
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(
    Item: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    e: js.Any = null,
    isInteracted: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    `type`: java.lang.String = null,
    value: java.lang.String | scala.Double = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (e != null) __obj.updateDynamic("e")(e)
    if (!js.isUndefined(isInteracted)) __obj.updateDynamic("isInteracted")(isInteracted)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

