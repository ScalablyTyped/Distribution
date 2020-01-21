package typings.gapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataproc.AnonAccesstoken
import typings.gapiClientDataproc.AnonAccesstokenAlt
import typings.gapiClientDataproc.AnonAccesstokenAltBearertoken
import typings.gapiClientDataproc.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  /** Creates a cluster in a project. */
  def create(request: AnonAccesstoken): Request_[Operation]
  /** Deletes a cluster in a project. */
  def delete(request: AnonAccesstokenAlt): Request_[Operation]
  /** Gets cluster diagnostic information. After the operation completes, the Operation.response field contains DiagnoseClusterOutputLocation. */
  def diagnose(request: AnonAccesstokenAlt): Request_[Operation]
  /** Gets the resource representation for a cluster in a project. */
  def get(request: AnonAccesstokenAlt): Request_[Cluster]
  /** Lists all regions/{region}/clusters in a project. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListClustersResponse]
  /** Updates a cluster in a project. */
  def patch(request: AnonAccesstokenAltBearertokenCallback): Request_[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Operation],
    delete: AnonAccesstokenAlt => Request_[Operation],
    diagnose: AnonAccesstokenAlt => Request_[Operation],
    get: AnonAccesstokenAlt => Request_[Cluster],
    list: AnonAccesstokenAltBearertoken => Request_[ListClustersResponse],
    patch: AnonAccesstokenAltBearertokenCallback => Request_[Operation]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), diagnose = js.Any.fromFunction1(diagnose), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[ClustersResource]
  }
}

