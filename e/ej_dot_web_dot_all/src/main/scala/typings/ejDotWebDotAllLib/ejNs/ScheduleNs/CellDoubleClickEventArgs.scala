package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellDoubleClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the end time of the double clicked cell.
    */
  var endTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the object of the resource.
    */
  var resources: js.UndefOr[js.Any] = js.undefined
  /** Returns the start time of the double clicked cell.
    */
  var startTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the target of the double clicked cell.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CellDoubleClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    endTime: js.Any = null,
    model: Model = null,
    resources: js.Any = null,
    startTime: js.Any = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): CellDoubleClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (model != null) __obj.updateDynamic("model")(model)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellDoubleClickEventArgs]
  }
}

