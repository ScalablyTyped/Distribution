package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopSettings extends js.Object {
  var accessWindow: js.UndefOr[java.lang.String] = js.undefined
  var disposition: js.UndefOr[java.lang.String] = js.undefined
}

object PopSettings {
  @scala.inline
  def apply(accessWindow: java.lang.String = null, disposition: java.lang.String = null): PopSettings = {
    val __obj = js.Dynamic.literal()
    if (accessWindow != null) __obj.updateDynamic("accessWindow")(accessWindow)
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    __obj.asInstanceOf[PopSettings]
  }
}

