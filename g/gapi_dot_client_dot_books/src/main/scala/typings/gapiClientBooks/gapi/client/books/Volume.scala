package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.AnonAccessViewStatus
import typings.gapiClientBooks.AnonAcquiredTime
import typings.gapiClientBooks.AnonAllowAnonLogging
import typings.gapiClientBooks.AnonBuyLink
import typings.gapiClientBooks.AnonExplanation
import typings.gapiClientBooks.AnonLayers
import typings.gapiClientBooks.AnonTextSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  /**
    * Any information about a volume related to reading or obtaining that volume text. This information can depend on country (books may be public domain in
    * one country but not in another, e.g.).
    */
  var accessInfo: js.UndefOr[AnonAccessViewStatus] = js.undefined
  /** Opaque identifier for a specific version of a volume resource. (In LITE projection) */
  var etag: js.UndefOr[String] = js.undefined
  /** Unique identifier for a volume. (In LITE projection.) */
  var id: js.UndefOr[String] = js.undefined
  /** Resource type for a volume. (In LITE projection.) */
  var kind: js.UndefOr[String] = js.undefined
  /** What layers exist in this volume and high level information about them. */
  var layerInfo: js.UndefOr[AnonLayers] = js.undefined
  /** Recommendation related information for this volume. */
  var recommendedInfo: js.UndefOr[AnonExplanation] = js.undefined
  /**
    * Any information about a volume related to the eBookstore and/or purchaseability. This information can depend on the country where the request
    * originates from (i.e. books may not be for sale in certain countries).
    */
  var saleInfo: js.UndefOr[AnonBuyLink] = js.undefined
  /** Search result information related to this volume. */
  var searchInfo: js.UndefOr[AnonTextSnippet] = js.undefined
  /** URL to this resource. (In LITE projection.) */
  var selfLink: js.UndefOr[String] = js.undefined
  /** User specific information related to this volume. (e.g. page this user last read or whether they purchased this book) */
  var userInfo: js.UndefOr[AnonAcquiredTime] = js.undefined
  /** General volume information. */
  var volumeInfo: js.UndefOr[AnonAllowAnonLogging] = js.undefined
}

object Volume {
  @scala.inline
  def apply(
    accessInfo: AnonAccessViewStatus = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    layerInfo: AnonLayers = null,
    recommendedInfo: AnonExplanation = null,
    saleInfo: AnonBuyLink = null,
    searchInfo: AnonTextSnippet = null,
    selfLink: String = null,
    userInfo: AnonAcquiredTime = null,
    volumeInfo: AnonAllowAnonLogging = null
  ): Volume = {
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
    __obj.asInstanceOf[Volume]
  }
}

