package typings.dogapi

import typings.dogapi.dogapiStrings.count
import typings.dogapi.dogapiStrings.gauge
import typings.dogapi.dogapiStrings.rate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var metric_type: js.UndefOr[gauge | count] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: js.UndefOr[gauge | rate | count] = js.undefined
}

object AnonHost {
  @scala.inline
  def apply(
    host: String = null,
    metric_type: gauge | count = null,
    tags: js.Array[String] = null,
    `type`: gauge | rate | count = null
  ): AnonHost = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (metric_type != null) __obj.updateDynamic("metric_type")(metric_type.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

