package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an activity group.
  */
@js.native
trait Schema$Activities extends js.Object {
  /**
    * List of activity filters. The dimension values need to be all either of
    * type &quot;dfa:activity&quot; or &quot;dfa:activityGroup&quot;.
    */
  var filters: js.UndefOr[js.Array[Schema$DimensionValue]] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#activities.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of names of floodlight activity metrics.
    */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Activities {
  @scala.inline
  def apply(
    filters: js.Array[Schema$DimensionValue] = null,
    kind: String = null,
    metricNames: js.Array[String] = null
  ): Schema$Activities = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Activities]
  }
}

