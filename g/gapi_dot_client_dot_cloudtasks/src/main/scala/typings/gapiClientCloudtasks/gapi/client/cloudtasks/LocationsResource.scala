package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudtasks.anon.Accesstoken
import typings.gapiClientCloudtasks.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  var queues: QueuesResource = js.native
  /** Get information about a location. */
  def get(request: Accesstoken): Request[Location] = js.native
  /** Lists information about the supported locations for this service. */
  def list(request: Name): Request[ListLocationsResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(
    get: Accesstoken => Request[Location],
    list: Name => Request[ListLocationsResponse],
    queues: QueuesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Accesstoken => Request[Location]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Name => Request[ListLocationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setQueues(value: QueuesResource): Self = this.set("queues", value.asInstanceOf[js.Any])
  }
  
}

