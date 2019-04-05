package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskLinks extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TaskLinks {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    link: java.lang.String = null,
    `type`: java.lang.String = null
  ): TaskLinks = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (link != null) __obj.updateDynamic("link")(link)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TaskLinks]
  }
}

