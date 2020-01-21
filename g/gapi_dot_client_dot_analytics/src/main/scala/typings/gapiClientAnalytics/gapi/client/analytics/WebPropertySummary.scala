package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertySummary extends js.Object {
  /** Web property ID of the form UA-XXXXX-YY. */
  var id: js.UndefOr[String] = js.undefined
  /** Internal ID for this web property. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  /** Resource type for Analytics WebPropertySummary. */
  var kind: js.UndefOr[String] = js.undefined
  /** Level for this web property. Possible values are STANDARD or PREMIUM. */
  var level: js.UndefOr[String] = js.undefined
  /** Web property name. */
  var name: js.UndefOr[String] = js.undefined
  /** List of profiles under this web property. */
  var profiles: js.UndefOr[js.Array[ProfileSummary]] = js.undefined
  /** Indicates whether this web property is starred or not. */
  var starred: js.UndefOr[Boolean] = js.undefined
  /** Website url for this web property. */
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object WebPropertySummary {
  @scala.inline
  def apply(
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    level: String = null,
    name: String = null,
    profiles: js.Array[ProfileSummary] = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    websiteUrl: String = null
  ): WebPropertySummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPropertySummary]
  }
}

