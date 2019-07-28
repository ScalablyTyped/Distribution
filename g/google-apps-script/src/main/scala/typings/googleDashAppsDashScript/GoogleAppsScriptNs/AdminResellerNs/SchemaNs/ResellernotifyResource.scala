package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResellernotifyResource extends js.Object {
  var topicName: js.UndefOr[String] = js.undefined
}

object ResellernotifyResource {
  @scala.inline
  def apply(topicName: String = null): ResellernotifyResource = {
    val __obj = js.Dynamic.literal()
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    __obj.asInstanceOf[ResellernotifyResource]
  }
}

