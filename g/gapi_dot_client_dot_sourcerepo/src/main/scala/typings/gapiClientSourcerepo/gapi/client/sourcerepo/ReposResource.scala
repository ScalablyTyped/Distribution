package typings.gapiClientSourcerepo.gapi.client.sourcerepo

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSourcerepo.AnonAccesstoken
import typings.gapiClientSourcerepo.AnonAlt
import typings.gapiClientSourcerepo.AnonBearertoken
import typings.gapiClientSourcerepo.AnonCallback
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
  def create(request: AnonAccesstoken): Request_[Repo]
  /** Deletes a repo. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Returns information about a repo. */
  def get(request: AnonAlt): Request_[Repo]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonBearertoken): Request_[Policy]
  /**
    * Returns all repos belonging to a project. The sizes of the repos are
    * not set by ListRepos.  To get the size of a repo, use GetRepo.
    */
  def list(request: AnonCallback): Request_[ListReposResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonBearertoken): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: AnonBearertoken): Request_[TestIamPermissionsResponse]
}

object ReposResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Repo],
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[Repo],
    getIamPolicy: AnonBearertoken => Request_[Policy],
    list: AnonCallback => Request_[ListReposResponse],
    setIamPolicy: AnonBearertoken => Request_[Policy],
    testIamPermissions: AnonBearertoken => Request_[TestIamPermissionsResponse]
  ): ReposResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[ReposResource]
  }
}

