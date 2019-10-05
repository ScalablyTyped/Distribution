package typings.gapiDotClientDotPartners.gapi.client.partners

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStatesResource extends js.Object {
  /** Lists states for current user. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListUserStatesResponse]
}

object UserStatesResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAltBearertokenCallbackFields => Request[ListUserStatesResponse]): UserStatesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UserStatesResource]
  }
}

