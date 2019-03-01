package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionFilter extends js.Object {
  /** The name of the dimension to filter. */
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#dimensionFilter. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the dimension to filter. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object DimensionFilter {
  @scala.inline
  def apply(
    dimensionName: java.lang.String = null,
    kind: java.lang.String = null,
    value: java.lang.String = null
  ): DimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DimensionFilter]
  }
}

