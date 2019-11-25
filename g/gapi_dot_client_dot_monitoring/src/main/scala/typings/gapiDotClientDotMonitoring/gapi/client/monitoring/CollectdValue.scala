package typings.gapiDotClientDotMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectdValue extends js.Object {
  /** The data source for the collectd value. For example there are two data sources for network measurements: "rx" and "tx". */
  var dataSourceName: js.UndefOr[String] = js.undefined
  /** The type of measurement. */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /** The measurement value. */
  var value: js.UndefOr[TypedValue] = js.undefined
}

object CollectdValue {
  @scala.inline
  def apply(dataSourceName: String = null, dataSourceType: String = null, value: TypedValue = null): CollectdValue = {
    val __obj = js.Dynamic.literal()
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectdValue]
  }
}

