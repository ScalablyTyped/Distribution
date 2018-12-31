package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#productsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  /** Information about a product (e.g. an app) in the Google Play store, for display to an enterprise admin. */
  var product: js.UndefOr[js.Array[Product]] = js.undefined
  /** Pagination information for token pagination. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}

