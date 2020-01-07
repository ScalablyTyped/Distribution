package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of (label, value) pairs which were dropped during aggregation,
  * attached to google.api.Distribution.Exemplars in google.api.Distribution
  * values during aggregation.These values are used in combination with the
  * label values that remain on the aggregated Distribution timeseries to
  * construct the full label set for the exemplar values. The resulting full
  * label set may be used to identify the specific task/job/instance (for
  * example) which may be contributing to a long-tail, while allowing the
  * storage savings of only storing aggregated distribution values for a large
  * group.Note that there are no guarantees on ordering of the labels from
  * exemplar-to-exemplar and from distribution-to-distribution in the same
  * stream, and there may be duplicates. It is up to clients to resolve any
  * ambiguities.
  */
@js.native
trait Schema$DroppedLabels extends js.Object {
  /**
    * Map from label to its value, for all labels dropped in any aggregation.
    */
  var label: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$DroppedLabels {
  @scala.inline
  def apply(label: StringDictionary[String] = null): Schema$DroppedLabels = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DroppedLabels]
  }
}

