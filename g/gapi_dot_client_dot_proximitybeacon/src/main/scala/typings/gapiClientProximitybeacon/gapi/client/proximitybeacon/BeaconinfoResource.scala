package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typings.gapiClient.gapi.client.Request
import typings.gapiClientProximitybeacon.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeaconinfoResource extends js.Object {
  /**
    * Given one or more beacon observations, returns any beacon information
    * and attachments accessible to your application. Authorize by using the
    * [API key](https://developers.google.com/beacons/proximity/get-started#request_a_browser_api_key)
    * for the application.
    */
  def getforobserved(request: Accesstoken): Request[GetInfoForObservedBeaconsResponse] = js.native
}

object BeaconinfoResource {
  @scala.inline
  def apply(getforobserved: Accesstoken => Request[GetInfoForObservedBeaconsResponse]): BeaconinfoResource = {
    val __obj = js.Dynamic.literal(getforobserved = js.Any.fromFunction1(getforobserved))
    __obj.asInstanceOf[BeaconinfoResource]
  }
  @scala.inline
  implicit class BeaconinfoResourceOps[Self <: BeaconinfoResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetforobserved(value: Accesstoken => Request[GetInfoForObservedBeaconsResponse]): Self = this.set("getforobserved", js.Any.fromFunction1(value))
  }
  
}

