package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.Oauthtoken
import typings.gapiClientAdsensehost.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationsessionsResource extends js.Object {
  /** Create an association session for initiating an association with an AdSense user. */
  def start(request: Oauthtoken): Request[AssociationSession] = js.native
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(request: PrettyPrint): Request[AssociationSession] = js.native
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
  @scala.inline
  implicit class AssociationsessionsResourceOps[Self <: AssociationsessionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStart(value: Oauthtoken => Request[AssociationSession]): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setVerify(value: PrettyPrint => Request[AssociationSession]): Self = this.set("verify", js.Any.fromFunction1(value))
  }
  
}

