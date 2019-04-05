package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusProducts extends js.Object {
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var itemLevelIssues: js.UndefOr[js.Array[AccountStatusItemLevelIssue]] = js.undefined
  var statistics: js.UndefOr[AccountStatusStatistics] = js.undefined
}

object AccountStatusProducts {
  @scala.inline
  def apply(
    channel: java.lang.String = null,
    country: java.lang.String = null,
    destination: java.lang.String = null,
    itemLevelIssues: js.Array[AccountStatusItemLevelIssue] = null,
    statistics: AccountStatusStatistics = null
  ): AccountStatusProducts = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (country != null) __obj.updateDynamic("country")(country)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (itemLevelIssues != null) __obj.updateDynamic("itemLevelIssues")(itemLevelIssues)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    __obj.asInstanceOf[AccountStatusProducts]
  }
}

