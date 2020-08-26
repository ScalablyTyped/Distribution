package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListKeyRingsResponse extends js.Object {
  /** The list of KeyRings. */
  var keyRings: js.UndefOr[js.Array[KeyRing]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListKeyRingsRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The total number of KeyRings that matched the query. */
  var totalSize: js.UndefOr[Double] = js.native
}

object ListKeyRingsResponse {
  @scala.inline
  def apply(): ListKeyRingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyRingsResponse]
  }
  @scala.inline
  implicit class ListKeyRingsResponseOps[Self <: ListKeyRingsResponse] (val x: Self) extends AnyVal {
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
    def setKeyRingsVarargs(value: KeyRing*): Self = this.set("keyRings", js.Array(value :_*))
    @scala.inline
    def setKeyRings(value: js.Array[KeyRing]): Self = this.set("keyRings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyRings: Self = this.set("keyRings", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
  
}

