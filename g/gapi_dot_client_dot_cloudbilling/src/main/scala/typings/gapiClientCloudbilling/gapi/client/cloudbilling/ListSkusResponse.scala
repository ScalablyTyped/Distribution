package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkusResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListSkus` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of public SKUs of the given service. */
  var skus: js.UndefOr[js.Array[Sku]] = js.native
}

object ListSkusResponse {
  @scala.inline
  def apply(): ListSkusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkusResponse]
  }
  @scala.inline
  implicit class ListSkusResponseOps[Self <: ListSkusResponse] (val x: Self) extends AnyVal {
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
    def setSkusVarargs(value: Sku*): Self = this.set("skus", js.Array(value :_*))
    @scala.inline
    def setSkus(value: js.Array[Sku]): Self = this.set("skus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkus: Self = this.set("skus", js.undefined)
  }
  
}

