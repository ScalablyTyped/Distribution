package typings.googleapis

import typings.googleapis.buildSrcApisBooksV1Mod.books_v1.Schema$DownloadAccessRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccessViewStatus extends js.Object {
  var accessViewStatus: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var downloadAccess: js.UndefOr[Schema$DownloadAccessRestriction] = js.native
  var driveImportedContentLink: js.UndefOr[String] = js.native
  var embeddable: js.UndefOr[Boolean] = js.native
  var epub: js.UndefOr[Anon_AcsTokenLink] = js.native
  var explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.native
  var pdf: js.UndefOr[Anon_AcsTokenLink] = js.native
  var publicDomain: js.UndefOr[Boolean] = js.native
  var quoteSharingAllowed: js.UndefOr[Boolean] = js.native
  var textToSpeechPermission: js.UndefOr[String] = js.native
  var viewOrderUrl: js.UndefOr[String] = js.native
  var viewability: js.UndefOr[String] = js.native
  var webReaderLink: js.UndefOr[String] = js.native
}

object Anon_AccessViewStatus {
  @scala.inline
  def apply(
    accessViewStatus: String = null,
    country: String = null,
    downloadAccess: Schema$DownloadAccessRestriction = null,
    driveImportedContentLink: String = null,
    embeddable: js.UndefOr[Boolean] = js.undefined,
    epub: Anon_AcsTokenLink = null,
    explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.undefined,
    pdf: Anon_AcsTokenLink = null,
    publicDomain: js.UndefOr[Boolean] = js.undefined,
    quoteSharingAllowed: js.UndefOr[Boolean] = js.undefined,
    textToSpeechPermission: String = null,
    viewOrderUrl: String = null,
    viewability: String = null,
    webReaderLink: String = null
  ): Anon_AccessViewStatus = {
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
    __obj.asInstanceOf[Anon_AccessViewStatus]
  }
}

