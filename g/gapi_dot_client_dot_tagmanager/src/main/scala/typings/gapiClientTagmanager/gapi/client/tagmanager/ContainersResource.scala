package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainersResource extends js.Object {
  var environments: EnvironmentsResource = js.native
  var version_headers: VersionHeadersResource = js.native
  var versions: VersionsResource = js.native
  var workspaces: WorkspacesResource = js.native
  /** Creates a Container. */
  def create(request: Alt): Request[Container] = js.native
  /** Deletes a Container. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a Container. */
  def get(request: Fields): Request[Container] = js.native
  /** Lists all Containers that belongs to a GTM Account. */
  def list(request: Key): Request[ListContainersResponse] = js.native
  /** Updates a Container. */
  def update(request: Fingerprint): Request[Container] = js.native
}

object ContainersResource {
  @scala.inline
  def apply(
    create: Alt => Request[Container],
    delete: Fields => Request[Unit],
    environments: EnvironmentsResource,
    get: Fields => Request[Container],
    list: Key => Request[ListContainersResponse],
    update: Fingerprint => Request[Container],
    version_headers: VersionHeadersResource,
    versions: VersionsResource,
    workspaces: WorkspacesResource
  ): ContainersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), environments = environments.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), version_headers = version_headers.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainersResource]
  }
  @scala.inline
  implicit class ContainersResourceOps[Self <: ContainersResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[Container]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setEnvironments(value: EnvironmentsResource): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Fields => Request[Container]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ListContainersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fingerprint => Request[Container]): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setVersion_headers(value: VersionHeadersResource): Self = this.set("version_headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersions(value: VersionsResource): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkspaces(value: WorkspacesResource): Self = this.set("workspaces", value.asInstanceOf[js.Any])
  }
  
}

