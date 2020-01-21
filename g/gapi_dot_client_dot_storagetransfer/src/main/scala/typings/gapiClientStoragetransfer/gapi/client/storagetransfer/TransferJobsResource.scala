package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStoragetransfer.AnonAccesstokenAlt
import typings.gapiClientStoragetransfer.AnonAccesstokenAltBearertoken
import typings.gapiClientStoragetransfer.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientStoragetransfer.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferJobsResource extends js.Object {
  /** Creates a transfer job that runs periodically. */
  def create(request: AnonAccesstokenAlt): Request_[TransferJob]
  /** Gets a transfer job. */
  def get(request: AnonAccesstokenAltBearertoken): Request_[TransferJob]
  /** Lists transfer jobs. */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListTransferJobsResponse]
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect
    * transfer operations that are running already. Updating the scheduling
    * of a job is not allowed.
    */
  def patch(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[TransferJob]
}

object TransferJobsResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAlt => Request_[TransferJob],
    get: AnonAccesstokenAltBearertoken => Request_[TransferJob],
    list: AnonAccesstokenAltBearertokenCallback => Request_[ListTransferJobsResponse],
    patch: AnonAccesstokenAltBearertokenCallbackFields => Request_[TransferJob]
  ): TransferJobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[TransferJobsResource]
  }
}

