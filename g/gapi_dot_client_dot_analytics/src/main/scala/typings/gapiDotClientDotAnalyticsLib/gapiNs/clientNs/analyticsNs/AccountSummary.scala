package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AccountSummary extends js.Object {
  /** Account ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics AccountSummary. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Account name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether this account is starred or not. */
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  /** List of web properties under this account. */
  var webProperties: js.UndefOr[js.Array[WebPropertySummary]] = js.undefined
}

