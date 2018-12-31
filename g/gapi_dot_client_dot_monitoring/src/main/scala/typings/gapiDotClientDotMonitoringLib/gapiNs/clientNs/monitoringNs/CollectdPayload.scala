package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectdPayload extends js.Object {
  /** The end time of the interval. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** The measurement metadata. Example: "process_id" -> 12345 */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, TypedValue]] = js.undefined
  /** The name of the plugin. Example: "disk". */
  var plugin: js.UndefOr[java.lang.String] = js.undefined
  /** The instance name of the plugin Example: "hdcl". */
  var pluginInstance: js.UndefOr[java.lang.String] = js.undefined
  /** The start time of the interval. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The measurement type. Example: "memory". */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The measurement type instance. Example: "used". */
  var typeInstance: js.UndefOr[java.lang.String] = js.undefined
  /** The measured values during this time interval. Each value must have a different dataSourceName. */
  var values: js.UndefOr[js.Array[CollectdValue]] = js.undefined
}

