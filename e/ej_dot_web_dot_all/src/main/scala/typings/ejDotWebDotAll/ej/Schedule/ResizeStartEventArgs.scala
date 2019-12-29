package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeStartEventArgs extends js.Object {
  /** Returns the object of the resized appointment.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the resize element value.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResizeStartEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    element: js.Any = null,
    model: Model = null,
    `type`: String = null
  ): ResizeStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeStartEventArgs]
  }
}

