package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferConfigsResource extends js.Object {
  var runs: RunsResource
  /** Creates a new data transfer configuration. */
  def create(request: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltAuthorizationCode): gapiDotClientLib.gapiNs.clientNs.Request[TransferConfig]
  /**
    * Deletes a data transfer configuration,
    * including any associated transfer runs and logs.
    */
  def delete(request: gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Returns information about a data transfer config. */
  def get(request: gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[TransferConfig]
  /** Returns information about all data transfers in the project. */
  def list(
    request: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertokenCallbackDataSourceIds
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListTransferConfigsResponse]
  /**
    * Updates a data transfer configuration.
    * All fields must be set, even if they are not updated.
    */
  def patch(request: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltAuthorizationCodeBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[TransferConfig]
  /**
    * Creates transfer runs for a time range [range_start_time, range_end_time].
    * For each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created.
    * Note that runs are created per UTC time in the time range.
    */
  def scheduleRuns(request: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ScheduleTransferRunsResponse]
}

object TransferConfigsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltAuthorizationCode => gapiDotClientLib.gapiNs.clientNs.Request[TransferConfig],
    delete: gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[TransferConfig],
    list: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertokenCallbackDataSourceIds => gapiDotClientLib.gapiNs.clientNs.Request[ListTransferConfigsResponse],
    patch: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltAuthorizationCodeBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[TransferConfig],
    runs: RunsResource,
    scheduleRuns: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[ScheduleTransferRunsResponse]
  ): TransferConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), runs = runs, scheduleRuns = js.Any.fromFunction1(scheduleRuns))
  
    __obj.asInstanceOf[TransferConfigsResource]
  }
}

