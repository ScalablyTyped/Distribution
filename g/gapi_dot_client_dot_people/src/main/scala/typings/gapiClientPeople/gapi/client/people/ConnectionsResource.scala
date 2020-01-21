package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPeople.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionsResource extends js.Object {
  /**
    * Provides a list of the authenticated user's contacts merged with any
    * connected profiles.
    * <br>
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request_[ListConnectionsResponse]
}

object ConnectionsResource {
  @scala.inline
  def apply(
    list: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request_[ListConnectionsResponse]
  ): ConnectionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ConnectionsResource]
  }
}

