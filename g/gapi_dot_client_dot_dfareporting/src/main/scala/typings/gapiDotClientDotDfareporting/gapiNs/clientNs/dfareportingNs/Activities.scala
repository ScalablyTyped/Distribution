package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activities extends js.Object {
  /** List of activity filters. The dimension values need to be all either of type "dfa:activity" or "dfa:activityGroup". */
  var filters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  /** The kind of resource this is, in this case dfareporting#activities. */
  var kind: js.UndefOr[String] = js.undefined
  /** List of names of floodlight activity metrics. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
}

object Activities {
  @scala.inline
  def apply(
    filters: js.Array[DimensionValue] = null,
    kind: String = null,
    metricNames: js.Array[String] = null
  ): Activities = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    __obj.asInstanceOf[Activities]
  }
}

