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

