package typings.gapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContainer.anon.Accesstoken
import typings.gapiClientContainer.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePoolsResource extends js.Object {
  /** Sets the autoscaling settings of a specific node pool. */
  def autoscaling(request: Accesstoken): Request[Operation]
  /** Creates a node pool for a cluster. */
  def create(request: Alt): Request[Operation]
  /** Deletes a node pool from a cluster. */
  def delete(request: Accesstoken): Request[Operation]
  /** Retrieves the node pool requested. */
  def get(request: Accesstoken): Request[NodePool]
  /** Lists the node pools for a cluster. */
  def list(request: Alt): Request[ListNodePoolsResponse]
  /**
    * Roll back the previously Aborted or Failed NodePool upgrade.
    * This will be an no-op if the last upgrade successfully completed.
    */
  def rollback(request: Accesstoken): Request[Operation]
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: Accesstoken): Request[Operation]
  /** Sets the size of a specific node pool. */
  def setSize(request: Accesstoken): Request[Operation]
  /** Updates the version and/or image type of a specific node pool. */
  def update(request: Accesstoken): Request[Operation]
}

object NodePoolsResource {
  @scala.inline
  def apply(
    autoscaling: Accesstoken => Request[Operation],
    create: Alt => Request[Operation],
    delete: Accesstoken => Request[Operation],
    get: Accesstoken => Request[NodePool],
    list: Alt => Request[ListNodePoolsResponse],
    rollback: Accesstoken => Request[Operation],
    setManagement: Accesstoken => Request[Operation],
    setSize: Accesstoken => Request[Operation],
    update: Accesstoken => Request[Operation]
  ): NodePoolsResource = {
    val __obj = js.Dynamic.literal(autoscaling = js.Any.fromFunction1(autoscaling), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), rollback = js.Any.fromFunction1(rollback), setManagement = js.Any.fromFunction1(setManagement), setSize = js.Any.fromFunction1(setSize), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[NodePoolsResource]
  }
}

