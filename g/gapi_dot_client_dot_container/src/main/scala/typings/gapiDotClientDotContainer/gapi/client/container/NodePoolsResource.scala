package typings.gapiDotClientDotContainer.gapi.client.container

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotContainer.Anon_Accesstoken
import typings.gapiDotClientDotContainer.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePoolsResource extends js.Object {
  /** Sets the autoscaling settings of a specific node pool. */
  def autoscaling(request: Anon_Accesstoken): Request[Operation]
  /** Creates a node pool for a cluster. */
  def create(request: Anon_AccesstokenAlt): Request[Operation]
  /** Deletes a node pool from a cluster. */
  def delete(request: Anon_Accesstoken): Request[Operation]
  /** Retrieves the node pool requested. */
  def get(request: Anon_Accesstoken): Request[NodePool]
  /** Lists the node pools for a cluster. */
  def list(request: Anon_AccesstokenAlt): Request[ListNodePoolsResponse]
  /**
    * Roll back the previously Aborted or Failed NodePool upgrade.
    * This will be an no-op if the last upgrade successfully completed.
    */
  def rollback(request: Anon_Accesstoken): Request[Operation]
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: Anon_Accesstoken): Request[Operation]
  /** Sets the size of a specific node pool. */
  def setSize(request: Anon_Accesstoken): Request[Operation]
  /** Updates the version and/or image type of a specific node pool. */
  def update(request: Anon_Accesstoken): Request[Operation]
}

object NodePoolsResource {
  @scala.inline
  def apply(
    autoscaling: Anon_Accesstoken => Request[Operation],
    create: Anon_AccesstokenAlt => Request[Operation],
    delete: Anon_Accesstoken => Request[Operation],
    get: Anon_Accesstoken => Request[NodePool],
    list: Anon_AccesstokenAlt => Request[ListNodePoolsResponse],
    rollback: Anon_Accesstoken => Request[Operation],
    setManagement: Anon_Accesstoken => Request[Operation],
    setSize: Anon_Accesstoken => Request[Operation],
    update: Anon_Accesstoken => Request[Operation]
  ): NodePoolsResource = {
    val __obj = js.Dynamic.literal(autoscaling = js.Any.fromFunction1(autoscaling), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), rollback = js.Any.fromFunction1(rollback), setManagement = js.Any.fromFunction1(setManagement), setSize = js.Any.fromFunction1(setSize), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[NodePoolsResource]
  }
}

