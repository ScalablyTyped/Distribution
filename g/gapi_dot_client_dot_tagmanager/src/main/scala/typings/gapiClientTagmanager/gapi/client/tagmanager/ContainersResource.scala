package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonAltFields
import typings.gapiClientTagmanager.AnonAltFieldsFingerprint
import typings.gapiClientTagmanager.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainersResource extends js.Object {
  var environments: EnvironmentsResource
  var version_headers: VersionHeadersResource
  var versions: VersionsResource
  var workspaces: WorkspacesResource
  /** Creates a Container. */
  def create(request: AnonAlt): Request_[Container]
  /** Deletes a Container. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets a Container. */
  def get(request: AnonAltFields): Request_[Container]
  /** Lists all Containers that belongs to a GTM Account. */
  def list(request: AnonAltFieldsKey): Request_[ListContainersResponse]
  /** Updates a Container. */
  def update(request: AnonAltFieldsFingerprint): Request_[Container]
}

object ContainersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Container],
    delete: AnonAltFields => Request_[Unit],
    environments: EnvironmentsResource,
    get: AnonAltFields => Request_[Container],
    list: AnonAltFieldsKey => Request_[ListContainersResponse],
    update: AnonAltFieldsFingerprint => Request_[Container],
    version_headers: VersionHeadersResource,
    versions: VersionsResource,
    workspaces: WorkspacesResource
  ): ContainersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), environments = environments.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), version_headers = version_headers.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainersResource]
  }
}

