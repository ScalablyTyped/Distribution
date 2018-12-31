package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activities extends js.Object {
  /** List of activity filters. The dimension values need to be all either of type "dfa:activity" or "dfa:activityGroup". */
  var filters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  /** The kind of resource this is, in this case dfareporting#activities. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** List of names of floodlight activity metrics. */
  var metricNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

