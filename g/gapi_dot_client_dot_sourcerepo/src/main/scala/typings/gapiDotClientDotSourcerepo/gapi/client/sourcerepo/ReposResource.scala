package typings.gapiDotClientDotSourcerepo.gapi.client.sourcerepo

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSourcerepo.Anon_Accesstoken
import typings.gapiDotClientDotSourcerepo.Anon_AccesstokenAlt
import typings.gapiDotClientDotSourcerepo.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotSourcerepo.Anon_AccesstokenAltBearertokenCallback
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
  def create(request: Anon_Accesstoken): Request[Repo]
  /** Deletes a repo. */
  def delete(request: Anon_AccesstokenAlt): Request[js.Object]
  /** Returns information about a repo. */
  def get(request: Anon_AccesstokenAlt): Request[Repo]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Anon_AccesstokenAltBearertoken): Request[Policy]
  /**
    * Returns all repos belonging to a project. The sizes of the repos are
    * not set by ListRepos.  To get the size of a repo, use GetRepo.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListReposResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Anon_AccesstokenAltBearertoken): Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: Anon_AccesstokenAltBearertoken): Request[TestIamPermissionsResponse]
}

object ReposResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[Repo],
    delete: Anon_AccesstokenAlt => Request[js.Object],
    get: Anon_AccesstokenAlt => Request[Repo],
    getIamPolicy: Anon_AccesstokenAltBearertoken => Request[Policy],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListReposResponse],
    setIamPolicy: Anon_AccesstokenAltBearertoken => Request[Policy],
    testIamPermissions: Anon_AccesstokenAltBearertoken => Request[TestIamPermissionsResponse]
  ): ReposResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[ReposResource]
  }
}

