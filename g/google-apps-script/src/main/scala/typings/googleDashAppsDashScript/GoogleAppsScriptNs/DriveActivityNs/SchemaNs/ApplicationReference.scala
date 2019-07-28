package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationReference extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object ApplicationReference {
  @scala.inline
  def apply(`type`: String = null): ApplicationReference = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ApplicationReference]
  }
}

