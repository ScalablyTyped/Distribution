package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.AccessViewStatus
import typings.gapiClientBooks.anon.AcquiredTime
import typings.gapiClientBooks.anon.AllowAnonLogging
import typings.gapiClientBooks.anon.BuyLink
import typings.gapiClientBooks.anon.Explanation
import typings.gapiClientBooks.anon.Layers
import typings.gapiClientBooks.anon.TextSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume extends js.Object {
  /**
    * Any information about a volume related to reading or obtaining that volume text. This information can depend on country (books may be public domain in
    * one country but not in another, e.g.).
    */
  var accessInfo: js.UndefOr[AccessViewStatus] = js.native
  /** Opaque identifier for a specific version of a volume resource. (In LITE projection) */
  var etag: js.UndefOr[String] = js.native
  /** Unique identifier for a volume. (In LITE projection.) */
  var id: js.UndefOr[String] = js.native
  /** Resource type for a volume. (In LITE projection.) */
  var kind: js.UndefOr[String] = js.native
  /** What layers exist in this volume and high level information about them. */
  var layerInfo: js.UndefOr[Layers] = js.native
  /** Recommendation related information for this volume. */
  var recommendedInfo: js.UndefOr[Explanation] = js.native
  /**
    * Any information about a volume related to the eBookstore and/or purchaseability. This information can depend on the country where the request
    * originates from (i.e. books may not be for sale in certain countries).
    */
  var saleInfo: js.UndefOr[BuyLink] = js.native
  /** Search result information related to this volume. */
  var searchInfo: js.UndefOr[TextSnippet] = js.native
  /** URL to this resource. (In LITE projection.) */
  var selfLink: js.UndefOr[String] = js.native
  /** User specific information related to this volume. (e.g. page this user last read or whether they purchased this book) */
  var userInfo: js.UndefOr[AcquiredTime] = js.native
  /** General volume information. */
  var volumeInfo: js.UndefOr[AllowAnonLogging] = js.native
}

object Volume {
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
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
    def setAccessInfo(value: AccessViewStatus): Self = this.set("accessInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessInfo: Self = this.set("accessInfo", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLayerInfo(value: Layers): Self = this.set("layerInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerInfo: Self = this.set("layerInfo", js.undefined)
    @scala.inline
    def setRecommendedInfo(value: Explanation): Self = this.set("recommendedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendedInfo: Self = this.set("recommendedInfo", js.undefined)
    @scala.inline
    def setSaleInfo(value: BuyLink): Self = this.set("saleInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaleInfo: Self = this.set("saleInfo", js.undefined)
    @scala.inline
    def setSearchInfo(value: TextSnippet): Self = this.set("searchInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchInfo: Self = this.set("searchInfo", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setUserInfo(value: AcquiredTime): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInfo: Self = this.set("userInfo", js.undefined)
    @scala.inline
    def setVolumeInfo(value: AllowAnonLogging): Self = this.set("volumeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeInfo: Self = this.set("volumeInfo", js.undefined)
  }
  
}

