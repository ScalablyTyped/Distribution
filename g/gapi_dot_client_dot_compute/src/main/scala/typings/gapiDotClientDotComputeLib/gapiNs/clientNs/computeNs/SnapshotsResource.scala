package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SnapshotsResource extends js.Object {
  /**
               * Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not necessarily delete all the data on that snapshot. If
               * any data on the snapshot that is marked for deletion is needed for subsequent snapshots, the data will be moved to the next corresponding snapshot.
               *
               * For more information, see Deleting snaphots.
               */
  def delete(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenSnapshotAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenSnapshot): gapiDotClientLib.gapiNs.clientNs.Request[Snapshot]
  /** Retrieves the list of Snapshot resources contained within the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[SnapshotList]
  /** Sets the labels on a snapshot. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenResource): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

