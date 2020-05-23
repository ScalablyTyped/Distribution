package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainersResource extends js.Object {
  var environments: EnvironmentsResource
  var version_headers: VersionHeadersResource
  var versions: VersionsResource
  var workspaces: WorkspacesResource
  /** Creates a Container. */
  def create(request: Alt): Request[Container]
  /** Deletes a Container. */
  def delete(request: Fields): Request[Unit]
  /** Gets a Container. */
  def get(request: Fields): Request[Container]
  /** Lists all Containers that belongs to a GTM Account. */
  def list(request: Key): Request[ListContainersResponse]
  /** Updates a Container. */
  def update(request: Fingerprint): Request[Container]
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
}

