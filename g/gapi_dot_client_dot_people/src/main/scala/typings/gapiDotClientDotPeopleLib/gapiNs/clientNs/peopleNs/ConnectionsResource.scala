package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

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
  def list(request: gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ListConnectionsResponse]
}

object ConnectionsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotPeopleLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListConnectionsResponse]
    ]
  ): ConnectionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ConnectionsResource]
  }
}

