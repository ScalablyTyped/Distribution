package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStoragetransfer.anon.Alt
import typings.gapiClientStoragetransfer.anon.Bearertoken
import typings.gapiClientStoragetransfer.anon.Callback
import typings.gapiClientStoragetransfer.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferJobsResource extends js.Object {
  /** Creates a transfer job that runs periodically. */
  def create(request: Alt): Request[TransferJob]
  /** Gets a transfer job. */
  def get(request: Bearertoken): Request[TransferJob]
  /** Lists transfer jobs. */
  def list(request: Callback): Request[ListTransferJobsResponse]
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect
    * transfer operations that are running already. Updating the scheduling
    * of a job is not allowed.
    */
  def patch(request: Fields): Request[TransferJob]
}

object TransferJobsResource {
  @scala.inline
  def apply(
    create: Alt => Request[TransferJob],
    get: Bearertoken => Request[TransferJob],
    list: Callback => Request[ListTransferJobsResponse],
    patch: Fields => Request[TransferJob]
  ): TransferJobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[TransferJobsResource]
  }
}

