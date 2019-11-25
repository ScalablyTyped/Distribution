package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusProducts extends js.Object {
  var channel: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var itemLevelIssues: js.UndefOr[js.Array[AccountStatusItemLevelIssue]] = js.undefined
  var statistics: js.UndefOr[AccountStatusStatistics] = js.undefined
}

object AccountStatusProducts {
  @scala.inline
  def apply(
    channel: String = null,
    country: String = null,
    destination: String = null,
    itemLevelIssues: js.Array[AccountStatusItemLevelIssue] = null,
    statistics: AccountStatusStatistics = null
  ): AccountStatusProducts = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (itemLevelIssues != null) __obj.updateDynamic("itemLevelIssues")(itemLevelIssues.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatusProducts]
  }
}

