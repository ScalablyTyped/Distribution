package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskbarClickEventArgs extends js.Object {
  /** Returns currently clicked row data
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the current item index.
    */
  var index: js.UndefOr[Double] = js.undefined
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the clicked row element
    */
  var taskbarElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TaskbarClickEventArgs {
  @scala.inline
  def apply(
    data: js.Any = null,
    index: js.UndefOr[Double] = js.undefined,
    model: js.Any = null,
    target: js.Any = null,
    taskbarElement: js.Any = null,
    `type`: String = null
  ): TaskbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (taskbarElement != null) __obj.updateDynamic("taskbarElement")(taskbarElement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskbarClickEventArgs]
  }
}

