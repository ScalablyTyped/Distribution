package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the products similar to a single product in a query
  * image.
  */
@js.native
trait Schema$GroupedResult extends js.Object {
  /**
    * The bounding polygon around the product detected in the query image.
    */
  var boundingPoly: js.UndefOr[Schema$BoundingPoly] = js.native
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[Schema$Result]] = js.native
}

object Schema$GroupedResult {
  @scala.inline
  def apply(boundingPoly: Schema$BoundingPoly = null, results: js.Array[Schema$Result] = null): Schema$GroupedResult = {
    val __obj = js.Dynamic.literal()
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupedResult]
  }
}

