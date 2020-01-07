package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProductsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token for the retrieval of the next page of products.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var resources: js.UndefOr[js.Array[Schema$Product]] = js.native
}

object Schema$ProductsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, resources: js.Array[Schema$Product] = null): Schema$ProductsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductsListResponse]
  }
}

