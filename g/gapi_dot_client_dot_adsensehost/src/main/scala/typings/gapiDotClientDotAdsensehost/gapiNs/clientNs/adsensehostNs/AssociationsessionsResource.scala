package typings.gapiDotClientDotAdsensehost.gapiNs.clientNs.adsensehostNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdsensehost.Anon_AltFieldsKey
import typings.gapiDotClientDotAdsensehost.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationsessionsResource extends js.Object {
  /** Create an association session for initiating an association with an AdSense user. */
  def start(request: Anon_AltFieldsKey): Request[AssociationSession]
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(request: Anon_AltFieldsKeyOauthtoken): Request[AssociationSession]
}

object AssociationsessionsResource {
  @scala.inline
  def apply(
    start: Anon_AltFieldsKey => Request[AssociationSession],
    verify: Anon_AltFieldsKeyOauthtoken => Request[AssociationSession]
  ): AssociationsessionsResource = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), verify = js.Any.fromFunction1(verify))
  
    __obj.asInstanceOf[AssociationsessionsResource]
  }
}

