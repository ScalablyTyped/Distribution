package typings.gapiClientSourcerepo.gapi.client.sourcerepo

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSourcerepo.anon.Accesstoken
import typings.gapiClientSourcerepo.anon.Alt
import typings.gapiClientSourcerepo.anon.Bearertoken
import typings.gapiClientSourcerepo.anon.Callback
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
  def create(request: Accesstoken): Request[Repo]
  /** Deletes a repo. */
  def delete(request: Alt): Request[js.Object]
  /** Returns information about a repo. */
  def get(request: Alt): Request[Repo]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Bearertoken): Request[Policy]
  /**
    * Returns all repos belonging to a project. The sizes of the repos are
    * not set by ListRepos.  To get the size of a repo, use GetRepo.
    */
  def list(request: Callback): Request[ListReposResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Bearertoken): Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: Bearertoken): Request[TestIamPermissionsResponse]
}

object ReposResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[Repo],
    delete: Alt => Request[js.Object],
    get: Alt => Request[Repo],
    getIamPolicy: Bearertoken => Request[Policy],
    list: Callback => Request[ListReposResponse],
    setIamPolicy: Bearertoken => Request[Policy],
    testIamPermissions: Bearertoken => Request[TestIamPermissionsResponse]
  ): ReposResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[ReposResource]
  }
}

