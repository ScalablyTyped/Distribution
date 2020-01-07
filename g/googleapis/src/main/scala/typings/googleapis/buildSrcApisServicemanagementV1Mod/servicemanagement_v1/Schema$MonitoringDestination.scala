package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of a specific monitoring destination (the producer project or
  * the consumer project).
  */
@js.native
trait Schema$MonitoringDestination extends js.Object {
  /**
    * Types of the metrics to report to this monitoring destination. Each type
    * must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  /**
    * The monitored resource type. The type must be defined in
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.native
}

object Schema$MonitoringDestination {
  @scala.inline
  def apply(metrics: js.Array[String] = null, monitoredResource: String = null): Schema$MonitoringDestination = {
    val __obj = js.Dynamic.literal()
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (monitoredResource != null) __obj.updateDynamic("monitoredResource")(monitoredResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MonitoringDestination]
  }
}

