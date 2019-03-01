package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellHoverEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the index of the hovered cell.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the end time of the clicked cell.
    */
  var endTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the object of the resource.
    */
  var resources: js.UndefOr[js.Any] = js.undefined
  /** Returns the start time of the clicked cell.
    */
  var startTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the target of the clicked cell.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CellHoverEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cellIndex: scala.Int | scala.Double = null,
    endTime: js.Any = null,
    model: Model = null,
    resources: js.Any = null,
    startTime: js.Any = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): CellHoverEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (model != null) __obj.updateDynamic("model")(model)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellHoverEventArgs]
  }
}

