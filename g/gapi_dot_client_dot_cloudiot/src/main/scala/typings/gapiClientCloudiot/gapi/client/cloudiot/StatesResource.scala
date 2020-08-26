package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudiot.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatesResource extends js.Object {
  /**
    * Lists the last few versions of the device state in descending order (i.e.:
    * newest first).
    */
  def list(request: Alt): Request[ListDeviceStatesResponse] = js.native
}

object StatesResource {
  @scala.inline
  def apply(list: Alt => Request[ListDeviceStatesResponse]): StatesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[StatesResource]
  }
  @scala.inline
  implicit class StatesResourceOps[Self <: StatesResource] (val x: Self) extends AnyVal {
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
    def setList(value: Alt => Request[ListDeviceStatesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

