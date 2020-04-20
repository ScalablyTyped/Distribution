package typings.gapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContainer.AnonAccesstoken
import typings.gapiClientContainer.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePoolsResource extends js.Object {
  /** Sets the autoscaling settings of a specific node pool. */
  def autoscaling(request: AnonAccesstoken): Request_[Operation]
  /** Creates a node pool for a cluster. */
  def create(request: AnonAlt): Request_[Operation]
  /** Deletes a node pool from a cluster. */
  def delete(request: AnonAccesstoken): Request_[Operation]
  /** Retrieves the node pool requested. */
  def get(request: AnonAccesstoken): Request_[NodePool]
  /** Lists the node pools for a cluster. */
  def list(request: AnonAlt): Request_[ListNodePoolsResponse]
  /**
    * Roll back the previously Aborted or Failed NodePool upgrade.
    * This will be an no-op if the last upgrade successfully completed.
    */
  def rollback(request: AnonAccesstoken): Request_[Operation]
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: AnonAccesstoken): Request_[Operation]
  /** Sets the size of a specific node pool. */
  def setSize(request: AnonAccesstoken): Request_[Operation]
  /** Updates the version and/or image type of a specific node pool. */
  def update(request: AnonAccesstoken): Request_[Operation]
}

object NodePoolsResource {
  @scala.inline
  def apply(
    autoscaling: AnonAccesstoken => Request_[Operation],
    create: AnonAlt => Request_[Operation],
    delete: AnonAccesstoken => Request_[Operation],
    get: AnonAccesstoken => Request_[NodePool],
    list: AnonAlt => Request_[ListNodePoolsResponse],
    rollback: AnonAccesstoken => Request_[Operation],
    setManagement: AnonAccesstoken => Request_[Operation],
    setSize: AnonAccesstoken => Request_[Operation],
    update: AnonAccesstoken => Request_[Operation]
  ): NodePoolsResource = {
    val __obj = js.Dynamic.literal(autoscaling = js.Any.fromFunction1(autoscaling), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), rollback = js.Any.fromFunction1(rollback), setManagement = js.Any.fromFunction1(setManagement), setSize = js.Any.fromFunction1(setSize), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[NodePoolsResource]
  }
}

