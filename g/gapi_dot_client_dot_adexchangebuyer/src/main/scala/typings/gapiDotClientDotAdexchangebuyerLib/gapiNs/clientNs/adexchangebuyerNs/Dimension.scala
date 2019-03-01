package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var dimensionType: js.UndefOr[java.lang.String] = js.undefined
  var dimensionValues: js.UndefOr[js.Array[DimensionDimensionValue]] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(dimensionType: java.lang.String = null, dimensionValues: js.Array[DimensionDimensionValue] = null): Dimension = {
    val __obj = js.Dynamic.literal()
    if (dimensionType != null) __obj.updateDynamic("dimensionType")(dimensionType)
    if (dimensionValues != null) __obj.updateDynamic("dimensionValues")(dimensionValues)
    __obj.asInstanceOf[Dimension]
  }
}

