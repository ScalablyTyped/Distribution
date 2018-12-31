package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementAssignment extends js.Object {
  /** Whether this placement assignment is active. When true, the placement will be included in the ad's rotation. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of the placement to be assigned. This is a required field. */
  var placementId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the placement. This is a read-only, auto-generated field. */
  var placementIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether the placement to be assigned requires SSL. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslRequired: js.UndefOr[scala.Boolean] = js.undefined
}

