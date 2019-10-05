package typings.gapiDotClientDotStoragetransfer.gapi.client.storagetransfer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotStoragetransfer.Anon_AccesstokenAlt
import typings.gapiDotClientDotStoragetransfer.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotStoragetransfer.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotStoragetransfer.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferJobsResource extends js.Object {
  /** Creates a transfer job that runs periodically. */
  def create(request: Anon_AccesstokenAlt): Request[TransferJob]
  /** Gets a transfer job. */
  def get(request: Anon_AccesstokenAltBearertoken): Request[TransferJob]
  /** Lists transfer jobs. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListTransferJobsResponse]
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect
    * transfer operations that are running already. Updating the scheduling
    * of a job is not allowed.
    */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[TransferJob]
}

object TransferJobsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAlt => Request[TransferJob],
    get: Anon_AccesstokenAltBearertoken => Request[TransferJob],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListTransferJobsResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackFields => Request[TransferJob]
  ): TransferJobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[TransferJobsResource]
  }
}

