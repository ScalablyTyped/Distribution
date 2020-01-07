package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of data points sent from a collectd-based plugin. See the
  * collectd documentation for more information.
  */
@js.native
trait Schema$CollectdPayload extends js.Object {
  /**
    * The end time of the interval.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The measurement metadata. Example: &quot;process_id&quot; -&gt; 12345
    */
  var metadata: js.UndefOr[StringDictionary[Schema$TypedValue]] = js.native
  /**
    * The name of the plugin. Example: &quot;disk&quot;.
    */
  var plugin: js.UndefOr[String] = js.native
  /**
    * The instance name of the plugin Example: &quot;hdcl&quot;.
    */
  var pluginInstance: js.UndefOr[String] = js.native
  /**
    * The start time of the interval.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The measurement type. Example: &quot;memory&quot;.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The measurement type instance. Example: &quot;used&quot;.
    */
  var typeInstance: js.UndefOr[String] = js.native
  /**
    * The measured values during this time interval. Each value must have a
    * different dataSourceName.
    */
  var values: js.UndefOr[js.Array[Schema$CollectdValue]] = js.native
}

object Schema$CollectdPayload {
  @scala.inline
  def apply(
    endTime: String = null,
    metadata: StringDictionary[Schema$TypedValue] = null,
    plugin: String = null,
    pluginInstance: String = null,
    startTime: String = null,
    `type`: String = null,
    typeInstance: String = null,
    values: js.Array[Schema$CollectdValue] = null
  ): Schema$CollectdPayload = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (pluginInstance != null) __obj.updateDynamic("pluginInstance")(pluginInstance.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeInstance != null) __obj.updateDynamic("typeInstance")(typeInstance.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CollectdPayload]
  }
}

