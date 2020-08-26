package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreativesResponse extends js.Object {
  /** The list of creatives. */
  var creatives: js.UndefOr[js.Array[Creative]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListCreativesRequest.page_token
    * field in the subsequent call to `ListCreatives` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListCreativesResponse {
  @scala.inline
  def apply(): ListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreativesResponse]
  }
  @scala.inline
  implicit class ListCreativesResponseOps[Self <: ListCreativesResponse] (val x: Self) extends AnyVal {
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
    def setCreativesVarargs(value: Creative*): Self = this.set("creatives", js.Array(value :_*))
    @scala.inline
    def setCreatives(value: js.Array[Creative]): Self = this.set("creatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatives: Self = this.set("creatives", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

