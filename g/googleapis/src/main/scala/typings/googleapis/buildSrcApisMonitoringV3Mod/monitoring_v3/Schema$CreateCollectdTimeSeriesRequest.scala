package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CreateCollectdTimeSeries request.
  */
@js.native
trait Schema$CreateCollectdTimeSeriesRequest extends js.Object {
  /**
    * The collectd payloads representing the time series data. You must not
    * include more than a single point for each time series, so no two payloads
    * can have the same values for all of the fields plugin, plugin_instance,
    * type, and type_instance.
    */
  var collectdPayloads: js.UndefOr[js.Array[Schema$CollectdPayload]] = js.native
  /**
    * The version of collectd that collected the data. Example:
    * &quot;5.3.0-192.el6&quot;.
    */
  var collectdVersion: js.UndefOr[String] = js.native
  /**
    * The monitored resource associated with the time series.
    */
  var resource: js.UndefOr[Schema$MonitoredResource] = js.native
}

object Schema$CreateCollectdTimeSeriesRequest {
  @scala.inline
  def apply(
    collectdPayloads: js.Array[Schema$CollectdPayload] = null,
    collectdVersion: String = null,
    resource: Schema$MonitoredResource = null
  ): Schema$CreateCollectdTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    if (collectdPayloads != null) __obj.updateDynamic("collectdPayloads")(collectdPayloads.asInstanceOf[js.Any])
    if (collectdVersion != null) __obj.updateDynamic("collectdVersion")(collectdVersion.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateCollectdTimeSeriesRequest]
  }
}

