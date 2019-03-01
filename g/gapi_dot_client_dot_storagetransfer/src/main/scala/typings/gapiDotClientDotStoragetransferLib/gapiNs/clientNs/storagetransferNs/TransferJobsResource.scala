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
    create: js.Function1[
      gapiDotClientDotStoragetransferLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TransferJob]
    ],
    get: js.Function1[
      gapiDotClientDotStoragetransferLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[TransferJob]
    ],
    list: js.Function1[
      gapiDotClientDotStoragetransferLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListTransferJobsResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotStoragetransferLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[TransferJob]
    ]
  ): TransferJobsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[TransferJobsResource]
  }
}

