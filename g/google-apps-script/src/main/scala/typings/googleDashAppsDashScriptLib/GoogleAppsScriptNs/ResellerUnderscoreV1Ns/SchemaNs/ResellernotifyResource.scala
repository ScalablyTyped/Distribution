package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResellernotifyResource extends js.Object {
  var topicName: js.UndefOr[java.lang.String] = js.undefined
}

object ResellernotifyResource {
  @scala.inline
  def apply(topicName: java.lang.String = null): ResellernotifyResource = {
    val __obj = js.Dynamic.literal()
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    __obj.asInstanceOf[ResellernotifyResource]
  }
}

