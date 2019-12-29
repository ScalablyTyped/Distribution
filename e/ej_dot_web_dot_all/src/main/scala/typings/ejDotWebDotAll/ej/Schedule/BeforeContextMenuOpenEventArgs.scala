package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeContextMenuOpenEventArgs extends js.Object {
  /** Returns the current appointment details while opening the menu from appointment.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the current date value.
    */
  var currentDate: js.UndefOr[js.Any] = js.undefined
  /** Returns the object of before opening menu target.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the object of beforeContextMenuOpen event.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** Returns the current resource details, when multiple resources are present, otherwise returns null.
    */
  var resources: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeContextMenuOpenEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellIndex: Int | Double = null,
    currentDate: js.Any = null,
    events: js.Any = null,
    model: Model = null,
    `object`: js.Any = null,
    resources: js.Any = null,
    `type`: String = null
  ): BeforeContextMenuOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeContextMenuOpenEventArgs]
  }
}

