package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlusdomains.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudiencesResource extends js.Object {
  /** List all of the audiences to which a user can share. */
  def list(request: AnonFields): Request_[AudiencesFeed]
}

object AudiencesResource {
  @scala.inline
  def apply(list: AnonFields => Request_[AudiencesFeed]): AudiencesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AudiencesResource]
  }
}

