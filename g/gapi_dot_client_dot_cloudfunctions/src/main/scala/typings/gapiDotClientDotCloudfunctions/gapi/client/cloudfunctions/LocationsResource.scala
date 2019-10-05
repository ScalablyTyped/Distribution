package typings.gapiDotClientDotCloudfunctions.gapi.client.cloudfunctions

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudfunctions.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Lists information about the supported locations for this service. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAltBearertoken => Request[ListLocationsResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

