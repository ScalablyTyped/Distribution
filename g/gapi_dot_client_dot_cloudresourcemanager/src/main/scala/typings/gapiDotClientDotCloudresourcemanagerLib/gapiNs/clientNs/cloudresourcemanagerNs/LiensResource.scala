package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LiensResource extends js.Object {
  /**
               * Create a Lien which applies to the resource denoted by the `parent` field.
               *
               * Callers of this method will require permission on the `parent` resource.
               * For example, applying to `projects/1234` requires permission
               * `resourcemanager.projects.updateLiens`.
               *
               * NOTE: Some resources may limit the number of Liens which may be applied.
               */
  def create(request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Lien]
  /**
               * Delete a Lien by `name`.
               *
               * Callers of this method will require permission on the `parent` resource.
               * For example, a Lien with a `parent` of `projects/1234` requires permission
               * `resourcemanager.projects.updateLiens`.
               */
  def delete(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
               * List all Liens applied to the `parent` resource.
               *
               * Callers of this method will require permission on the `parent` resource.
               * For example, a Lien with a `parent` of `projects/1234` requires permission
               * `resourcemanager.projects.get`.
               */
  def list(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[ListLiensResponse]
}

