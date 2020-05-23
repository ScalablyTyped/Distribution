package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typings.gapiClient.gapi.client.Request
import typings.gapiClientProximitybeacon.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconinfoResource extends js.Object {
  /**
    * Given one or more beacon observations, returns any beacon information
    * and attachments accessible to your application. Authorize by using the
    * [API key](https://developers.google.com/beacons/proximity/get-started#request_a_browser_api_key)
    * for the application.
    */
  def getforobserved(request: Accesstoken): Request[GetInfoForObservedBeaconsResponse]
}

object BeaconinfoResource {
  @scala.inline
  def apply(getforobserved: Accesstoken => Request[GetInfoForObservedBeaconsResponse]): BeaconinfoResource = {
    val __obj = js.Dynamic.literal(getforobserved = js.Any.fromFunction1(getforobserved))
    __obj.asInstanceOf[BeaconinfoResource]
  }
}

