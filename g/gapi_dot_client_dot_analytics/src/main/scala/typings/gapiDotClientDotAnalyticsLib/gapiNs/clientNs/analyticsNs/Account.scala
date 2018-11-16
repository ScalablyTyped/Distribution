package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Account extends js.Object {
  /** Child link for an account entry. Points to the list of web properties for this account. */
  var childLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Type] = js.undefined
  /** Time the account was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Account ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics account. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Account name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Permissions the user has for this account. */
  var permissions: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_EffectiveArray] = js.undefined
  /** Link for this account. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether this account is starred or not. */
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  /** Time the account was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

