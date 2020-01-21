package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var dimensionType: js.UndefOr[String] = js.undefined
  var dimensionValues: js.UndefOr[js.Array[DimensionDimensionValue]] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(dimensionType: String = null, dimensionValues: js.Array[DimensionDimensionValue] = null): Dimension = {
    val __obj = js.Dynamic.literal()
    if (dimensionType != null) __obj.updateDynamic("dimensionType")(dimensionType.asInstanceOf[js.Any])
    if (dimensionValues != null) __obj.updateDynamic("dimensionValues")(dimensionValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
}

