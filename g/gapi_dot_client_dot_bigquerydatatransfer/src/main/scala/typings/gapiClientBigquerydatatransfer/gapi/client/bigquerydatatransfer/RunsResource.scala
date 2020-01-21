package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBigquerydatatransfer.AnonAccesstoken
import typings.gapiClientBigquerydatatransfer.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunsResource extends js.Object {
  var transferLogs: TransferLogsResource
  /** Deletes the specified transfer run. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Returns information about the particular transfer run. */
  def get(request: AnonAccesstoken): Request_[TransferRun]
  /** Returns information about running and completed jobs. */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListTransferRunsResponse]
}

object RunsResource {
  @scala.inline
  def apply(
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[TransferRun],
    list: AnonAccesstokenAltBearertokenCallback => Request_[ListTransferRunsResponse],
    transferLogs: TransferLogsResource
  ): RunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), transferLogs = transferLogs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunsResource]
  }
}

