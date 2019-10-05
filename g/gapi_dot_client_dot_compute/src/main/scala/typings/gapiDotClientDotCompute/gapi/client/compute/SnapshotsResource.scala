package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserResource
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserSnapshot
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
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot): Request[Operation]
  /** Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserSnapshot): Request[Snapshot]
  /** Retrieves the list of Snapshot resources contained within the specified project. */
  def list(request: Anon_Alt): Request[SnapshotList]
  /** Sets the labels on a snapshot. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserResource): Request[Operation]
}

object SnapshotsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserSnapshot => Request[Snapshot],
    list: Anon_Alt => Request[SnapshotList],
    setLabels: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserResource => Request[Operation]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), setLabels = js.Any.fromFunction1(setLabels))
  
    __obj.asInstanceOf[SnapshotsResource]
  }
}

