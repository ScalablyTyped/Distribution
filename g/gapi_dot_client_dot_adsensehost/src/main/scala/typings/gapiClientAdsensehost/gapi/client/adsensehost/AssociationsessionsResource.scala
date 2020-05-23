package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.Oauthtoken
import typings.gapiClientAdsensehost.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationsessionsResource extends js.Object {
  /** Create an association session for initiating an association with an AdSense user. */
  def start(request: Oauthtoken): Request[AssociationSession]
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(request: PrettyPrint): Request[AssociationSession]
}

object AssociationsessionsResource {
  @scala.inline
  def apply(
    start: Oauthtoken => Request[AssociationSession],
    verify: PrettyPrint => Request[AssociationSession]
  ): AssociationsessionsResource = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[AssociationsessionsResource]
  }
}

