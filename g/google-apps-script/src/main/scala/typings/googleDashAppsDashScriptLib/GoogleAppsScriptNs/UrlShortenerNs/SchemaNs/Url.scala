package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var analytics: js.UndefOr[AnalyticsSummary] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var longUrl: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object Url {
  @scala.inline
  def apply(
    analytics: AnalyticsSummary = null,
    created: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    longUrl: java.lang.String = null,
    status: java.lang.String = null
  ): Url = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics)
    if (created != null) __obj.updateDynamic("created")(created)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (longUrl != null) __obj.updateDynamic("longUrl")(longUrl)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Url]
  }
}

