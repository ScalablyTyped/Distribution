package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePoolsResource extends js.Object {
  /** Sets the autoscaling settings of a specific node pool. */
  def autoscaling(request: gapiDotClientDotContainerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Creates a node pool for a cluster. */
  def create(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes a node pool from a cluster. */
  def delete(request: gapiDotClientDotContainerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the node pool requested. */
  def get(request: gapiDotClientDotContainerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[NodePool]
  /** Lists the node pools for a cluster. */
  def list(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListNodePoolsResponse]
  /**
    * Roll back the previously Aborted or Failed NodePool upgrade.
    * This will be an no-op if the last upgrade successfully completed.
    */
  def rollback(request: gapiDotClientDotContainerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: gapiDotClientDotContainerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the size of a specific node pool. */
  def setSize(request: gapiDotClientDotContainerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates the version and/or image type of a specific node pool. */
  def update(request: gapiDotClientDotContainerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object NodePoolsResource {
  @scala.inline
  def apply(
    autoscaling: gapiDotClientDotContainerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    create: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    delete: gapiDotClientDotContainerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotContainerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[NodePool],
    list: gapiDotClientDotContainerLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[ListNodePoolsResponse],
    rollback: gapiDotClientDotContainerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    setManagement: gapiDotClientDotContainerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    setSize: gapiDotClientDotContainerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    update: gapiDotClientDotContainerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): NodePoolsResource = {
    val __obj = js.Dynamic.literal(autoscaling = js.Any.fromFunction1(autoscaling), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), rollback = js.Any.fromFunction1(rollback), setManagement = js.Any.fromFunction1(setManagement), setSize = js.Any.fromFunction1(setSize), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[NodePoolsResource]
  }
}

