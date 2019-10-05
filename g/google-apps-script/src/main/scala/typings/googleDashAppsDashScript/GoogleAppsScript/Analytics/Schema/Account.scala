package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var childLink: js.UndefOr[AccountChildLink] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var permissions: js.UndefOr[AccountPermissions] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var starred: js.UndefOr[Boolean] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    childLink: AccountChildLink = null,
    created: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    permissions: AccountPermissions = null,
    selfLink: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    updated: String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (childLink != null) __obj.updateDynamic("childLink")(childLink)
    if (created != null) __obj.updateDynamic("created")(created)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Account]
  }
}

