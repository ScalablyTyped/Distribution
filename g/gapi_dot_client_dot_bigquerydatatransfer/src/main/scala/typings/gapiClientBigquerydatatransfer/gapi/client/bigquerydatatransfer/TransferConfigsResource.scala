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

trait TransferConfigsResource extends js.Object {
  var runs: RunsResource
  /** Creates a new data transfer configuration. */
  def create(request: AuthorizationCode): Request[TransferConfig]
  /**
    * Deletes a data transfer configuration,
    * including any associated transfer runs and logs.
    */
  def delete(request: Accesstoken): Request[js.Object]
  /** Returns information about a data transfer config. */
  def get(request: Accesstoken): Request[TransferConfig]
  /** Returns information about all data transfers in the project. */
  def list(request: DataSourceIds): Request[ListTransferConfigsResponse]
  /**
    * Updates a data transfer configuration.
    * All fields must be set, even if they are not updated.
    */
  def patch(request: Fields): Request[TransferConfig]
  /**
    * Creates transfer runs for a time range [range_start_time, range_end_time].
    * For each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created.
    * Note that runs are created per UTC time in the time range.
    */
  def scheduleRuns(request: Key): Request[ScheduleTransferRunsResponse]
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
}

