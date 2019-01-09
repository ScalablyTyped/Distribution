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

