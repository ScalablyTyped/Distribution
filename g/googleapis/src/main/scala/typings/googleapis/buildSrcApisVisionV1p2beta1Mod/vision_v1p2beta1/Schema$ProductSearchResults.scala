package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results for a product search request.
  */
@js.native
trait Schema$ProductSearchResults extends js.Object {
  /**
    * Timestamp of the index which provided these results. Changes made after
    * this time are not reflected in the current results.
    */
  var indexTime: js.UndefOr[String] = js.native
  /**
    * List of results grouped by products detected in the query image. Each
    * entry corresponds to one bounding polygon in the query image, and
    * contains the matching products specific to that region. There may be
    * duplicate product matches in the union of all the per-product results.
    */
  var productGroupedResults: js.UndefOr[js.Array[Schema$GroupedResult]] = js.native
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[Schema$Result]] = js.native
}

object Schema$ProductSearchResults {
  @scala.inline
  def apply(
    indexTime: String = null,
    productGroupedResults: js.Array[Schema$GroupedResult] = null,
    results: js.Array[Schema$Result] = null
  ): Schema$ProductSearchResults = {
    val __obj = js.Dynamic.literal()
    if (indexTime != null) __obj.updateDynamic("indexTime")(indexTime.asInstanceOf[js.Any])
    if (productGroupedResults != null) __obj.updateDynamic("productGroupedResults")(productGroupedResults.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductSearchResults]
  }
}

