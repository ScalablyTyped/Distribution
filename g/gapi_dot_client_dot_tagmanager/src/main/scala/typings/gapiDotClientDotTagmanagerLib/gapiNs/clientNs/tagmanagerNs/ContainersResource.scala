package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainersResource extends js.Object {
  var environments: EnvironmentsResource
  var version_headers: Version_headersResource
  var versions: VersionsResource
  var workspaces: WorkspacesResource
  /** Creates a Container. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Container]
  /** Deletes a Container. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a Container. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Container]
  /** Lists all Containers that belongs to a GTM Account. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListContainersResponse]
  /** Updates a Container. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Container]
}

object ContainersResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Container]
    ],
    delete: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    environments: EnvironmentsResource,
    get: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Container]
    ],
    list: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListContainersResponse]
    ],
    update: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Container]
    ],
    version_headers: Version_headersResource,
    versions: VersionsResource,
    workspaces: WorkspacesResource
  ): ContainersResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, environments = environments, get = get, list = list, update = update, version_headers = version_headers, versions = versions, workspaces = workspaces)
  
    __obj.asInstanceOf[ContainersResource]
  }
}

