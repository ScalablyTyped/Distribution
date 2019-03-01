package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsListResponse extends js.Object {
  var inappproduct: js.UndefOr[js.Array[InAppProduct]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#inappproductsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}

object InappproductsListResponse {
  @scala.inline
  def apply(
    inappproduct: js.Array[InAppProduct] = null,
    kind: java.lang.String = null,
    pageInfo: PageInfo = null,
    tokenPagination: TokenPagination = null
  ): InappproductsListResponse = {
    val __obj = js.Dynamic.literal()
    if (inappproduct != null) __obj.updateDynamic("inappproduct")(inappproduct)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination)
    __obj.asInstanceOf[InappproductsListResponse]
  }
}

