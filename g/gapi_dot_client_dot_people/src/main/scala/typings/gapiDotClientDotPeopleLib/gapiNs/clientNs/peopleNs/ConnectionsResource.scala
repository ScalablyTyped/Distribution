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
  def list(request: gapiDotClientDotPeopleLib.Anon_AccesstokenPersonFieldsPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListConnectionsResponse]
}

