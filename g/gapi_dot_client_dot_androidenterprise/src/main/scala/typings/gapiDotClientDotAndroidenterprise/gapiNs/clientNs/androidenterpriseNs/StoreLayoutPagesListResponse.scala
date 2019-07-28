package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreLayoutPagesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeLayoutPagesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** A store page of an enterprise. */
  var page: js.UndefOr[js.Array[StorePage]] = js.undefined
}

object StoreLayoutPagesListResponse {
  @scala.inline
  def apply(kind: String = null, page: js.Array[StorePage] = null): StoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (page != null) __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[StoreLayoutPagesListResponse]
  }
}

