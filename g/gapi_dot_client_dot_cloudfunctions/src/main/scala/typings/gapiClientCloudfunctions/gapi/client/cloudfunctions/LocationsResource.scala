package typings.gapiClientCloudfunctions.gapi.client.cloudfunctions

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudfunctions.AnonAccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Lists information about the supported locations for this service. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(list: AnonAccesstokenAltBearertoken => Request_[ListLocationsResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

