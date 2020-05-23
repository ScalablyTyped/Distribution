package typings.ejWebAll.ej.GroupButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** Boolean value based on whether the selected button element is disabled or not.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Returns the selection button element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** Return the selected button element ID.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Selected button item index.
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

object SelectEventArgs {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    element: js.Any = null,
    event: js.Any = null,
    id: String = null,
    index: js.UndefOr[Double] = js.undefined,
    model: Model = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): SelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectEventArgs]
  }
}

