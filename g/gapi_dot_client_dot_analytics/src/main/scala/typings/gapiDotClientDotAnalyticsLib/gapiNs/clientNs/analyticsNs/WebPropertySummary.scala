package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertySummary extends js.Object {
  /** Web property ID of the form UA-XXXXX-YY. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for this web property. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics WebPropertySummary. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Level for this web property. Possible values are STANDARD or PREMIUM. */
  var level: js.UndefOr[java.lang.String] = js.undefined
  /** Web property name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** List of profiles under this web property. */
  var profiles: js.UndefOr[js.Array[ProfileSummary]] = js.undefined
  /** Indicates whether this web property is starred or not. */
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  /** Website url for this web property. */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object WebPropertySummary {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    level: java.lang.String = null,
    name: java.lang.String = null,
    profiles: js.Array[ProfileSummary] = null,
    starred: js.UndefOr[scala.Boolean] = js.undefined,
    websiteUrl: java.lang.String = null
  ): WebPropertySummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (level != null) __obj.updateDynamic("level")(level)
    if (name != null) __obj.updateDynamic("name")(name)
    if (profiles != null) __obj.updateDynamic("profiles")(profiles)
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[WebPropertySummary]
  }
}

