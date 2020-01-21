package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectdTimeSeriesRequest extends js.Object {
  /**
    * The collectd payloads representing the time series data. You must not include more than a single point for each time series, so no two payloads can
    * have the same values for all of the fields plugin, plugin_instance, type, and type_instance.
    */
  var collectdPayloads: js.UndefOr[js.Array[CollectdPayload]] = js.undefined
  /** The version of collectd that collected the data. Example: "5.3.0-192.el6". */
  var collectdVersion: js.UndefOr[String] = js.undefined
  /** The monitored resource associated with the time series. */
  var resource: js.UndefOr[MonitoredResource] = js.undefined
}

object CreateCollectdTimeSeriesRequest {
  @scala.inline
  def apply(
    collectdPayloads: js.Array[CollectdPayload] = null,
    collectdVersion: String = null,
    resource: MonitoredResource = null
  ): CreateCollectdTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    if (collectdPayloads != null) __obj.updateDynamic("collectdPayloads")(collectdPayloads.asInstanceOf[js.Any])
    if (collectdVersion != null) __obj.updateDynamic("collectdVersion")(collectdVersion.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectdTimeSeriesRequest]
  }
}

