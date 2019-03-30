package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTriggersResponse extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
}

object ListTriggersResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, trigger: js.Array[Trigger] = null): ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[ListTriggersResponse]
  }
}

