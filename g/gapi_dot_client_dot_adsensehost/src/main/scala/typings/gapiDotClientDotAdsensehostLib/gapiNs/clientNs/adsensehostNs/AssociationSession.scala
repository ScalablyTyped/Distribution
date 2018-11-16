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

