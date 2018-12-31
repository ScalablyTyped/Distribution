package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOperationMetadata extends js.Object {
  /** Output-only. Name of the cluster for the operation. */
  var clusterName: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. Cluster UUID for the operation. */
  var clusterUuid: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. Short description of operation. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. Labels associated with the operation */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Output-only. The operation type. */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. Current operation status. */
  var status: js.UndefOr[ClusterOperationStatus] = js.undefined
  /** Output-only. The previous operation status. */
  var statusHistory: js.UndefOr[js.Array[ClusterOperationStatus]] = js.undefined
  /** Output-only. Errors encountered during operation execution. */
  var warnings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

