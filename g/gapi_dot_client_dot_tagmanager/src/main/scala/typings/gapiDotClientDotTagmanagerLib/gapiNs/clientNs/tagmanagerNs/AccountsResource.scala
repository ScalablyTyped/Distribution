package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var containers: ContainersResource
  var user_permissions: User_permissionsResource
  /** Gets a GTM Account. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** Lists all GTM Accounts that a user has access to. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListAccountsResponse]
  /** Updates a GTM Account. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_Fingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Account]
}

