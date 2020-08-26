package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreLayoutPagesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeLayoutPagesListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** A store page of an enterprise. */
  var page: js.UndefOr[js.Array[StorePage]] = js.native
}

object StoreLayoutPagesListResponse {
  @scala.inline
  def apply(): StoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayoutPagesListResponse]
  }
  @scala.inline
  implicit class StoreLayoutPagesListResponseOps[Self <: StoreLayoutPagesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPageVarargs(value: StorePage*): Self = this.set("page", js.Array(value :_*))
    @scala.inline
    def setPage(value: js.Array[StorePage]): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
  
}

