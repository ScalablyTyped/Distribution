package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Accesstoken
import typings.gapiClientMonitoring.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Gets a single monitored resource descriptor. This method does not require a Stackdriver account. */
  def get(request: Accesstoken): Request[MonitoredResourceDescriptor] = js.native
  /** Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: Callback): Request[ListMonitoredResourceDescriptorsResponse] = js.native
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(
    get: Accesstoken => Request[MonitoredResourceDescriptor],
    list: Callback => Request[ListMonitoredResourceDescriptorsResponse]
  ): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
  @scala.inline
  implicit class MonitoredResourceDescriptorsResourceOps[Self <: MonitoredResourceDescriptorsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Accesstoken => Request[MonitoredResourceDescriptor]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListMonitoredResourceDescriptorsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

