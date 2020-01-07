package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the identifier, name, and type of a task in a table.
  */
@js.native
trait Schema$Task extends js.Object {
  /**
    * Type of the resource. This is always &quot;fusiontables#task&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An indication of task progress.
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
    * Type of background task. One of  DELETE_ROWS Deletes one or more rows
    * from the table. ADD_ROWS &quot;Adds one or more rows to a table. Includes
    * importing data into a new table and importing more rows into an existing
    * table. ADD_COLUMN Adds a new column to the table. CHANGE_TYPE Changes the
    * type of a column.
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

