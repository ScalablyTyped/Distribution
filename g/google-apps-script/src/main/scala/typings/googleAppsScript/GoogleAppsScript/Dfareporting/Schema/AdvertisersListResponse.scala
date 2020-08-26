package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertisersListResponse extends js.Object {
  var advertisers: js.UndefOr[js.Array[Advertiser]] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object AdvertisersListResponse {
  @scala.inline
  def apply(): AdvertisersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertisersListResponse]
  }
  @scala.inline
  implicit class AdvertisersListResponseOps[Self <: AdvertisersListResponse] (val x: Self) extends AnyVal {
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
    def setAdvertisersVarargs(value: Advertiser*): Self = this.set("advertisers", js.Array(value :_*))
    @scala.inline
    def setAdvertisers(value: js.Array[Advertiser]): Self = this.set("advertisers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisers: Self = this.set("advertisers", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

