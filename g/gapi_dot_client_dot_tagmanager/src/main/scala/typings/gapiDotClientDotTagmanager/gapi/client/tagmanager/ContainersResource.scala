package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsFingerprint
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainersResource extends js.Object {
  var environments: EnvironmentsResource
  var version_headers: Version_headersResource
  var versions: VersionsResource
  var workspaces: WorkspacesResource
  /** Creates a Container. */
  def create(request: Anon_Alt): Request[Container]
  /** Deletes a Container. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets a Container. */
  def get(request: Anon_AltFields): Request[Container]
  /** Lists all Containers that belongs to a GTM Account. */
  def list(request: Anon_AltFieldsKey): Request[ListContainersResponse]
  /** Updates a Container. */
  def update(request: Anon_AltFieldsFingerprint): Request[Container]
}

object ContainersResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Container],
    delete: Anon_AltFields => Request[Unit],
    environments: EnvironmentsResource,
    get: Anon_AltFields => Request[Container],
    list: Anon_AltFieldsKey => Request[ListContainersResponse],
    update: Anon_AltFieldsFingerprint => Request[Container],
    version_headers: Version_headersResource,
    versions: VersionsResource,
    workspaces: WorkspacesResource
  ): ContainersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), environments = environments.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), version_headers = version_headers.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainersResource]
  }
}

