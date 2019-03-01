package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationSession extends js.Object {
  /** Hosted account id of the associated publisher after association. Present if status is ACCEPTED. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier of this association session. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adsensehost#associationSession. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The products to associate with the user. Options: AFC, AFG, AFV, AFS (deprecated), AFMC (deprecated) */
  var productCodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Redirect URL of this association session. Used to redirect users into the AdSense association flow. */
  var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the completed association, available once the association callback token has been verified. One of ACCEPTED, REJECTED, or ERROR. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The preferred locale of the user themselves when going through the AdSense association flow. */
  var userLocale: js.UndefOr[java.lang.String] = js.undefined
  /** The locale of the user's hosted website. */
  var websiteLocale: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the user's hosted website. */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object AssociationSession {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    productCodes: js.Array[java.lang.String] = null,
    redirectUrl: java.lang.String = null,
    status: java.lang.String = null,
    userLocale: java.lang.String = null,
    websiteLocale: java.lang.String = null,
    websiteUrl: java.lang.String = null
  ): AssociationSession = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (productCodes != null) __obj.updateDynamic("productCodes")(productCodes)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userLocale != null) __obj.updateDynamic("userLocale")(userLocale)
    if (websiteLocale != null) __obj.updateDynamic("websiteLocale")(websiteLocale)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[AssociationSession]
  }
}

