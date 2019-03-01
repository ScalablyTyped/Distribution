package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileSummary extends js.Object {
  /** View (profile) ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics ProfileSummary. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** View (profile) name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether this view (profile) is starred or not. */
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  /** View (Profile) type. Supported types: WEB or APP. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ProfileSummary {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    starred: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): ProfileSummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProfileSummary]
  }
}

