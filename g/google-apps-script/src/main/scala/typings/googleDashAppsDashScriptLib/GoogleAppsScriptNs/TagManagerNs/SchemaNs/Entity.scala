package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  var changeStatus: js.UndefOr[java.lang.String] = js.undefined
  var folder: js.UndefOr[Folder] = js.undefined
  var tag: js.UndefOr[Tag] = js.undefined
  var trigger: js.UndefOr[Trigger] = js.undefined
  var variable: js.UndefOr[Variable] = js.undefined
}

object Entity {
  @scala.inline
  def apply(
    changeStatus: java.lang.String = null,
    folder: Folder = null,
    tag: Tag = null,
    trigger: Trigger = null,
    variable: Variable = null
  ): Entity = {
    val __obj = js.Dynamic.literal()
    if (changeStatus != null) __obj.updateDynamic("changeStatus")(changeStatus)
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[Entity]
  }
}

