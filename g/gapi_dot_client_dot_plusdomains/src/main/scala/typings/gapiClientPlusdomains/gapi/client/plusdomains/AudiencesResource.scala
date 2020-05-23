package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlusdomains.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudiencesResource extends js.Object {
  /** List all of the audiences to which a user can share. */
  def list(request: Fields): Request[AudiencesFeed]
}

object AudiencesResource {
  @scala.inline
  def apply(list: Fields => Request[AudiencesFeed]): AudiencesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AudiencesResource]
  }
}

