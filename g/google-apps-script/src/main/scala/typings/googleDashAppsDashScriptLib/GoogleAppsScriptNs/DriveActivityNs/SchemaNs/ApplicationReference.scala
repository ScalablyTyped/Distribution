package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationReference extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ApplicationReference {
  @scala.inline
  def apply(`type`: java.lang.String = null): ApplicationReference = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ApplicationReference]
  }
}

