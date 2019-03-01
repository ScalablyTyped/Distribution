package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectdValue extends js.Object {
  /** The data source for the collectd value. For example there are two data sources for network measurements: "rx" and "tx". */
  var dataSourceName: js.UndefOr[java.lang.String] = js.undefined
  /** The type of measurement. */
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /** The measurement value. */
  var value: js.UndefOr[TypedValue] = js.undefined
}

object CollectdValue {
  @scala.inline
  def apply(
    dataSourceName: java.lang.String = null,
    dataSourceType: java.lang.String = null,
    value: TypedValue = null
  ): CollectdValue = {
    val __obj = js.Dynamic.literal()
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CollectdValue]
  }
}

