package typings.gapiDotClientDotMonitoring.gapi.client.monitoring

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectdPayload extends js.Object {
  /** The end time of the interval. */
  var endTime: js.UndefOr[String] = js.undefined
  /** The measurement metadata. Example: "process_id" -> 12345 */
  var metadata: js.UndefOr[Record[String, TypedValue]] = js.undefined
  /** The name of the plugin. Example: "disk". */
  var plugin: js.UndefOr[String] = js.undefined
  /** The instance name of the plugin Example: "hdcl". */
  var pluginInstance: js.UndefOr[String] = js.undefined
  /** The start time of the interval. */
  var startTime: js.UndefOr[String] = js.undefined
  /** The measurement type. Example: "memory". */
  var `type`: js.UndefOr[String] = js.undefined
  /** The measurement type instance. Example: "used". */
  var typeInstance: js.UndefOr[String] = js.undefined
  /** The measured values during this time interval. Each value must have a different dataSourceName. */
  var values: js.UndefOr[js.Array[CollectdValue]] = js.undefined
}

object CollectdPayload {
  @scala.inline
  def apply(
    endTime: String = null,
    metadata: Record[String, TypedValue] = null,
    plugin: String = null,
    pluginInstance: String = null,
    startTime: String = null,
    `type`: String = null,
    typeInstance: String = null,
    values: js.Array[CollectdValue] = null
  ): CollectdPayload = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (pluginInstance != null) __obj.updateDynamic("pluginInstance")(pluginInstance.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeInstance != null) __obj.updateDynamic("typeInstance")(typeInstance.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectdPayload]
  }
}

