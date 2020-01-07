package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of a specific billing destination (Currently only support
  * bill against consumer project).
  */
@js.native
trait Schema$BillingDestination extends js.Object {
  /**
    * Names of the metrics to report to this billing destination. Each name
    * must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  /**
    * The monitored resource type. The type must be defined in
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.native
}

object Schema$BillingDestination {
  @scala.inline
  def apply(metrics: js.Array[String] = null, monitoredResource: String = null): Schema$BillingDestination = {
    val __obj = js.Dynamic.literal()
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (monitoredResource != null) __obj.updateDynamic("monitoredResource")(monitoredResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BillingDestination]
  }
}

