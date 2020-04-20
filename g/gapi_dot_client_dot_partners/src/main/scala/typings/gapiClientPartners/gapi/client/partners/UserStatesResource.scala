package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStatesResource extends js.Object {
  /** Lists states for current user. */
  def list(request: AnonFields): Request_[ListUserStatesResponse]
}

object UserStatesResource {
  @scala.inline
  def apply(list: AnonFields => Request_[ListUserStatesResponse]): UserStatesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserStatesResource]
  }
}

