package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskbarClickEventArgs extends js.Object {
  /** Returns currently clicked row data
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the current item index.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TaskbarClickEventArgs {
  @scala.inline
  def apply(
    data: js.Any = null,
    index: scala.Int | scala.Double = null,
    model: js.Any = null,
    target: js.Any = null,
    taskbarElement: js.Any = null,
    `type`: java.lang.String = null
  ): TaskbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (taskbarElement != null) __obj.updateDynamic("taskbarElement")(taskbarElement)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TaskbarClickEventArgs]
  }
}

