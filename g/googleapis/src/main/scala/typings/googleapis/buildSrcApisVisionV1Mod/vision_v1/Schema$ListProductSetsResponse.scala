package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListProductSets` method.
  */
@js.native
trait Schema$ListProductSetsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of ProductSets.
    */
  var productSets: js.UndefOr[js.Array[Schema$ProductSet]] = js.native
}

object Schema$ListProductSetsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, productSets: js.Array[Schema$ProductSet] = null): Schema$ListProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (productSets != null) __obj.updateDynamic("productSets")(productSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListProductSetsResponse]
  }
}

