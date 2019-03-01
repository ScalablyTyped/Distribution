package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunsResource extends js.Object {
  var transferLogs: TransferLogsResource
  /** Deletes the specified transfer run. */
  def delete(request: gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Returns information about the particular transfer run. */
  def get(request: gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[TransferRun]
  /** Returns information about running and completed jobs. */
  def list(request: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListTransferRunsResponse]
}

object RunsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[TransferRun]
    ],
    list: js.Function1[
      gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListTransferRunsResponse]
    ],
    transferLogs: TransferLogsResource
  ): RunsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("transferLogs")(transferLogs)
    __obj.asInstanceOf[RunsResource]
  }
}

