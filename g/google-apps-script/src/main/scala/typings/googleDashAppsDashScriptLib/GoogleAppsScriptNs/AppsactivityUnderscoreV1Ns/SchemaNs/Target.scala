package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Target {
  @scala.inline
  def apply(id: java.lang.String = null, mimeType: java.lang.String = null, name: java.lang.String = null): Target = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Target]
  }
}

