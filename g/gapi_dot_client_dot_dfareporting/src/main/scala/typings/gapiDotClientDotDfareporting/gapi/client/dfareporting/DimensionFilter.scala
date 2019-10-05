package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionFilter extends js.Object {
  /** The name of the dimension to filter. */
  var dimensionName: js.UndefOr[String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#dimensionFilter. */
  var kind: js.UndefOr[String] = js.undefined
  /** The value of the dimension to filter. */
  var value: js.UndefOr[String] = js.undefined
}

object DimensionFilter {
  @scala.inline
  def apply(dimensionName: String = null, kind: String = null, value: String = null): DimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DimensionFilter]
  }
}

