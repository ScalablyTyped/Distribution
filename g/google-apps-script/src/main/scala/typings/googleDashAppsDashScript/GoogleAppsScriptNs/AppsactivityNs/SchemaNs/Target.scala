package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AppsactivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Target {
  @scala.inline
  def apply(id: String = null, mimeType: String = null, name: String = null): Target = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Target]
  }
}

