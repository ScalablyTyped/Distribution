package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBigquerydatatransfer.Anon_Accesstoken
import typings.gapiDotClientDotBigquerydatatransfer.Anon_AccesstokenAltAuthorizationCode
import typings.gapiDotClientDotBigquerydatatransfer.Anon_AccesstokenAltAuthorizationCodeBearertoken
import typings.gapiDotClientDotBigquerydatatransfer.Anon_AccesstokenAltBearertokenCallbackDataSourceIds
import typings.gapiDotClientDotBigquerydatatransfer.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferConfigsResource extends js.Object {
  var runs: RunsResource
  /** Creates a new data transfer configuration. */
  def create(request: Anon_AccesstokenAltAuthorizationCode): Request[TransferConfig]
  /**
    * Deletes a data transfer configuration,
    * including any associated transfer runs and logs.
    */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /** Returns information about a data transfer config. */
  def get(request: Anon_Accesstoken): Request[TransferConfig]
  /** Returns information about all data transfers in the project. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackDataSourceIds): Request[ListTransferConfigsResponse]
  /**
    * Updates a data transfer configuration.
    * All fields must be set, even if they are not updated.
    */
  def patch(request: Anon_AccesstokenAltAuthorizationCodeBearertoken): Request[TransferConfig]
  /**
    * Creates transfer runs for a time range [range_start_time, range_end_time].
    * For each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created.
    * Note that runs are created per UTC time in the time range.
    */
  def scheduleRuns(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ScheduleTransferRunsResponse]
}

object TransferConfigsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltAuthorizationCode => Request[TransferConfig],
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[TransferConfig],
    list: Anon_AccesstokenAltBearertokenCallbackDataSourceIds => Request[ListTransferConfigsResponse],
    patch: Anon_AccesstokenAltAuthorizationCodeBearertoken => Request[TransferConfig],
    runs: RunsResource,
    scheduleRuns: Anon_AccesstokenAltBearertokenCallbackFields => Request[ScheduleTransferRunsResponse]
  ): TransferConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), runs = runs.asInstanceOf[js.Any], scheduleRuns = js.Any.fromFunction1(scheduleRuns))
  
    __obj.asInstanceOf[TransferConfigsResource]
  }
}

