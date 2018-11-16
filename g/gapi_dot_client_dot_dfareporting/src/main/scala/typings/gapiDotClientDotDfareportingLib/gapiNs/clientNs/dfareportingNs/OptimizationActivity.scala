package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptimizationActivity extends js.Object {
  /** Floodlight activity ID of this optimization activity. This is a required field. */
  var floodlightActivityId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the floodlight activity. This is a read-only, auto-generated field. */
  var floodlightActivityIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /**
               * Weight associated with this optimization. The weight assigned will be understood in proportion to the weights assigned to the other optimization
               * activities. Value must be greater than or equal to 1.
               */
  var weight: js.UndefOr[scala.Double] = js.undefined
}

