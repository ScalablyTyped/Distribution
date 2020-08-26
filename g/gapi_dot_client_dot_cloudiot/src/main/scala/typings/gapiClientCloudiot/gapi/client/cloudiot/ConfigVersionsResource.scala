package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudiot.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigVersionsResource extends js.Object {
  /**
    * Lists the last few versions of the device configuration in descending
    * order (i.e.: newest first).
    */
  def list(request: Accesstoken): Request[ListDeviceConfigVersionsResponse] = js.native
}

object ConfigVersionsResource {
  @scala.inline
  def apply(list: Accesstoken => Request[ListDeviceConfigVersionsResponse]): ConfigVersionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ConfigVersionsResource]
  }
  @scala.inline
  implicit class ConfigVersionsResourceOps[Self <: ConfigVersionsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Accesstoken => Request[ListDeviceConfigVersionsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

