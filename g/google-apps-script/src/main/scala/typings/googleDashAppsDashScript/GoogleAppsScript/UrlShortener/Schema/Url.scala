package typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var analytics: js.UndefOr[AnalyticsSummary] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var longUrl: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object Url {
  @scala.inline
  def apply(
    analytics: AnalyticsSummary = null,
    created: String = null,
    id: String = null,
    kind: String = null,
    longUrl: String = null,
    status: String = null
  ): Url = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (longUrl != null) __obj.updateDynamic("longUrl")(longUrl.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

