package typings
package ejDotWebDotAllLib.ejNs.GroupButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** Boolean value based on whether the selected button element is disabled or not.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selection button element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** Return the selected button element ID.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Selected button item index.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** returns the button model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Boolean value based on whether the button element is selected or not.
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** return the button state
    */
  var status: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SelectEventArgs {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    element: js.Any = null,
    event: js.Any = null,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    model: Model = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    status: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): SelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (element != null) __obj.updateDynamic("element")(element)
    if (event != null) __obj.updateDynamic("event")(event)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SelectEventArgs]
  }
}

