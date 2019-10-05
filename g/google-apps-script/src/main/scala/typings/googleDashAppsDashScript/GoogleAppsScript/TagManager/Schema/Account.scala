package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var shareData: js.UndefOr[Boolean] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    accountId: String = null,
    fingerprint: String = null,
    name: String = null,
    path: String = null,
    shareData: js.UndefOr[Boolean] = js.undefined,
    tagManagerUrl: String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(shareData)) __obj.updateDynamic("shareData")(shareData)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    __obj.asInstanceOf[Account]
  }
}

