package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single data point from a collectd-based plugin.
  */
@js.native
trait Schema$CollectdValue extends js.Object {
  /**
    * The data source for the collectd value. For example there are two data
    * sources for network measurements: &quot;rx&quot; and &quot;tx&quot;.
    */
  var dataSourceName: js.UndefOr[String] = js.native
  /**
    * The type of measurement.
    */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
    * The measurement value.
    */
  var value: js.UndefOr[Schema$TypedValue] = js.native
}

object Schema$CollectdValue {
  @scala.inline
  def apply(dataSourceName: String = null, dataSourceType: String = null, value: Schema$TypedValue = null): Schema$CollectdValue = {
    val __obj = js.Dynamic.literal()
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CollectdValue]
  }
}

