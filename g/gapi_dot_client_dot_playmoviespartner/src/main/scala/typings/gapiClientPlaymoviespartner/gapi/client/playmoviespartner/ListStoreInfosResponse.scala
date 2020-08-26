package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStoreInfosResponse extends js.Object {
  /** See 'List methods rules' for info about this field. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** List of StoreInfos that match the request criteria. */
  var storeInfos: js.UndefOr[js.Array[StoreInfo]] = js.native
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[Double] = js.native
}

object ListStoreInfosResponse {
  @scala.inline
  def apply(): ListStoreInfosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStoreInfosResponse]
  }
  @scala.inline
  implicit class ListStoreInfosResponseOps[Self <: ListStoreInfosResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setStoreInfosVarargs(value: StoreInfo*): Self = this.set("storeInfos", js.Array(value :_*))
    @scala.inline
    def setStoreInfos(value: js.Array[StoreInfo]): Self = this.set("storeInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreInfos: Self = this.set("storeInfos", js.undefined)
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
  
}

