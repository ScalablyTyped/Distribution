package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom Viewability Metric
  */
@js.native
trait Schema$CustomViewabilityMetric extends js.Object {
  /**
    * Configuration of the custom viewability metric.
    */
  var configuration: js.UndefOr[Schema$CustomViewabilityMetricConfiguration] = js.native
  /**
    * ID of the custom viewability metric.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the custom viewability metric.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$CustomViewabilityMetric {
  @scala.inline
  def apply(
    configuration: Schema$CustomViewabilityMetricConfiguration = null,
    id: String = null,
    name: String = null
  ): Schema$CustomViewabilityMetric = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomViewabilityMetric]
  }
}

