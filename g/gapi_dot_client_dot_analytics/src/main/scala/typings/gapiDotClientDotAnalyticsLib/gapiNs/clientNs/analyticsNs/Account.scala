package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /** Child link for an account entry. Points to the list of web properties for this account. */
  var childLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Time the account was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Account ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics account. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Account name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Permissions the user has for this account. */
  var permissions: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Effective] = js.undefined
  /** Link for this account. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether this account is starred or not. */
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  /** Time the account was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    childLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    created: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    permissions: gapiDotClientDotAnalyticsLib.Anon_Effective = null,
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

