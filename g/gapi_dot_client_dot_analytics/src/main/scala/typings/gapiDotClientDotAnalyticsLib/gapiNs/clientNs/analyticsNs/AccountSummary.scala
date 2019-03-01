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

object AccountSummary {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    starred: js.UndefOr[scala.Boolean] = js.undefined,
    webProperties: js.Array[WebPropertySummary] = null
  ): AccountSummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred)
    if (webProperties != null) __obj.updateDynamic("webProperties")(webProperties)
    __obj.asInstanceOf[AccountSummary]
  }
}

