package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatesResource extends js.Object {
  /**
    * Lists the last few versions of the device state in descending order (i.e.:
    * newest first).
    */
  def list(request: Anon_AccesstokenAlt): Request[ListDeviceStatesResponse]
}

object StatesResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAlt => Request[ListDeviceStatesResponse]): StatesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[StatesResource]
  }
}

