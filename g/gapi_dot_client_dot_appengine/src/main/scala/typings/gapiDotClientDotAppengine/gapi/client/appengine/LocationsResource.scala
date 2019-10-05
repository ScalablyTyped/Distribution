package typings.gapiDotClientDotAppengine.gapi.client.appengine

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsFilter
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyLocationsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Get information about a location. */
  def get(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyLocationsId): Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsFilter): Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyLocationsId => Request[Location],
    list: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsFilter => Request[ListLocationsResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

