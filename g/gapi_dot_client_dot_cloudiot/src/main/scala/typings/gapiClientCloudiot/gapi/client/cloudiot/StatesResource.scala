package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudiot.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatesResource extends js.Object {
  /**
    * Lists the last few versions of the device state in descending order (i.e.:
    * newest first).
    */
  def list(request: AnonAlt): Request_[ListDeviceStatesResponse]
}

object StatesResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[ListDeviceStatesResponse]): StatesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[StatesResource]
  }
}

