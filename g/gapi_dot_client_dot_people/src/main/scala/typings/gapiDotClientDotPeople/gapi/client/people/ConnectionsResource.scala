package typings.gapiDotClientDotPeople.gapi.client.people

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPeople.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
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
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[ListConnectionsResponse]
}

object ConnectionsResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[ListConnectionsResponse]
  ): ConnectionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ConnectionsResource]
  }
}

