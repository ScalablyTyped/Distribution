package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Header for the metrics.
  */
@js.native
trait Schema$MetricHeaderEntry extends js.Object {
  /**
    * The name of the header.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the metric, for example `INTEGER`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$MetricHeaderEntry {
  @scala.inline
  def apply(name: String = null, `type`: String = null): Schema$MetricHeaderEntry = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetricHeaderEntry]
  }
}

