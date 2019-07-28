package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rename extends js.Object {
  var newTitle: js.UndefOr[String] = js.undefined
  var oldTitle: js.UndefOr[String] = js.undefined
}

object Rename {
  @scala.inline
  def apply(newTitle: String = null, oldTitle: String = null): Rename = {
    val __obj = js.Dynamic.literal()
    if (newTitle != null) __obj.updateDynamic("newTitle")(newTitle)
    if (oldTitle != null) __obj.updateDynamic("oldTitle")(oldTitle)
    __obj.asInstanceOf[Rename]
  }
}

