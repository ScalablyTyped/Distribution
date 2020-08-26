package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Callback
import typings.gapiClientAppengine.anon.MigrateTraffic
import typings.gapiClientAppengine.anon.Pp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesResource extends js.Object {
  var versions: VersionsResource = js.native
  /** Deletes the specified service and all enclosed versions. */
  def delete(request: Pp): Request[Operation] = js.native
  /** Gets the current configuration of the specified service. */
  def get(request: Pp): Request[Service] = js.native
  /** Lists all the services in the application. */
  def list(request: Callback): Request[ListServicesResponse] = js.native
  /** Updates the configuration of the specified service. */
  def patch(request: MigrateTraffic): Request[Operation] = js.native
}

object ServicesResource {
  @scala.inline
  def apply(
    delete: Pp => Request[Operation],
    get: Pp => Request[Service],
    list: Callback => Request[ListServicesResponse],
    patch: MigrateTraffic => Request[Operation],
    versions: VersionsResource
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesResource]
  }
  @scala.inline
  implicit class ServicesResourceOps[Self <: ServicesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Pp => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Pp => Request[Service]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListServicesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: MigrateTraffic => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setVersions(value: VersionsResource): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
  
}

