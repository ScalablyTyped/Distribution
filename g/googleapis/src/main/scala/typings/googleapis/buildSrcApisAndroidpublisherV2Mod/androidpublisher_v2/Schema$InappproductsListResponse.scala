package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InappproductsListResponse extends js.Object {
  var inappproduct: js.UndefOr[js.Array[Schema$InAppProduct]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#inappproductsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var pageInfo: js.UndefOr[Schema$PageInfo] = js.native
  var tokenPagination: js.UndefOr[Schema$TokenPagination] = js.native
}

object Schema$InappproductsListResponse {
  @scala.inline
  def apply(
    inappproduct: js.Array[Schema$InAppProduct] = null,
    kind: String = null,
    pageInfo: Schema$PageInfo = null,
    tokenPagination: Schema$TokenPagination = null
  ): Schema$InappproductsListResponse = {
    val __obj = js.Dynamic.literal()
    if (inappproduct != null) __obj.updateDynamic("inappproduct")(inappproduct.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InappproductsListResponse]
  }
}

