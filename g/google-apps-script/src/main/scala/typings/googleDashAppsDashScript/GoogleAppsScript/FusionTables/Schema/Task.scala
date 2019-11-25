package typings.googleDashAppsDashScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var progress: js.UndefOr[String] = js.undefined
  var started: js.UndefOr[Boolean] = js.undefined
  var taskId: js.UndefOr[String] = js.undefined
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
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (!js.isUndefined(started)) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

