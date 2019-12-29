package typings.ejDotWebDotAll.ej.GroupButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPressEventArgs extends js.Object {
  /** Boolean value based on whether the button element is disabled or not.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Returns the selection button element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** Return the button element ID.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Button item index.
    */
  var index: js.UndefOr[Double] = js.undefined
  /** returns the button model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Boolean value based on whether the button element is selected or not.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** return the button state
    */
  var status: js.UndefOr[Boolean] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object KeyPressEventArgs {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    element: js.Any = null,
    event: js.Any = null,
    id: String = null,
    index: Int | Double = null,
    model: Model = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): KeyPressEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPressEventArgs]
  }
}

