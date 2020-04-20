package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsensehost.AnonOauthtoken
import typings.gapiClientAdsensehost.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationsessionsResource extends js.Object {
  /** Create an association session for initiating an association with an AdSense user. */
  def start(request: AnonOauthtoken): Request_[AssociationSession]
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(request: AnonPrettyPrint): Request_[AssociationSession]
}

object AssociationsessionsResource {
  @scala.inline
  def apply(
    start: AnonOauthtoken => Request_[AssociationSession],
    verify: AnonPrettyPrint => Request_[AssociationSession]
  ): AssociationsessionsResource = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[AssociationsessionsResource]
  }
}

