package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  /** Creates a cluster in a project. */
  def create(request: gapiDotClientDotDataprocLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes a cluster in a project. */
  def delete(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets cluster diagnostic information. After the operation completes, the Operation.response field contains DiagnoseClusterOutputLocation. */
  def diagnose(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets the resource representation for a cluster in a project. */
  def get(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Cluster]
  /** Lists all regions/{region}/clusters in a project. */
  def list(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListClustersResponse]
  /** Updates a cluster in a project. */
  def patch(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotDataprocLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotDataprocLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    diagnose: js.Function1[
      gapiDotClientDotDataprocLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotDataprocLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Cluster]
    ],
    list: js.Function1[
      gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListClustersResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, diagnose = diagnose, get = get, list = list, patch = patch)
  
    __obj.asInstanceOf[ClustersResource]
  }
}

