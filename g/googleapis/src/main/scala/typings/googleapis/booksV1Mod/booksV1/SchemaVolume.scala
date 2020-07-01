package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.AccessViewStatus
import typings.googleapis.anon.AcquiredTime
import typings.googleapis.anon.AllowAnonLogging
import typings.googleapis.anon.BuyLink
import typings.googleapis.anon.Explanation
import typings.googleapis.anon.Layers
import typings.googleapis.anon.TextSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVolume extends js.Object {
  /**
    * Any information about a volume related to reading or obtaining that
    * volume text. This information can depend on country (books may be public
    * domain in one country but not in another, e.g.).
    */
  var accessInfo: js.UndefOr[AccessViewStatus] = js.native
  /**
    * Opaque identifier for a specific version of a volume resource. (In LITE
    * projection)
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Unique identifier for a volume. (In LITE projection.)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for a volume. (In LITE projection.)
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * What layers exist in this volume and high level information about them.
    */
  var layerInfo: js.UndefOr[Layers] = js.native
  /**
    * Recommendation related information for this volume.
    */
  var recommendedInfo: js.UndefOr[Explanation] = js.native
  /**
    * Any information about a volume related to the eBookstore and/or
    * purchaseability. This information can depend on the country where the
    * request originates from (i.e. books may not be for sale in certain
    * countries).
    */
  var saleInfo: js.UndefOr[BuyLink] = js.native
  /**
    * Search result information related to this volume.
    */
  var searchInfo: js.UndefOr[TextSnippet] = js.native
  /**
    * URL to this resource. (In LITE projection.)
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * User specific information related to this volume. (e.g. page this user
    * last read or whether they purchased this book)
    */
  var userInfo: js.UndefOr[AcquiredTime] = js.native
  /**
    * General volume information.
    */
  var volumeInfo: js.UndefOr[AllowAnonLogging] = js.native
}

object SchemaVolume {
  @scala.inline
  def apply(
    accessInfo: AccessViewStatus = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    layerInfo: Layers = null,
    recommendedInfo: Explanation = null,
    saleInfo: BuyLink = null,
    searchInfo: TextSnippet = null,
    selfLink: String = null,
    userInfo: AcquiredTime = null,
    volumeInfo: AllowAnonLogging = null
  ): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    if (accessInfo != null) __obj.updateDynamic("accessInfo")(accessInfo.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layerInfo != null) __obj.updateDynamic("layerInfo")(layerInfo.asInstanceOf[js.Any])
    if (recommendedInfo != null) __obj.updateDynamic("recommendedInfo")(recommendedInfo.asInstanceOf[js.Any])
    if (saleInfo != null) __obj.updateDynamic("saleInfo")(saleInfo.asInstanceOf[js.Any])
    if (searchInfo != null) __obj.updateDynamic("searchInfo")(searchInfo.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    if (volumeInfo != null) __obj.updateDynamic("volumeInfo")(volumeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVolume]
  }
}

