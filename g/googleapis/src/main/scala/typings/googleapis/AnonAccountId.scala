package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccountId extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var internalWebPropertyId: js.UndefOr[String] = js.native
  var profileId: js.UndefOr[String] = js.native
  var profileName: js.UndefOr[String] = js.native
  var tableId: js.UndefOr[String] = js.native
  var webPropertyId: js.UndefOr[String] = js.native
}

object AnonAccountId {
  @scala.inline
  def apply(
    accountId: String = null,
    internalWebPropertyId: String = null,
    profileId: String = null,
    profileName: String = null,
    tableId: String = null,
    webPropertyId: String = null
  ): AnonAccountId = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (profileName != null) __obj.updateDynamic("profileName")(profileName.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountId]
  }
}

