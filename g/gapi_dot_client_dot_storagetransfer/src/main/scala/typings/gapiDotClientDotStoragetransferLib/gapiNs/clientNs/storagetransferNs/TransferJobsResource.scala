package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferJobsResource extends js.Object {
  /** Creates a transfer job that runs periodically. */
  def create(request: gapiDotClientDotStoragetransferLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[TransferJob]
  /** Gets a transfer job. */
  def get(request: gapiDotClientDotStoragetransferLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[TransferJob]
  /** Lists transfer jobs. */
  def list(request: gapiDotClientDotStoragetransferLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListTransferJobsResponse]
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect
    * transfer operations that are running already. Updating the scheduling
    * of a job is not allowed.
    */
  def patch(request: gapiDotClientDotStoragetransferLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[TransferJob]
}

