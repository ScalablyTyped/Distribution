package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A background task on a table, initiated for time- or resource-consuming
  * operations such as changing column types or deleting all rows.
  */
@js.native
trait Schema$Task extends js.Object {
  /**
    * Type of the resource. This is always &quot;fusiontables#task&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Task percentage completion.
    */
  var progress: js.UndefOr[String] = js.native
  /**
    * false while the table is busy with some other task. true if this
    * background task is currently running.
    */
  var started: js.UndefOr[Boolean] = js.native
  /**
    * Identifier for the task.
    */
  var taskId: js.UndefOr[String] = js.native
  /**
    * Type of background task.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Task {
  @scala.inline
  def apply(
    kind: String = null,
    progress: String = null,
    started: js.UndefOr[Boolean] = js.undefined,
    taskId: String = null,
    `type`: String = null
  ): Schema$Task = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (!js.isUndefined(started)) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Task]
  }
}

