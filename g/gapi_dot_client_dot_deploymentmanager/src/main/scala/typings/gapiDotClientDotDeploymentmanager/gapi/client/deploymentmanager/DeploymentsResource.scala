package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDeploymentmanager.Anon_Alt
import typings.gapiDotClientDotDeploymentmanager.Anon_AltCreatePolicy
import typings.gapiDotClientDotDeploymentmanager.Anon_AltDeletePolicy
import typings.gapiDotClientDotDeploymentmanager.Anon_AltFields
import typings.gapiDotClientDotDeploymentmanager.Anon_AltFieldsFilter
import typings.gapiDotClientDotDeploymentmanager.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentsResource extends js.Object {
  /** Cancels and removes the preview currently associated with the deployment. */
  def cancelPreview(request: Anon_Alt): Request[Operation]
  /** Deletes a deployment and all of the resources in the deployment. */
  def delete(request: Anon_AltDeletePolicy): Request[Operation]
  /** Gets information about a specific deployment. */
  def get(request: Anon_Alt): Request[Deployment]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Anon_AltFields): Request[Policy]
  /** Creates a deployment and all of the resources described by the deployment manifest. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Lists all deployments for a given project. */
  def list(request: Anon_AltFieldsFilter): Request[DeploymentsListResponse]
  /** Updates a deployment and all of the resources described by the deployment manifest. This method supports patch semantics. */
  def patch(request: Anon_AltCreatePolicy): Request[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Anon_AltFields): Request[Policy]
  /** Stops an ongoing operation. This does not roll back any work that has already been completed, but prevents any new work from being started. */
  def stop(request: Anon_Alt): Request[Operation]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Anon_AltFields): Request[TestPermissionsResponse]
  /** Updates a deployment and all of the resources described by the deployment manifest. */
  def update(request: Anon_AltCreatePolicy): Request[Operation]
}

object DeploymentsResource {
  @scala.inline
  def apply(
    cancelPreview: Anon_Alt => Request[Operation],
    delete: Anon_AltDeletePolicy => Request[Operation],
    get: Anon_Alt => Request[Deployment],
    getIamPolicy: Anon_AltFields => Request[Policy],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[DeploymentsListResponse],
    patch: Anon_AltCreatePolicy => Request[Operation],
    setIamPolicy: Anon_AltFields => Request[Policy],
    stop: Anon_Alt => Request[Operation],
    testIamPermissions: Anon_AltFields => Request[TestPermissionsResponse],
    update: Anon_AltCreatePolicy => Request[Operation]
  ): DeploymentsResource = {
    val __obj = js.Dynamic.literal(cancelPreview = js.Any.fromFunction1(cancelPreview), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), stop = js.Any.fromFunction1(stop), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DeploymentsResource]
  }
}

