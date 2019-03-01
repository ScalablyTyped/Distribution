package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeContextMenuOpenEventArgs extends js.Object {
  /** Returns the current appointment details while opening the menu from appointment.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current cell index value.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeContextMenuOpenEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cellIndex: scala.Int | scala.Double = null,
    currentDate: js.Any = null,
    events: js.Any = null,
    model: Model = null,
    `object`: js.Any = null,
    resources: js.Any = null,
    `type`: java.lang.String = null
  ): BeforeContextMenuOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate)
    if (events != null) __obj.updateDynamic("events")(events)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeContextMenuOpenEventArgs]
  }
}

