package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

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
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination)
    __obj.asInstanceOf[EntitlementsListResponse]
  }
}

