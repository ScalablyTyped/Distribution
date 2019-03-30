package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rename extends js.Object {
  var newTitle: js.UndefOr[java.lang.String] = js.undefined
  var oldTitle: js.UndefOr[java.lang.String] = js.undefined
}

object Rename {
  @scala.inline
  def apply(newTitle: java.lang.String = null, oldTitle: java.lang.String = null): Rename = {
    val __obj = js.Dynamic.literal()
    if (newTitle != null) __obj.updateDynamic("newTitle")(newTitle)
    if (oldTitle != null) __obj.updateDynamic("oldTitle")(oldTitle)
    __obj.asInstanceOf[Rename]
  }
}

