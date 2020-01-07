package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message carries publisher provided breakdown. E.g. {dimension_type:
  * &#39;COUNTRY&#39;, [{dimension_value: {id: 1, name: &#39;US&#39;}},
  * {dimension_value: {id: 2, name: &#39;UK&#39;}}]}
  */
@js.native
trait Schema$Dimension extends js.Object {
  var dimensionType: js.UndefOr[String] = js.native
  var dimensionValues: js.UndefOr[js.Array[Schema$DimensionDimensionValue]] = js.native
}

object Schema$Dimension {
  @scala.inline
  def apply(dimensionType: String = null, dimensionValues: js.Array[Schema$DimensionDimensionValue] = null): Schema$Dimension = {
    val __obj = js.Dynamic.literal()
    if (dimensionType != null) __obj.updateDynamic("dimensionType")(dimensionType.asInstanceOf[js.Any])
    if (dimensionValues != null) __obj.updateDynamic("dimensionValues")(dimensionValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Dimension]
  }
}

