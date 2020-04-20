package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBigquerydatatransfer.AnonAccesstoken
import typings.gapiClientBigquerydatatransfer.AnonAuthorizationCode
import typings.gapiClientBigquerydatatransfer.AnonDataSourceIds
import typings.gapiClientBigquerydatatransfer.AnonFields
import typings.gapiClientBigquerydatatransfer.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferConfigsResource extends js.Object {
  var runs: RunsResource
  /** Creates a new data transfer configuration. */
  def create(request: AnonAuthorizationCode): Request_[TransferConfig]
  /**
    * Deletes a data transfer configuration,
    * including any associated transfer runs and logs.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Returns information about a data transfer config. */
  def get(request: AnonAccesstoken): Request_[TransferConfig]
  /** Returns information about all data transfers in the project. */
  def list(request: AnonDataSourceIds): Request_[ListTransferConfigsResponse]
  /**
    * Updates a data transfer configuration.
    * All fields must be set, even if they are not updated.
    */
  def patch(request: AnonFields): Request_[TransferConfig]
  /**
    * Creates transfer runs for a time range [range_start_time, range_end_time].
    * For each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created.
    * Note that runs are created per UTC time in the time range.
    */
  def scheduleRuns(request: AnonKey): Request_[ScheduleTransferRunsResponse]
}

object TransferConfigsResource {
  @scala.inline
  def apply(
    create: AnonAuthorizationCode => Request_[TransferConfig],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[TransferConfig],
    list: AnonDataSourceIds => Request_[ListTransferConfigsResponse],
    patch: AnonFields => Request_[TransferConfig],
    runs: RunsResource,
    scheduleRuns: AnonKey => Request_[ScheduleTransferRunsResponse]
  ): TransferConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), runs = runs.asInstanceOf[js.Any], scheduleRuns = js.Any.fromFunction1(scheduleRuns))
    __obj.asInstanceOf[TransferConfigsResource]
  }
}

