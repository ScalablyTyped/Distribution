package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Alt
import typings.gapiClientSqladmin.anon.Fields
import typings.gapiClientSqladmin.anon.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupRunsResource extends js.Object {
  /** Deletes the backup taken by a backup run. */
  def delete(request: Alt): Request[Operation] = js.native
  /** Retrieves a resource containing information about a backup run. */
  def get(request: Alt): Request[BackupRun] = js.native
  /** Creates a new backup run on demand. This method is applicable only to Second Generation instances. */
  def insert(request: Fields): Request[Operation] = js.native
  /** Lists all backup runs associated with a given instance and configuration in the reverse chronological order of the enqueued time. */
  def list(request: Instance): Request[BackupRunsListResponse] = js.native
}

object BackupRunsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Operation],
    get: Alt => Request[BackupRun],
    insert: Fields => Request[Operation],
    list: Instance => Request[BackupRunsListResponse]
  ): BackupRunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BackupRunsResource]
  }
  @scala.inline
  implicit class BackupRunsResourceOps[Self <: BackupRunsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Alt => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[BackupRun]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Instance => Request[BackupRunsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

