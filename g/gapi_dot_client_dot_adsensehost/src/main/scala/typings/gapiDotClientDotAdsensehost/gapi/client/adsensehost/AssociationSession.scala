package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationSession extends js.Object {
  /** Hosted account id of the associated publisher after association. Present if status is ACCEPTED. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Unique identifier of this association session. */
  var id: js.UndefOr[String] = js.undefined
  /** Kind of resource this is, in this case adsensehost#associationSession. */
  var kind: js.UndefOr[String] = js.undefined
  /** The products to associate with the user. Options: AFC, AFG, AFV, AFS (deprecated), AFMC (deprecated) */
  var productCodes: js.UndefOr[js.Array[String]] = js.undefined
  /** Redirect URL of this association session. Used to redirect users into the AdSense association flow. */
  var redirectUrl: js.UndefOr[String] = js.undefined
  /** Status of the completed association, available once the association callback token has been verified. One of ACCEPTED, REJECTED, or ERROR. */
  var status: js.UndefOr[String] = js.undefined
  /** The preferred locale of the user themselves when going through the AdSense association flow. */
  var userLocale: js.UndefOr[String] = js.undefined
  /** The locale of the user's hosted website. */
  var websiteLocale: js.UndefOr[String] = js.undefined
  /** The URL of the user's hosted website. */
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object AssociationSession {
  @scala.inline
  def apply(
    accountId: String = null,
    id: String = null,
    kind: String = null,
    productCodes: js.Array[String] = null,
    redirectUrl: String = null,
    status: String = null,
    userLocale: String = null,
    websiteLocale: String = null,
    websiteUrl: String = null
  ): AssociationSession = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productCodes != null) __obj.updateDynamic("productCodes")(productCodes.asInstanceOf[js.Any])
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userLocale != null) __obj.updateDynamic("userLocale")(userLocale.asInstanceOf[js.Any])
    if (websiteLocale != null) __obj.updateDynamic("websiteLocale")(websiteLocale.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationSession]
  }
}

