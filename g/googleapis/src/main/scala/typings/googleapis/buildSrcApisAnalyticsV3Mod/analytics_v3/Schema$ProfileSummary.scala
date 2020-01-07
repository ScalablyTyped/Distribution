package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics ProfileSummary. ProfileSummary returns basic
  * information (i.e., summary) for a profile.
  */
@js.native
trait Schema$ProfileSummary extends js.Object {
  /**
    * View (profile) ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics ProfileSummary.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * View (profile) name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether this view (profile) is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  /**
    * View (Profile) type. Supported types: WEB or APP.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$ProfileSummary {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    name: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): Schema$ProfileSummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProfileSummary]
  }
}

