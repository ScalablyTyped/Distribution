package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TasksNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskLinks extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object TaskLinks {
  @scala.inline
  def apply(description: String = null, link: String = null, `type`: String = null): TaskLinks = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (link != null) __obj.updateDynamic("link")(link)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TaskLinks]
  }
}

