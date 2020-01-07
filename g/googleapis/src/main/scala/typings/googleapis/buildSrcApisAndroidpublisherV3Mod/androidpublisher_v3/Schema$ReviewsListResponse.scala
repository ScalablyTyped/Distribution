package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ReviewsListResponse extends js.Object {
  var pageInfo: js.UndefOr[Schema$PageInfo] = js.native
  var reviews: js.UndefOr[js.Array[Schema$Review]] = js.native
  var tokenPagination: js.UndefOr[Schema$TokenPagination] = js.native
}

object Schema$ReviewsListResponse {
  @scala.inline
  def apply(
    pageInfo: Schema$PageInfo = null,
    reviews: js.Array[Schema$Review] = null,
    tokenPagination: Schema$TokenPagination = null
  ): Schema$ReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (reviews != null) __obj.updateDynamic("reviews")(reviews.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReviewsListResponse]
  }
}

