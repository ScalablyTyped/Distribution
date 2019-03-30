package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var childLink: js.UndefOr[AccountChildLink] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var permissions: js.UndefOr[AccountPermissions] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    childLink: AccountChildLink = null,
    created: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    permissions: AccountPermissions = null,
    selfLink: java.lang.String = null,
    starred: js.UndefOr[scala.Boolean] = js.undefined,
    updated: java.lang.String = null
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

