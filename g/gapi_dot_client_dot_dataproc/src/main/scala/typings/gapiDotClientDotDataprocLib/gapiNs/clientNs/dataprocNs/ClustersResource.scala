package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  /** Creates a cluster in a project. */
  def create(request: gapiDotClientDotDataprocLib.Anon_AccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes a cluster in a project. */
  def delete(request: gapiDotClientDotDataprocLib.Anon_AccesstokenPrettyPrintBearertokenProjectId): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets cluster diagnostic information. After the operation completes, the Operation.response field contains DiagnoseClusterOutputLocation. */
  def diagnose(request: gapiDotClientDotDataprocLib.Anon_AccesstokenPrettyPrintBearertokenProjectId): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets the resource representation for a cluster in a project. */
  def get(request: gapiDotClientDotDataprocLib.Anon_AccesstokenPrettyPrintBearertokenProjectId): gapiDotClientLib.gapiNs.clientNs.Request[Cluster]
  /** Lists all regions/{region}/clusters in a project. */
  def list(request: gapiDotClientDotDataprocLib.Anon_AccesstokenPageSizePrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListClustersResponse]
  /** Updates a cluster in a project. */
  def patch(request: gapiDotClientDotDataprocLib.Anon_AccesstokenPrettyPrintBearertokenProjectIdCallback): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

