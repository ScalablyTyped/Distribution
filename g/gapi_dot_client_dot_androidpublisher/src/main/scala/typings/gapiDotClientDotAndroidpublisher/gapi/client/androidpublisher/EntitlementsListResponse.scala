package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsListResponse extends js.Object {
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var resources: js.UndefOr[js.Array[Entitlement]] = js.undefined
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}

object EntitlementsListResponse {
  @scala.inline
  def apply(
    pageInfo: PageInfo = null,
    resources: js.Array[Entitlement] = null,
    tokenPagination: TokenPagination = null
  ): EntitlementsListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitlementsListResponse]
  }
}

