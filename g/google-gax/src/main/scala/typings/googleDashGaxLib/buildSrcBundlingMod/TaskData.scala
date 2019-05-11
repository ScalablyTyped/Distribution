package typings
package googleDashGaxLib.buildSrcBundlingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskData extends js.Object {
  var bytes: scala.Double
  var callback: TaskCallback
  var cancelled: js.UndefOr[scala.Boolean] = js.undefined
  var elements: js.Array[TaskElement]
}

object TaskData {
  @scala.inline
  def apply(
    bytes: scala.Double,
    callback: TaskCallback,
    elements: js.Array[TaskElement],
    cancelled: js.UndefOr[scala.Boolean] = js.undefined
  ): TaskData = {
    val __obj = js.Dynamic.literal(bytes = bytes, callback = callback, elements = elements)
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled)
    __obj.asInstanceOf[TaskData]
  }
}

