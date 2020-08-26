package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquerydatatransfer.anon.Accesstoken
import typings.gapiClientBigquerydatatransfer.anon.AuthorizationCode
import typings.gapiClientBigquerydatatransfer.anon.DataSourceIds
import typings.gapiClientBigquerydatatransfer.anon.Fields
import typings.gapiClientBigquerydatatransfer.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferConfigsResource extends js.Object {
  var runs: RunsResource = js.native
  /** Creates a new data transfer configuration. */
  def create(request: AuthorizationCode): Request[TransferConfig] = js.native
  /**
    * Deletes a data transfer configuration,
    * including any associated transfer runs and logs.
    */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /** Returns information about a data transfer config. */
  def get(request: Accesstoken): Request[TransferConfig] = js.native
  /** Returns information about all data transfers in the project. */
  def list(request: DataSourceIds): Request[ListTransferConfigsResponse] = js.native
  /**
    * Updates a data transfer configuration.
    * All fields must be set, even if they are not updated.
    */
  def patch(request: Fields): Request[TransferConfig] = js.native
  /**
    * Creates transfer runs for a time range [range_start_time, range_end_time].
    * For each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created.
    * Note that runs are created per UTC time in the time range.
    */
  def scheduleRuns(request: Key): Request[ScheduleTransferRunsResponse] = js.native
}

object TransferConfigsResource {
  @scala.inline
  def apply(
    create: AuthorizationCode => Request[TransferConfig],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[TransferConfig],
    list: DataSourceIds => Request[ListTransferConfigsResponse],
    patch: Fields => Request[TransferConfig],
    runs: RunsResource,
    scheduleRuns: Key => Request[ScheduleTransferRunsResponse]
  ): TransferConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), runs = runs.asInstanceOf[js.Any], scheduleRuns = js.Any.fromFunction1(scheduleRuns))
    __obj.asInstanceOf[TransferConfigsResource]
  }
  @scala.inline
  implicit class TransferConfigsResourceOps[Self <: TransferConfigsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: AuthorizationCode => Request[TransferConfig]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Accesstoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[TransferConfig]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: DataSourceIds => Request[ListTransferConfigsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[TransferConfig]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setRuns(value: RunsResource): Self = this.set("runs", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduleRuns(value: Key => Request[ScheduleTransferRunsResponse]): Self = this.set("scheduleRuns", js.Any.fromFunction1(value))
  }
  
}

