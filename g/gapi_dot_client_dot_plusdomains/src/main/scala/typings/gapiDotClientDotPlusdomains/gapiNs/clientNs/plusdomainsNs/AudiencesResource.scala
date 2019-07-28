package typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPlusdomains.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudiencesResource extends js.Object {
  /** List all of the audiences to which a user can share. */
  def list(request: Anon_AltFields): Request[AudiencesFeed]
}

object AudiencesResource {
  @scala.inline
  def apply(list: Anon_AltFields => Request[AudiencesFeed]): AudiencesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AudiencesResource]
  }
}

