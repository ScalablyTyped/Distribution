package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusStatistics extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var disapproved: js.UndefOr[String] = js.undefined
  var expiring: js.UndefOr[String] = js.undefined
  var pending: js.UndefOr[String] = js.undefined
}

object AccountStatusStatistics {
  @scala.inline
  def apply(active: String = null, disapproved: String = null, expiring: String = null, pending: String = null): AccountStatusStatistics = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (disapproved != null) __obj.updateDynamic("disapproved")(disapproved.asInstanceOf[js.Any])
    if (expiring != null) __obj.updateDynamic("expiring")(expiring.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatusStatistics]
  }
}

