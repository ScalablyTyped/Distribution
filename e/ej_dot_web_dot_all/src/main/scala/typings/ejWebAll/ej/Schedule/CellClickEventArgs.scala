package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the index of the cell.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the end time of the clicked cell.
    */
  var endTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns day, date and time information.
    */
  var quickString: js.UndefOr[String] = js.undefined
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

object CellClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellIndex: js.UndefOr[Double] = js.undefined,
    endTime: js.Any = null,
    model: Model = null,
    quickString: String = null,
    resources: js.Any = null,
    startTime: js.Any = null,
    target: js.Any = null,
    `type`: String = null
  ): CellClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellIndex)) __obj.updateDynamic("cellIndex")(cellIndex.get.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (quickString != null) __obj.updateDynamic("quickString")(quickString.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellClickEventArgs]
  }
}

