package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStoragetransfer.AnonAlt
import typings.gapiClientStoragetransfer.AnonBearertoken
import typings.gapiClientStoragetransfer.AnonCallback
import typings.gapiClientStoragetransfer.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferJobsResource extends js.Object {
  /** Creates a transfer job that runs periodically. */
  def create(request: AnonAlt): Request_[TransferJob]
  /** Gets a transfer job. */
  def get(request: AnonBearertoken): Request_[TransferJob]
  /** Lists transfer jobs. */
  def list(request: AnonCallback): Request_[ListTransferJobsResponse]
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect
    * transfer operations that are running already. Updating the scheduling
    * of a job is not allowed.
    */
  def patch(request: AnonFields): Request_[TransferJob]
}

object TransferJobsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[TransferJob],
    get: AnonBearertoken => Request_[TransferJob],
    list: AnonCallback => Request_[ListTransferJobsResponse],
    patch: AnonFields => Request_[TransferJob]
  ): TransferJobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[TransferJobsResource]
  }
}

