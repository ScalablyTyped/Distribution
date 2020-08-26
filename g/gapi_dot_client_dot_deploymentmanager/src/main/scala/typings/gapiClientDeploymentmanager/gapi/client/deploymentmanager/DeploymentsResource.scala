package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDeploymentmanager.anon.Alt
import typings.gapiClientDeploymentmanager.anon.CreatePolicy
import typings.gapiClientDeploymentmanager.anon.DeletePolicy
import typings.gapiClientDeploymentmanager.anon.Fields
import typings.gapiClientDeploymentmanager.anon.Filter
import typings.gapiClientDeploymentmanager.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentsResource extends js.Object {
  /** Cancels and removes the preview currently associated with the deployment. */
  def cancelPreview(request: Alt): Request[Operation] = js.native
  /** Deletes a deployment and all of the resources in the deployment. */
  def delete(request: DeletePolicy): Request[Operation] = js.native
  /** Gets information about a specific deployment. */
  def get(request: Alt): Request[Deployment] = js.native
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  /** Creates a deployment and all of the resources described by the deployment manifest. */
  def insert(request: Oauthtoken): Request[Operation] = js.native
  /** Lists all deployments for a given project. */
  def list(request: Filter): Request[DeploymentsListResponse] = js.native
  /** Updates a deployment and all of the resources described by the deployment manifest. This method supports patch semantics. */
  def patch(request: CreatePolicy): Request[Operation] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Fields): Request[Policy] = js.native
  /** Stops an ongoing operation. This does not roll back any work that has already been completed, but prevents any new work from being started. */
  def stop(request: Alt): Request[Operation] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Fields): Request[TestPermissionsResponse] = js.native
  /** Updates a deployment and all of the resources described by the deployment manifest. */
  def update(request: CreatePolicy): Request[Operation] = js.native
}

object DeploymentsResource {
  @scala.inline
  def apply(
    cancelPreview: Alt => Request[Operation],
    delete: DeletePolicy => Request[Operation],
    get: Alt => Request[Deployment],
    getIamPolicy: Fields => Request[Policy],
    insert: Oauthtoken => Request[Operation],
    list: Filter => Request[DeploymentsListResponse],
    patch: CreatePolicy => Request[Operation],
    setIamPolicy: Fields => Request[Policy],
    stop: Alt => Request[Operation],
    testIamPermissions: Fields => Request[TestPermissionsResponse],
    update: CreatePolicy => Request[Operation]
  ): DeploymentsResource = {
    val __obj = js.Dynamic.literal(cancelPreview = js.Any.fromFunction1(cancelPreview), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), stop = js.Any.fromFunction1(stop), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DeploymentsResource]
  }
  @scala.inline
  implicit class DeploymentsResourceOps[Self <: DeploymentsResource] (val x: Self) extends AnyVal {
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
    def setCancelPreview(value: Alt => Request[Operation]): Self = this.set("cancelPreview", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: DeletePolicy => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[Deployment]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Fields => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Oauthtoken => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[DeploymentsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: CreatePolicy => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Fields => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: Alt => Request[Operation]): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Fields => Request[TestPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: CreatePolicy => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

