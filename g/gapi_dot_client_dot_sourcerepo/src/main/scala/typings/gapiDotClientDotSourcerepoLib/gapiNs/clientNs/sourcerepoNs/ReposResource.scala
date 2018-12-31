package typings
package gapiDotClientDotSourcerepoLib.gapiNs.clientNs.sourcerepoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposResource extends js.Object {
  /**
    * Creates a repo in the given project with the given name.
    *
    * If the named repository already exists, `CreateRepo` returns
    * `ALREADY_EXISTS`.
    */
  def create(request: gapiDotClientDotSourcerepoLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[Repo]
  /** Deletes a repo. */
  def delete(request: gapiDotClientDotSourcerepoLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Returns information about a repo. */
  def get(request: gapiDotClientDotSourcerepoLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[Repo]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: gapiDotClientDotSourcerepoLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Returns all repos belonging to a project. The sizes of the repos are
    * not set by ListRepos.  To get the size of a repo, use GetRepo.
    */
  def list(request: gapiDotClientDotSourcerepoLib.Anon_NameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListReposResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: gapiDotClientDotSourcerepoLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: gapiDotClientDotSourcerepoLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
}

