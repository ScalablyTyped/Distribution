package typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /** Type of the resource. This is always "fusiontables#task". */
  var kind: js.UndefOr[String] = js.undefined
  /** Task percentage completion. */
  var progress: js.UndefOr[String] = js.undefined
  /** false while the table is busy with some other task. true if this background task is currently running. */
  var started: js.UndefOr[Boolean] = js.undefined
  /** Identifier for the task. */
  var taskId: js.UndefOr[String] = js.undefined
  /** Type of background task. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Task {
  @scala.inline
  def apply(
    kind: String = null,
    progress: String = null,
    started: js.UndefOr[Boolean] = js.undefined,
    taskId: String = null,
    `type`: String = null
  ): Task = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (!js.isUndefined(started)) __obj.updateDynamic("started")(started)
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Task]
  }
}

