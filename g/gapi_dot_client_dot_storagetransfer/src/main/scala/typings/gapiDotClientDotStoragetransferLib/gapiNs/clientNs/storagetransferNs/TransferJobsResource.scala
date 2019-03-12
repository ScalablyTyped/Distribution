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

object TransferJobsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotStoragetransferLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[TransferJob],
    get: gapiDotClientDotStoragetransferLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[TransferJob],
    list: gapiDotClientDotStoragetransferLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[ListTransferJobsResponse],
    patch: gapiDotClientDotStoragetransferLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[TransferJob]
  ): TransferJobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[TransferJobsResource]
  }
}

