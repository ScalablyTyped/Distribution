package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionDimensionValue extends js.Object {
  /** Id of the dimension. */
  var id: js.UndefOr[Double] = js.undefined
  /** Name of the dimension mainly for debugging purposes, except for the case of CREATIVE_SIZE. For CREATIVE_SIZE, strings are used instead of ids. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Percent of total impressions for a dimension type. e.g. {dimension_type: 'GENDER', [{dimension_value: {id: 1, name: 'MALE', percentage: 60}}]} Gender
    * MALE is 60% of all impressions which have gender.
    */
  var percentage: js.UndefOr[Double] = js.undefined
}

object DimensionDimensionValue {
  @scala.inline
  def apply(
    id: js.UndefOr[Double] = js.undefined,
    name: String = null,
    percentage: js.UndefOr[Double] = js.undefined
  ): DimensionDimensionValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionDimensionValue]
  }
}

