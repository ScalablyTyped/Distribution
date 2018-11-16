package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AssociationsessionsResource extends js.Object {
  /** Create an association session for initiating an association with an AdSense user. */
  def start(request: gapiDotClientDotAdsensehostLib.Anon_WebsiteLocale): gapiDotClientLib.gapiNs.clientNs.Request[AssociationSession]
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(request: gapiDotClientDotAdsensehostLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[AssociationSession]
}

