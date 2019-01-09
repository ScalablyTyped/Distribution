package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentsResource extends js.Object {
  /** Cancels and removes the preview currently associated with the deployment. */
  def cancelPreview(request: gapiDotClientDotDeploymentmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes a deployment and all of the resources in the deployment. */
  def delete(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltDeletePolicy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets information about a specific deployment. */
  def get(request: gapiDotClientDotDeploymentmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Deployment]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Creates a deployment and all of the resources described by the deployment manifest. */
  def insert(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists all deployments for a given project. */
  def list(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[DeploymentsListResponse]
  /** Updates a deployment and all of the resources described by the deployment manifest. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltCreatePolicy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Stops an ongoing operation. This does not roll back any work that has already been completed, but prevents any new work from being started. */
  def stop(request: gapiDotClientDotDeploymentmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[TestPermissionsResponse]
  /** Updates a deployment and all of the resources described by the deployment manifest. */
  def update(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltCreatePolicy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

