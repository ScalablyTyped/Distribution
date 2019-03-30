package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupContentDetails extends js.Object {
  var itemCount: js.UndefOr[java.lang.String] = js.undefined
  var itemType: js.UndefOr[java.lang.String] = js.undefined
}

object GroupContentDetails {
  @scala.inline
  def apply(itemCount: java.lang.String = null, itemType: java.lang.String = null): GroupContentDetails = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    __obj.asInstanceOf[GroupContentDetails]
  }
}

