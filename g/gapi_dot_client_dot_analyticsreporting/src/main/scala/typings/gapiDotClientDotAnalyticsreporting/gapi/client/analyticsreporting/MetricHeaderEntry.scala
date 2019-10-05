package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricHeaderEntry extends js.Object {
  /** The name of the header. */
  var name: js.UndefOr[String] = js.undefined
  /** The type of the metric, for example `INTEGER`. */
  var `type`: js.UndefOr[String] = js.undefined
}

object MetricHeaderEntry {
  @scala.inline
  def apply(name: String = null, `type`: String = null): MetricHeaderEntry = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MetricHeaderEntry]
  }
}

