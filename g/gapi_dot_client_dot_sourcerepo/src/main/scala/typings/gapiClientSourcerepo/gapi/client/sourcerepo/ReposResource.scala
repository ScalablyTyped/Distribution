package typings.gapiClientSourcerepo.gapi.client.sourcerepo

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSourcerepo.anon.Accesstoken
import typings.gapiClientSourcerepo.anon.Alt
import typings.gapiClientSourcerepo.anon.Bearertoken
import typings.gapiClientSourcerepo.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposResource extends js.Object {
  /**
    * Creates a repo in the given project with the given name.
    *
    * If the named repository already exists, `CreateRepo` returns
    * `ALREADY_EXISTS`.
    */
  def create(request: Accesstoken): Request[Repo] = js.native
  /** Deletes a repo. */
  def delete(request: Alt): Request[js.Object] = js.native
  /** Returns information about a repo. */
  def get(request: Alt): Request[Repo] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Bearertoken): Request[Policy] = js.native
  /**
    * Returns all repos belonging to a project. The sizes of the repos are
    * not set by ListRepos.  To get the size of a repo, use GetRepo.
    */
  def list(request: Callback): Request[ListReposResponse] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Bearertoken): Request[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: Bearertoken): Request[TestIamPermissionsResponse] = js.native
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
  @scala.inline
  implicit class ReposResourceOps[Self <: ReposResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Accesstoken => Request[Repo]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Alt => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[Repo]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Bearertoken => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListReposResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Bearertoken => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Bearertoken => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
  }
  
}

