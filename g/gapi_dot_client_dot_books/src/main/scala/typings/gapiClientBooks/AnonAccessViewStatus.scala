package typings.gapiClientBooks

import typings.gapiClientBooks.gapi.client.books.DownloadAccessRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessViewStatus extends js.Object {
  /**
    * Combines the access and viewability of this volume into a single status field for this user. Values can be FULL_PURCHASED, FULL_PUBLIC_DOMAIN, SAMPLE
    * or NONE. (In LITE projection.)
    */
  var accessViewStatus: js.UndefOr[String] = js.undefined
  /** The two-letter ISO_3166-1 country code for which this access information is valid. (In LITE projection.) */
  var country: js.UndefOr[String] = js.undefined
  /** Information about a volume's download license access restrictions. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.undefined
  /** URL to the Google Drive viewer if this volume is uploaded by the user by selecting the file from Google Drive. */
  var driveImportedContentLink: js.UndefOr[String] = js.undefined
  /** Whether this volume can be embedded in a viewport using the Embedded Viewer API. */
  var embeddable: js.UndefOr[Boolean] = js.undefined
  /** Information about epub content. (In LITE projection.) */
  var epub: js.UndefOr[AnonAcsTokenLink] = js.undefined
  /**
    * Whether this volume requires that the client explicitly request offline download license rather than have it done automatically when loading the
    * content, if the client supports it.
    */
  var explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.undefined
  /** Information about pdf content. (In LITE projection.) */
  var pdf: js.UndefOr[AnonAcsTokenLink] = js.undefined
  /** Whether or not this book is public domain in the country listed above. */
  var publicDomain: js.UndefOr[Boolean] = js.undefined
  /** Whether quote sharing is allowed for this volume. */
  var quoteSharingAllowed: js.UndefOr[Boolean] = js.undefined
  /** Whether text-to-speech is permitted for this volume. Values can be ALLOWED, ALLOWED_FOR_ACCESSIBILITY, or NOT_ALLOWED. */
  var textToSpeechPermission: js.UndefOr[String] = js.undefined
  /** For ordered but not yet processed orders, we give a URL that can be used to go to the appropriate Google Wallet page. */
  var viewOrderUrl: js.UndefOr[String] = js.undefined
  /**
    * The read access of a volume. Possible values are PARTIAL, ALL_PAGES, NO_PAGES or UNKNOWN. This value depends on the country listed above. A value of
    * PARTIAL means that the publisher has allowed some portion of the volume to be viewed publicly, without purchase. This can apply to eBooks as well as
    * non-eBooks. Public domain books will always have a value of ALL_PAGES.
    */
  var viewability: js.UndefOr[String] = js.undefined
  /** URL to read this volume on the Google Books site. Link will not allow users to read non-viewable volumes. */
  var webReaderLink: js.UndefOr[String] = js.undefined
}

object AnonAccessViewStatus {
  @scala.inline
  def apply(
    accessViewStatus: String = null,
    country: String = null,
    downloadAccess: DownloadAccessRestriction = null,
    driveImportedContentLink: String = null,
    embeddable: js.UndefOr[Boolean] = js.undefined,
    epub: AnonAcsTokenLink = null,
    explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.undefined,
    pdf: AnonAcsTokenLink = null,
    publicDomain: js.UndefOr[Boolean] = js.undefined,
    quoteSharingAllowed: js.UndefOr[Boolean] = js.undefined,
    textToSpeechPermission: String = null,
    viewOrderUrl: String = null,
    viewability: String = null,
    webReaderLink: String = null
  ): AnonAccessViewStatus = {
    val __obj = js.Dynamic.literal()
    if (accessViewStatus != null) __obj.updateDynamic("accessViewStatus")(accessViewStatus.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (downloadAccess != null) __obj.updateDynamic("downloadAccess")(downloadAccess.asInstanceOf[js.Any])
    if (driveImportedContentLink != null) __obj.updateDynamic("driveImportedContentLink")(driveImportedContentLink.asInstanceOf[js.Any])
    if (!js.isUndefined(embeddable)) __obj.updateDynamic("embeddable")(embeddable.asInstanceOf[js.Any])
    if (epub != null) __obj.updateDynamic("epub")(epub.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitOfflineLicenseManagement)) __obj.updateDynamic("explicitOfflineLicenseManagement")(explicitOfflineLicenseManagement.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (!js.isUndefined(publicDomain)) __obj.updateDynamic("publicDomain")(publicDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(quoteSharingAllowed)) __obj.updateDynamic("quoteSharingAllowed")(quoteSharingAllowed.asInstanceOf[js.Any])
    if (textToSpeechPermission != null) __obj.updateDynamic("textToSpeechPermission")(textToSpeechPermission.asInstanceOf[js.Any])
    if (viewOrderUrl != null) __obj.updateDynamic("viewOrderUrl")(viewOrderUrl.asInstanceOf[js.Any])
    if (viewability != null) __obj.updateDynamic("viewability")(viewability.asInstanceOf[js.Any])
    if (webReaderLink != null) __obj.updateDynamic("webReaderLink")(webReaderLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessViewStatus]
  }
}

