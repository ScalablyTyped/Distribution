package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bucket in a facet is the basic unit of operation. A bucket can comprise
  * either a single value OR a contiguous range of values, depending on the
  * type of the field bucketed. FacetBucket is currently used only for
  * returning the response object.
  */
@js.native
trait SchemaFacetBucket extends js.Object {
  /**
    * Number of results that match the bucket value. Counts are only returned
    * for searches when count accuracy is ensured. Can be empty.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Percent of results that match the bucket value. This value is between
    * (0-100]. Percentages are returned for all searches, but are an estimate.
    * Because percentages are always returned, you should render percentages
    * instead of counts.
    */
  var percentage: js.UndefOr[Double] = js.native
  var value: js.UndefOr[SchemaValue] = js.native
}

object SchemaFacetBucket {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    percentage: js.UndefOr[Double] = js.undefined,
    value: SchemaValue = null
  ): SchemaFacetBucket = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFacetBucket]
  }
}

