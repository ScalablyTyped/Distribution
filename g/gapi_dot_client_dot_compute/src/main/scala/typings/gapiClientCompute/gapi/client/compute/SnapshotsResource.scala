package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.KeyOauthtoken
import typings.gapiClientCompute.anon.QuotaUserSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotsResource extends js.Object {
  /**
    * Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not necessarily delete all the data on that snapshot. If
    * any data on the snapshot that is marked for deletion is needed for subsequent snapshots, the data will be moved to the next corresponding snapshot.
    *
    * For more information, see Deleting snaphots.
    */
  def delete(request: typings.gapiClientCompute.anon.Snapshot): Request[Operation] = js.native
  /** Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request. */
  def get(request: QuotaUserSnapshot): Request[Snapshot] = js.native
  /** Retrieves the list of Snapshot resources contained within the specified project. */
  def list(request: Alt): Request[SnapshotList] = js.native
  /** Sets the labels on a snapshot. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: KeyOauthtoken): Request[Operation] = js.native
}

object SnapshotsResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.Snapshot => Request[Operation],
    get: QuotaUserSnapshot => Request[Snapshot],
    list: Alt => Request[SnapshotList],
    setLabels: KeyOauthtoken => Request[Operation]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), setLabels = js.Any.fromFunction1(setLabels))
    __obj.asInstanceOf[SnapshotsResource]
  }
  @scala.inline
  implicit class SnapshotsResourceOps[Self <: SnapshotsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.Snapshot => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUserSnapshot => Request[Snapshot]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[SnapshotList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLabels(value: KeyOauthtoken => Request[Operation]): Self = this.set("setLabels", js.Any.fromFunction1(value))
  }
  
}

