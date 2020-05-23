package typings.gapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDataproc.anon.Accesstoken
import typings.gapiClientDataproc.anon.Alt
import typings.gapiClientDataproc.anon.Bearertoken
import typings.gapiClientDataproc.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  /** Creates a cluster in a project. */
  def create(request: Accesstoken): Request[Operation]
  /** Deletes a cluster in a project. */
  def delete(request: Alt): Request[Operation]
  /** Gets cluster diagnostic information. After the operation completes, the Operation.response field contains DiagnoseClusterOutputLocation. */
  def diagnose(request: Alt): Request[Operation]
  /** Gets the resource representation for a cluster in a project. */
  def get(request: Alt): Request[Cluster]
  /** Lists all regions/{region}/clusters in a project. */
  def list(request: Bearertoken): Request[ListClustersResponse]
  /** Updates a cluster in a project. */
  def patch(request: Callback): Request[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[Operation],
    delete: Alt => Request[Operation],
    diagnose: Alt => Request[Operation],
    get: Alt => Request[Cluster],
    list: Bearertoken => Request[ListClustersResponse],
    patch: Callback => Request[Operation]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), diagnose = js.Any.fromFunction1(diagnose), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[ClustersResource]
  }
}

