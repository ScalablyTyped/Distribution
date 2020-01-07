package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VoidedPurchasesListResponse extends js.Object {
  var pageInfo: js.UndefOr[Schema$PageInfo] = js.native
  var tokenPagination: js.UndefOr[Schema$TokenPagination] = js.native
  var voidedPurchases: js.UndefOr[js.Array[Schema$VoidedPurchase]] = js.native
}

object Schema$VoidedPurchasesListResponse {
  @scala.inline
  def apply(
    pageInfo: Schema$PageInfo = null,
    tokenPagination: Schema$TokenPagination = null,
    voidedPurchases: js.Array[Schema$VoidedPurchase] = null
  ): Schema$VoidedPurchasesListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    if (voidedPurchases != null) __obj.updateDynamic("voidedPurchases")(voidedPurchases.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VoidedPurchasesListResponse]
  }
}

