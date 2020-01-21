package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBigquerydatatransfer.AnonAccesstoken
import typings.gapiClientBigquerydatatransfer.AnonAccesstokenAltAuthorizationCode
import typings.gapiClientBigquerydatatransfer.AnonAccesstokenAltAuthorizationCodeBearertoken
import typings.gapiClientBigquerydatatransfer.AnonAccesstokenAltBearertokenCallbackDataSourceIds
import typings.gapiClientBigquerydatatransfer.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferConfigsResource extends js.Object {
  var runs: RunsResource
  /** Creates a new data transfer configuration. */
  def create(request: AnonAccesstokenAltAuthorizationCode): Request_[TransferConfig]
  /**
    * Deletes a data transfer configuration,
    * including any associated transfer runs and logs.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Returns information about a data transfer config. */
  def get(request: AnonAccesstoken): Request_[TransferConfig]
  /** Returns information about all data transfers in the project. */
  def list(request: AnonAccesstokenAltBearertokenCallbackDataSourceIds): Request_[ListTransferConfigsResponse]
  /**
    * Updates a data transfer configuration.
    * All fields must be set, even if they are not updated.
    */
  def patch(request: AnonAccesstokenAltAuthorizationCodeBearertoken): Request_[TransferConfig]
  /**
    * Creates transfer runs for a time range [range_start_time, range_end_time].
    * For each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created.
    * Note that runs are created per UTC time in the time range.
    */
  def scheduleRuns(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[ScheduleTransferRunsResponse]
}

object TransferConfigsResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltAuthorizationCode => Request_[TransferConfig],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[TransferConfig],
    list: AnonAccesstokenAltBearertokenCallbackDataSourceIds => Request_[ListTransferConfigsResponse],
    patch: AnonAccesstokenAltAuthorizationCodeBearertoken => Request_[TransferConfig],
    runs: RunsResource,
    scheduleRuns: AnonAccesstokenAltBearertokenCallbackFields => Request_[ScheduleTransferRunsResponse]
  ): TransferConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), runs = runs.asInstanceOf[js.Any], scheduleRuns = js.Any.fromFunction1(scheduleRuns))
  
    __obj.asInstanceOf[TransferConfigsResource]
  }
}

