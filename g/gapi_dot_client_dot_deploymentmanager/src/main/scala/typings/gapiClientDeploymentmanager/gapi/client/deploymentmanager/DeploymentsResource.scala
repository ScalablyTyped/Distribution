package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDeploymentmanager.AnonAlt
import typings.gapiClientDeploymentmanager.AnonCreatePolicy
import typings.gapiClientDeploymentmanager.AnonDeletePolicy
import typings.gapiClientDeploymentmanager.AnonFields
import typings.gapiClientDeploymentmanager.AnonFilter
import typings.gapiClientDeploymentmanager.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentsResource extends js.Object {
  /** Cancels and removes the preview currently associated with the deployment. */
  def cancelPreview(request: AnonAlt): Request_[Operation]
  /** Deletes a deployment and all of the resources in the deployment. */
  def delete(request: AnonDeletePolicy): Request_[Operation]
  /** Gets information about a specific deployment. */
  def get(request: AnonAlt): Request_[Deployment]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonFields): Request_[Policy]
  /** Creates a deployment and all of the resources described by the deployment manifest. */
  def insert(request: AnonOauthtoken): Request_[Operation]
  /** Lists all deployments for a given project. */
  def list(request: AnonFilter): Request_[DeploymentsListResponse]
  /** Updates a deployment and all of the resources described by the deployment manifest. This method supports patch semantics. */
  def patch(request: AnonCreatePolicy): Request_[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonFields): Request_[Policy]
  /** Stops an ongoing operation. This does not roll back any work that has already been completed, but prevents any new work from being started. */
  def stop(request: AnonAlt): Request_[Operation]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonFields): Request_[TestPermissionsResponse]
  /** Updates a deployment and all of the resources described by the deployment manifest. */
  def update(request: AnonCreatePolicy): Request_[Operation]
}

object DeploymentsResource {
  @scala.inline
  def apply(
    cancelPreview: AnonAlt => Request_[Operation],
    delete: AnonDeletePolicy => Request_[Operation],
    get: AnonAlt => Request_[Deployment],
    getIamPolicy: AnonFields => Request_[Policy],
    insert: AnonOauthtoken => Request_[Operation],
    list: AnonFilter => Request_[DeploymentsListResponse],
    patch: AnonCreatePolicy => Request_[Operation],
    setIamPolicy: AnonFields => Request_[Policy],
    stop: AnonAlt => Request_[Operation],
    testIamPermissions: AnonFields => Request_[TestPermissionsResponse],
    update: AnonCreatePolicy => Request_[Operation]
  ): DeploymentsResource = {
    val __obj = js.Dynamic.literal(cancelPreview = js.Any.fromFunction1(cancelPreview), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), stop = js.Any.fromFunction1(stop), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DeploymentsResource]
  }
}

