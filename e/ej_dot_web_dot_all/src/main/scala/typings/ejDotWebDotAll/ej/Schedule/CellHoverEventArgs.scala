package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellHoverEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the index of the hovered cell.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the end time of the clicked cell.
    */
  var endTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Schedule.Model] = js.undefined
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
  var `type`: js.UndefOr[String] = js.undefined
}

object CellHoverEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellIndex: Int | Double = null,
    endTime: js.Any = null,
    model: typings.ejDotWebDotAll.ej.Schedule.Model = null,
    resources: js.Any = null,
    startTime: js.Any = null,
    target: js.Any = null,
    `type`: String = null
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

