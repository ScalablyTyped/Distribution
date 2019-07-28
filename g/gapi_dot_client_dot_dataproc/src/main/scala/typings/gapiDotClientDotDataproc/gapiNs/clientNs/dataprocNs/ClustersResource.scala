package typings.gapiDotClientDotDataproc.gapiNs.clientNs.dataprocNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDataproc.Anon_Accesstoken
import typings.gapiDotClientDotDataproc.Anon_AccesstokenAlt
import typings.gapiDotClientDotDataproc.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotDataproc.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  /** Creates a cluster in a project. */
  def create(request: Anon_Accesstoken): Request[Operation]
  /** Deletes a cluster in a project. */
  def delete(request: Anon_AccesstokenAlt): Request[Operation]
  /** Gets cluster diagnostic information. After the operation completes, the Operation.response field contains DiagnoseClusterOutputLocation. */
  def diagnose(request: Anon_AccesstokenAlt): Request[Operation]
  /** Gets the resource representation for a cluster in a project. */
  def get(request: Anon_AccesstokenAlt): Request[Cluster]
  /** Lists all regions/{region}/clusters in a project. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListClustersResponse]
  /** Updates a cluster in a project. */
  def patch(request: Anon_AccesstokenAltBearertokenCallback): Request[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[Operation],
    delete: Anon_AccesstokenAlt => Request[Operation],
    diagnose: Anon_AccesstokenAlt => Request[Operation],
    get: Anon_AccesstokenAlt => Request[Cluster],
    list: Anon_AccesstokenAltBearertoken => Request[ListClustersResponse],
    patch: Anon_AccesstokenAltBearertokenCallback => Request[Operation]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), diagnose = js.Any.fromFunction1(diagnose), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[ClustersResource]
  }
}

