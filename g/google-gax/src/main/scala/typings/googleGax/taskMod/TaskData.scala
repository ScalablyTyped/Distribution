package typings.googleGax.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskData extends js.Object {
  var bytes: Double
  var callback: TaskCallback
  var cancelled: js.UndefOr[Boolean] = js.undefined
  var elements: js.Array[TaskElement]
}

object TaskData {
  @scala.inline
  def apply(
    bytes: Double,
    callback: TaskCallback,
    elements: js.Array[TaskElement],
    cancelled: js.UndefOr[Boolean] = js.undefined
  ): TaskData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskData]
  }
}

