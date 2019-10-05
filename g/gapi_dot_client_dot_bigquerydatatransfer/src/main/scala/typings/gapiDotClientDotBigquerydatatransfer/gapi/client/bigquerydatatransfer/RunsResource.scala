package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBigquerydatatransfer.Anon_Accesstoken
import typings.gapiDotClientDotBigquerydatatransfer.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunsResource extends js.Object {
  var transferLogs: TransferLogsResource
  /** Deletes the specified transfer run. */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /** Returns information about the particular transfer run. */
  def get(request: Anon_Accesstoken): Request[TransferRun]
  /** Returns information about running and completed jobs. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListTransferRunsResponse]
}

object RunsResource {
  @scala.inline
  def apply(
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[TransferRun],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListTransferRunsResponse],
    transferLogs: TransferLogsResource
  ): RunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), transferLogs = transferLogs)
  
    __obj.asInstanceOf[RunsResource]
  }
}

