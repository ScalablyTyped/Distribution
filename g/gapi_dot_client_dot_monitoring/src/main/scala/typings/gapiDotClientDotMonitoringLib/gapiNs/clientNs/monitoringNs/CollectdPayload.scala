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

object CollectdPayload {
  @scala.inline
  def apply(
    endTime: java.lang.String = null,
    metadata: stdLib.Record[java.lang.String, TypedValue] = null,
    plugin: java.lang.String = null,
    pluginInstance: java.lang.String = null,
    startTime: java.lang.String = null,
    `type`: java.lang.String = null,
    typeInstance: java.lang.String = null,
    values: js.Array[CollectdValue] = null
  ): CollectdPayload = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (pluginInstance != null) __obj.updateDynamic("pluginInstance")(pluginInstance)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeInstance != null) __obj.updateDynamic("typeInstance")(typeInstance)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[CollectdPayload]
  }
}

